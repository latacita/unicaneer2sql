package es.unican.moses.sle.db.eer2sql.diagram.custom.popup.actions;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.BuildListener;
import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.osgi.framework.Bundle;



public class doCodeGeneration implements IObjectActionDelegate {

	private Shell shell;
	
	/**
	 * Constructor for Action1.
	 */
	public doCodeGeneration() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		MessageDialog.openInformation(
			shell,
			"Moses Research Group",
			"EER Code Generation was executed.");
		
		action();
		
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

	
	/**
	 * Implements the actions to be carried out when the Generate Code action is invoked 
	 */
	public void action(){
		
		// We look for the ANT file to be executed.
		File buildFile = findEer2RelationalLauncher();
		
		Project p = new Project();
		p.setUserProperty("ant.file",buildFile.getAbsolutePath());		
		DefaultLogger consoleLogger = new DefaultLogger();
		consoleLogger.setErrorPrintStream(System.err);
		consoleLogger.setOutputPrintStream(System.out);
		consoleLogger.setMessageOutputLevel(Project.MSG_INFO);
		p.addBuildListener(consoleLogger);

		try {
			p.fireBuildStarted();
			p.init();
			ProjectHelper helper = ProjectHelper.getProjectHelper();
			p.addReference("ant.projectHelper", helper);
			helper.parse(p, buildFile);
			p.executeTarget(p.getDefaultTarget());
			p.fireBuildFinished(null);
		} catch (BuildException e) {
			p.fireBuildFinished(e);
		}
		
		
	}

	/**
	 * Looks for the ANT file to be invoked for transforming a EER model into a relational
	 * one 
	 * @return The file containing such an ANT file 
	 */
	private File findEer2RelationalLauncher() {

		// We search for the XML file containing the ANT task to be launched
		Bundle bundle = Platform.getBundle("es.unican.moses.transformations.db.eer2relational");
	    Path path = new Path("Transformations/launchEer2Relational.xml");
	    URL launcherURL = FileLocator.find(bundle, path, null);
	    
	    // We convert the URL to a URL using the file protocol 
	    URL launcherFileURL = null;
		try {
			launcherFileURL = FileLocator.toFileURL(launcherURL);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			// Completa esta excepcion 
			e2.printStackTrace();
		} // 
	    
	    System.out.println("Path = " + launcherFileURL.toString());
	        		
		File buildFile = null;
		try {
			buildFile = new File(launcherFileURL.toURI());
		} catch (URISyntaxException e1) {
			// Cambia esto por una ventana que informe del error
			System.out.println("The file for launching the transformation can not be found." +
					"This is probably due to an installation error");	
			e1.printStackTrace();
		}
		return buildFile;
	}
}

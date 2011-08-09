package es.unican.moses.sle.db.eer2sql.diagram.custom.popup.actions;

import java.awt.Dialog;
import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import org.eclipse.ant.core.AntRunner;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.osgi.framework.Bundle;

public class doCodeGeneration implements IObjectActionDelegate {

	private Shell shell;
	private Frame errorDialog = new ErrorDialog("Error");
	private enum Step {STEP1,STEP2};
	
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
		
		//new AddressWindow();

		IProgressMonitor monitor = null;
		AntRunner runner1 = new AntRunner();
		AntRunner runner2 = new AntRunner();
		File buildFile1 = findEer2RelationalLauncher(Step.STEP1);
		File buildFile2 = findEer2RelationalLauncher(Step.STEP2);
		runner1.setBuildFileLocation(buildFile1.getAbsolutePath());
		runner2.setBuildFileLocation(buildFile2.getAbsolutePath());
		runner1.setArguments("-Dmessage=Building -verbose");
		runner2.setArguments("-Dmessage=Building -verbose");
		try {
			runner1.run(monitor);
			runner2.run(monitor);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*	// We look for the ANT file to be executed.
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
		 */

	}

	/**
	 * Looks for the ANT file to be invoked for transforming a EER model into a relational
	 * one or a Relational model into a SQL code
	 * @param step: enumerate which indicates that step plays
	 * @return The file containing such an ANT file 
	 */
	private File findEer2RelationalLauncher(Step step) {

		// We search for the XML file containing the ANT task to be launched
		Bundle bundle = Platform.getBundle("es.unican.moses.transformations.db.eer2relational");
		Path path = null;
		if(step == Step.STEP1){
			path = new Path("Transformations/launchEer2Relational.xml");
		}else{
			path = new Path("Transformations/launchRelational2Sql.xml");
		}
		URL launcherURL = FileLocator.find(bundle, path, null);

		// We convert the URL to a URL using the file protocol 
		URL launcherFileURL = null;
		try {
			launcherFileURL = FileLocator.toFileURL(launcherURL);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} // 

		System.out.println("Path = " + launcherFileURL.toString());

		File buildFile = null;
		try {
			buildFile = new File(launcherFileURL.toURI());
		} catch (URISyntaxException e1) {
			errorDialog.setVisible(true);
			e1.printStackTrace();
		}
		return buildFile;
	}
}

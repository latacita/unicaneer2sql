package es.unican.moses.sle.db.eer2sql.diagram.custom.popup.actions;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Class ErrorDialog.</br>
 * 
 * @author Adrian Fernandez San Marcos
 * @version 09-08-2011
 *
 */
public class ErrorDialog extends Frame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor.
	 * @param title: String with the name of the dialog.</br>
	 */
	public ErrorDialog(String title){
		//set the title
		setTitle(title);
		//set the window listener
		addWindowListener(new WindowClosingListener());
		//set properties
		setLayout(new FlowLayout());
		setBackground(new Color(240,240,240));
		setLocation(300,300);
		setSize(600,100);
		
		//create a new panel
		Panel p1 = new Panel();
		p1.setLayout(new FlowLayout());
		Label labelError = new Label();
		//set the message
		labelError.setText("The file for launching the transformation can not be found." +
						   "This is probably due to an installation error");
		p1.add(labelError);
		//add the panel to dialog
		add(p1);
		setResizable(false);
	}
	
	/**
	 * Class WindowClosingListener.</br>
	 * @author Adrian Fernandez San Marcos
	 * @version 09-08-2011
	 *
	 */
	class WindowClosingListener extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			setVisible(false);
		}
	}
}

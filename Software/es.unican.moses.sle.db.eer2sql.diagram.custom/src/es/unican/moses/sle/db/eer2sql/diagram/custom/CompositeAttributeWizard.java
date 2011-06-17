package es.unican.moses.sle.db.eer2sql.diagram.custom;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.border.BevelBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;

import es.unican.moses.sle.db.eer2sql.diagram.custom.commands.CreateCompositeAttributeinCompositeAttributeCommand;
import es.unican.moses.sle.db.eer2sql.diagram.custom.commands.CreateSingleAttributeinCompositeAttributeCommand;
import es.unican.moses.sle.db.eer2sql.diagram.custom.commands.DeleteCompositeAttributeinCompositeAttributeCommand;
import es.unican.moses.sle.db.eer2sql.diagram.custom.commands.DeleteSingleAttributeinCompositeAttributeCommand;
import es.unican.moses.sle.db.eer2sql.diagram.custom.commands.UpdateCompositeAttributeinCompositeAttributeCommand;
import es.unican.moses.sle.db.eer2sql.diagram.custom.commands.UpdateSingleAttributeinCompositeAttributeCommand;

import EER.CompositeAttribute;
import EER.Domain;
import EER.Project;
import EER.SingleAttribute;


/**
 * Class RelationshipWizard.</br>
 * Generate a dialog to add, update or delete attributes of a composite attribute.
 * 
 * @author: Adrian Fernandez San Marcos
 * @version: 16/06/2011
 */
@SuppressWarnings("serial")
public class CompositeAttributeWizard extends JDialog {
	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	private JPanel panel1;
	private JPanel panel2;
	private JScrollPane jScrollPane;
	private JLabel nullableLabel;
	private JLabel derivateLabel;
	private JLabel nameLabel;
	private JLabel propertiesLabel;
	private JPanel panel3;
	private JButton deleteButton;
	private JTextField nameText;
	private JTextField multiplicityText;
	private JButton exitButton;
	private JButton saveButton;
	private JPanel panel4;
	private JComboBox domainCombo;
	private JComboBox derivateCombo;
	private JComboBox nullableCombo;
	private JLabel jLabel1;
	private JLabel multiplicityLabel;
	private JLabel domainLabel;
	private JButton newCompositeAttributeButton;
	private JButton newSingleAttributeButton;
	private JList attributesList;
	private JLabel attributesLabel;

	private int indexList = 0;
	private String title;
	private JDialog owner = this;
	
	private ListModel attributesListModel;
	private ComboBoxModel domainComboModel;
	private ComboBoxModel nullableComboModel = 
		new DefaultComboBoxModel(
				new String[] { "true", "false" });
	private ComboBoxModel derivateComboModel = 
		new DefaultComboBoxModel(
				new String[] { "true", "false" });

	protected EditPart editpart;
	protected Project project;
	protected Node node;
	protected CompositeAttribute element;
	protected Diagram diagram;
	protected EList<Domain> domains;
	protected TransactionalEditingDomain TEDomain;


	/**
	 * Constructor RelationshipWizard.</br>
	 * Generate the dialog.
	 * 
	 * @param owner: JFrame owner.
	 * @param editpart
	 * @param element: CompositeAttribute.
	 */
	public CompositeAttributeWizard(JFrame owner,EditPart editpart, CompositeAttribute element){
		super(owner, true);
		initialize(editpart, element);
	}
	
	/**
	 * Constructor RelationshipWizard.</br>
	 * Generate the dialog.
	 * 
	 * @param owner : JDialog owner.
	 * @param editpart
	 * @param element : CompositeAttribute.
	 */
	public CompositeAttributeWizard(JDialog owner,EditPart editpart, CompositeAttribute element){
		super(owner, true);
		initialize(editpart, element);
	}

	/**
	 * Method initialize.</br>
	 * Initializes the params of the dialog and the model.
	 * 
	 * @param editpart
	 * @param element : CompositeAttribute.
	 */
	private void initialize(EditPart editpart, CompositeAttribute element){
		//access to model
		this.editpart = editpart;
		node = (Node) editpart.getModel();
		diagram = node.getDiagram();
		this.element = element;
		project = (Project) diagram.getElement();
		domains = project.getDomains();
		TEDomain = TransactionUtil.getEditingDomain(element);

		this.title = "Composite attribute " + element.getName();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		pack();
		setResizable(false);
		initGUI();
		setVisible(true);
		dispose();
	}

	/**
	 * Method initGUI.</br>
	 * Initialize the Dialog.
	 */
	private void initGUI() {
		try {
			this.setPreferredSize(new java.awt.Dimension(527, 558));
			this.setBounds(0, 0, 527, 558);
			FlowLayout thisLayout = new FlowLayout();
			this.setLayout(thisLayout);
			this.setTitle(title);
			this.setBackground(new java.awt.Color(240,240,240));
			this.setMaximumSize(new java.awt.Dimension(527, 588));
			{
				panel1 = new JPanel();
				this.add(panel1);
				panel1.setPreferredSize(new java.awt.Dimension(480, 167));
				panel1.setLayout(null);
				panel1.setBackground(new java.awt.Color(240,240,240));
				{
					attributesLabel = new JLabel();
					panel1.add(attributesLabel, "North");
					attributesLabel.setText("Attributes");
					attributesLabel.setBounds(12, 5, 62, 16);
					attributesLabel.setFont(new java.awt.Font("Segoe UI",1,12));
				}
				{
					jScrollPane = new JScrollPane();
					panel1.add(jScrollPane);
					jScrollPane.setBounds(12, 27, 451, 140);

					{
						attributesList = new JList();
						jScrollPane.setViewportView(attributesList);
						updateAttributesList();
						attributesList.setSelectedIndex(indexList);
						attributesList.addListSelectionListener(new ListSelectionListener(){
							public void valueChanged(ListSelectionEvent evt) {
								if (evt.getValueIsAdjusting())
									return;
								updateAttributesValues();
							}
						});
						attributesList.addMouseListener(new MouseAdapter() {
						    public void mouseClicked(MouseEvent evt) {
						        JList list = (JList)evt.getSource();
						        if (evt.getClickCount() == 2) {          // Double-click
						            // Get item index
						            indexList = list.locationToIndex(evt.getPoint());
						            if(element.getSinglesAttributes().get(indexList).eClass().getName().equalsIgnoreCase("CompositeAttribute")){
						            	new CompositeAttributeWizard(owner, editpart, (CompositeAttribute) element.getSinglesAttributes().get(indexList));
						            }
						        } 
						    }
						});
					}					
				}
			}
			{
				panel2 = new JPanel();
				this.add(panel2);
				panel2.setPreferredSize(new java.awt.Dimension(473, 67));
				panel2.setLayout(null);
				panel2.setBackground(new java.awt.Color(240,240,240));
				{
					newSingleAttributeButton = new JButton();
					panel2.add(newSingleAttributeButton);
					newSingleAttributeButton.setText("New single attribute");
					newSingleAttributeButton.setBounds(10, 15, 130, 23);
					newSingleAttributeButton.setBackground(new java.awt.Color(210,210,210));
					newSingleAttributeButton.setMargin(new java.awt.Insets(1, 1, 1, 1));
					//newSingleAttribute button listener 
					newSingleAttributeButton.addActionListener(
							new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									addNewSingleAttribute();
								}
							}
					);
				}
				{
					newCompositeAttributeButton = new JButton();
					panel2.add(newCompositeAttributeButton);
					newCompositeAttributeButton.setText("New composite attribute");
					newCompositeAttributeButton.setBounds(176, 15, 155, 23);
					newCompositeAttributeButton.setBackground(new java.awt.Color(210,210,210));
					newCompositeAttributeButton.setMargin(new java.awt.Insets(1, 1, 1, 1));
					//newCompositeAttribute button listener 
					newCompositeAttributeButton.addActionListener(
							new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									addNewCompositeAttribute();
								}
							}
					);
				}
				{
					deleteButton = new JButton();
					panel2.add(deleteButton);
					deleteButton.setText("Delete attribute");
					deleteButton.setBounds(360, 15, 105, 23);
					deleteButton.setBackground(new java.awt.Color(210,210,210));
					deleteButton.setMargin(new java.awt.Insets(1, 1, 1, 1));
					deleteButton.addActionListener(
							new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									deleteAttribute();
								}
							}
					);
				}
			}
			{
				panel3 = new JPanel();
				this.add(panel3);
				panel3.setLayout(null);
				panel3.setPreferredSize(new java.awt.Dimension(460, 213));
				panel3.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
				panel3.setBackground(new java.awt.Color(240,240,240));
				{
					propertiesLabel = new JLabel();
					panel3.add(propertiesLabel);
					propertiesLabel.setText("Properties");
					propertiesLabel.setBounds(9, 5, 236, 31);
					propertiesLabel.setFont(new java.awt.Font("Segoe UI",1,12));
				}
				{
					jLabel1 = new JLabel();
					panel3.add(jLabel1);
					jLabel1.setBounds(241, 0, 236, 31);
				}
				{
					nameLabel = new JLabel();
					panel3.add(nameLabel);
					nameLabel.setText("Name:");
					nameLabel.setBounds(10, 36, 236, 31);
				}
				{
					nameText = new JTextField();
					panel3.add(nameText);
					nameText.setBounds(137, 41, 339, 20);
					nameText.setSize(315, 20);
				}
				{
					nullableLabel = new JLabel();
					panel3.add(nullableLabel);
					nullableLabel.setText("Nullable:");
					nullableLabel.setBounds(10, 72, 236, 31);
				}
				{
					nullableCombo = new JComboBox();
					panel3.add(nullableCombo);
					nullableCombo.setModel(nullableComboModel);
					nullableCombo.setBounds(136, 77, 340, 20);
					nullableCombo.setSize(315, 20);
					nullableCombo.setBackground(new java.awt.Color(210,210,210));
					nullableCombo.setSelectedIndex(0);
				}
				{
					derivateLabel = new JLabel();
					panel3.add(derivateLabel);
					derivateLabel.setText("Derivate:");
					derivateLabel.setBounds(10, 108, 236, 31);
				}
				{
					derivateCombo = new JComboBox();
					panel3.add(derivateCombo);
					derivateCombo.setModel(derivateComboModel);
					derivateCombo.setBounds(136, 113, 340, 20);
					derivateCombo.setSize(315, 20);
					derivateCombo.setBackground(new java.awt.Color(210,210,210));
					derivateCombo.setSelectedIndex(0);
				}
				{
					domainLabel = new JLabel();
					panel3.add(domainLabel);
					domainLabel.setText("Domain:");
					domainLabel.setBounds(10, 144, 236, 31);
				}
				{
					domainCombo = new JComboBox();
					panel3.add(domainCombo);
					updateDomainList();
					domainCombo.setModel(domainComboModel);
					domainCombo.setBounds(137, 149, 317, 20);
					domainCombo.setSize(315, 20);
					domainCombo.setBackground(new java.awt.Color(210,210,210));
					domainCombo.setSelectedIndex(0);
				}
				{
					multiplicityLabel = new JLabel();
					panel3.add(multiplicityLabel);
					multiplicityLabel.setText("Multiplicity");
					multiplicityLabel.setBounds(10, 180, 236, 31);
				}
				{
					multiplicityText = new JTextField();
					panel3.add(multiplicityText);
					multiplicityText.setBounds(138, 185, 315, 20);
				}
			}
			{
				panel4 = new JPanel();
				this.add(panel4);
				panel4.setPreferredSize(new java.awt.Dimension(442, 45));
				panel4.setLayout(null);
				panel4.setBackground(new java.awt.Color(240,240,240));
				{
					saveButton = new JButton();
					panel4.add(saveButton);
					saveButton.setText("Save");
					saveButton.setBounds(117, 17, 80, 23);
					saveButton.setBackground(new java.awt.Color(210,210,210));
					//accept button listener 
					saveButton.addActionListener(
							new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									indexList = attributesList.getSelectedIndex();
									updateValueofAttribute();
									updateAttributesList();
								}
							}
					);
				}
				{
					exitButton = new JButton();
					panel4.add(exitButton);
					exitButton.setText("Exit");
					exitButton.setBounds(229, 17, 80, 23);
					exitButton.setBackground(new java.awt.Color(210,210,210));
					//cancel button listener 
					exitButton.addActionListener(
							new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									close();
								}
							}
					);
				}
			}
			updateAttributesValues();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * Method isInt.</br>
	 * Return a boolean that indicate if the string is a integer.
	 * @param s : String.
	 * @return	a boolean that indicate if the string is a integer.
	 */
	public boolean isInt(String s){
		try{
			Integer.parseInt(s);
			return true;
		}catch(NumberFormatException e){
			return false;
		}
	}

	/**
	 * Method close.</br>
	 * Close the dialog.
	 */
	public void close(){
		this.dispose();
	}

	/**
	 * Method updateAttributeList.</br>
	 * Update the attributes of the list.
	 */
	private void updateAttributesList(){
		String [] attr = new String[element.getSinglesAttributes().size()];
		for(int i=0; i<element.getSinglesAttributes().size(); i++){
			attr[i] = element.getSinglesAttributes().get(i).getName();
		}
		attributesListModel = new DefaultComboBoxModel(attr);
		attributesList.setModel(attributesListModel);
		attributesList.setSelectedIndex(indexList);	
	}

	/**
	 * Method updateAttributesValues.</br>
	 * Update the properties of the actual attribute of 
	 * the list in the dialog.
	 */
	private void updateAttributesValues(){
		int index;
		//select the correct index
		if(attributesList.getSelectedIndex() == -1){
			index = 0;
		}else{
			index = attributesList.getSelectedIndex();
		}
		//if the element has got attributes
		if(element.getSinglesAttributes().size() > 0){
			//if is a single attribute
			if(element.getSinglesAttributes().get(index).eClass().getName().equalsIgnoreCase("SingleAttribute")){
				//Create a single attribute
				SingleAttribute a = (SingleAttribute) element.getSinglesAttributes().get(index);
				//set the respective values
				nameText.setText(a.getName());
				nullableCombo.setSelectedItem(a.isNullable()+"");
				domainCombo.setVisible(true);
				domainLabel.setVisible(true);
				domainCombo.setSelectedItem(a.getDomain().getName()+"");
				derivateCombo.setVisible(true);
				derivateLabel.setVisible(true);
				derivateCombo.setSelectedItem(a.isDerivate()+"");
				multiplicityText.setVisible(true);
				multiplicityLabel.setVisible(true);
				multiplicityText.setText(a.getMultiplicity()+"");
			//if is a composite attribute
			}else{
				//create a composite attribute
				CompositeAttribute a = (CompositeAttribute) element.getSinglesAttributes().get(index);
				//set the respective values
				nameText.setText(a.getName());
				nullableCombo.setSelectedItem(a.isNullable()+"");
				domainCombo.setVisible(false);
				domainLabel.setVisible(false);
				derivateCombo.setVisible(false);
				derivateLabel.setVisible(false);
				multiplicityText.setVisible(false);
				multiplicityLabel.setVisible(false);
			}
			this.repaint();
		}
	}

	/**
	 * Method updateValueofAttribute.</br>
	 * Update the properties of the actual attribute of 
	 * the list in the model.
	 */
	private void updateValueofAttribute(){
		int index = attributesList.getSelectedIndex();
		//if is a single attribute
		if(element.getSinglesAttributes().get(index).eClass().getName().equalsIgnoreCase("SingleAttribute")){
			//set the respective values
			String name = nameText.getText().trim();
			boolean nullable, derivate;
			if((nullableCombo.getSelectedItem()+"").equalsIgnoreCase("true")){
				nullable = true;
			}else{
				nullable = false;
			}
			if((derivateCombo.getSelectedItem()+"").equalsIgnoreCase("true")){
				derivate = true;
			}else{
				derivate = false;
			}
			Domain d = null;
			for(int i=0; i<domains.size(); i++){
				if(domainCombo.getSelectedItem().toString().equalsIgnoreCase(domains.get(i).getName())){
					d = domains.get(i);
				}
			}
			int multiplicity;
			if(isInt(multiplicityText.getText().trim())){
				if(Integer.parseInt(multiplicityText.getText().trim()) > 0){
					multiplicity = Integer.parseInt(multiplicityText.getText().trim());
				}else if(Integer.parseInt(multiplicityText.getText().trim()) == 0){
					multiplicity = 1;
				}else{
					multiplicity = -1;
				}
			}else{
				multiplicity = -1;
			}

			//invoke the command
			UpdateSingleAttributeinCompositeAttributeCommand cmd = 
				new UpdateSingleAttributeinCompositeAttributeCommand(TEDomain, element,
						name, nullable, derivate, 
						d, multiplicity, diagram, index);
			try {
				cmd.execute(new NullProgressMonitor(), null);
			} catch (org.eclipse.core.commands.ExecutionException e) {
				e.printStackTrace();
			} // try
		//if is a composite attribute
		}else{
			//set the respective values
			String name = nameText.getText();
			boolean nullable;
			if((nullableCombo.getSelectedItem()+"").equalsIgnoreCase("true")){
				nullable = true;
			}else{
				nullable = false;
			}
			//invoke the command
			UpdateCompositeAttributeinCompositeAttributeCommand cmd = 
				new UpdateCompositeAttributeinCompositeAttributeCommand(TEDomain, element,
						name, nullable, index);
			try {
				cmd.execute(new NullProgressMonitor(), null);
			} catch (org.eclipse.core.commands.ExecutionException e) {
				e.printStackTrace();
			} // try
		}
	}
	
	/**
	 * Method updateDomainList.</br>
	 * Update the domains list of the dialog.
	 */

	private void updateDomainList(){
		String [] doms = new String[domains.size()];
		for(int i=0; i<domains.size(); i++){
			doms[i] = domains.get(i).getName();
		}
		domainComboModel = new DefaultComboBoxModel(doms);
		domainCombo.setModel(domainComboModel);
		domainCombo.setSelectedIndex(0);	
	}
	
	/**
	 * Method deleteAttribute.</br>
	 * Delete the actual attribute of the model.
	 */

	private void deleteAttribute(){
		//if the element has attributes
		if(element.getSinglesAttributes().size() != 0){
			indexList = attributesList.getSelectedIndex();
			//if is a single attribute 
			if(element.getSinglesAttributes().get(indexList).eClass().getName().equalsIgnoreCase("SingleAttribute")){
				//invoke the command
				DeleteSingleAttributeinCompositeAttributeCommand cmd = 
					new DeleteSingleAttributeinCompositeAttributeCommand(TEDomain, element,
							diagram, indexList);
				try {
					cmd.execute(new NullProgressMonitor(), null);
				} catch (org.eclipse.core.commands.ExecutionException ee) {
					ee.printStackTrace();
				} // try
			//if is a composite attribute
			}else{
				//invoke the command
				DeleteCompositeAttributeinCompositeAttributeCommand cmd = 
					new DeleteCompositeAttributeinCompositeAttributeCommand(TEDomain, element,
							diagram, indexList);
				try {
					cmd.execute(new NullProgressMonitor(), null);
				} catch (org.eclipse.core.commands.ExecutionException ee) {
					ee.printStackTrace();
				} // try
			}
			if(indexList != 0){
				indexList--;
			}
			//update the list
			updateAttributesList();
		}
	}
	
	/**
	 * Method addNewSingleAttribute.</br>
	 * Add a new single attribute to the element.
	 */
	
	private void addNewSingleAttribute(){
		indexList = attributesList.getModel().getSize();
		//invoke the command
		CreateSingleAttributeinCompositeAttributeCommand cmd = 
			new CreateSingleAttributeinCompositeAttributeCommand(TEDomain, element,
					"attribute"+(indexList+1), false, false, 
					domains.get(0), 1);
		try {
			cmd.execute(new NullProgressMonitor(), null);
		} catch (org.eclipse.core.commands.ExecutionException ee) {
			ee.printStackTrace();
		} // try
		//update the list
		updateAttributesList();
	}

	/**
	 * Method addNewCompositeAttribute.</br>
	 * Add a new composite attribute to the element.
	 */
	private void addNewCompositeAttribute(){
		indexList = attributesList.getModel().getSize();
		//invoke the command
		CreateCompositeAttributeinCompositeAttributeCommand cmd = 
			new CreateCompositeAttributeinCompositeAttributeCommand(TEDomain, element,
					"attribute"+(indexList+1), false);
		try {
			cmd.execute(new NullProgressMonitor(), null);
		} catch (org.eclipse.core.commands.ExecutionException ee) {
			ee.printStackTrace();
		} // try
		//update the list
		updateAttributesList();
	}
}

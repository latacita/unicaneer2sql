package es.unican.moses.sle.db.eer2sql.diagram.custom;

import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerListModel;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * This code was edited or generated using CloudGarden's Jigloo
 * SWT/Swing GUI Builder, which is free for non-commercial
 * use. If Jigloo is being used commercially (ie, by a corporation,
 * company or business for any purpose whatever) then you
 * should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details.
 * Use of Jigloo implies acceptance of these licensing terms.
 * A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
 * THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
 * LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class AttributesWizard extends javax.swing.JFrame {
	private JPanel panel1;
	private JPanel panel2;
	private JLabel nullableLabel;
	private JLabel derivateLabel;
	private JLabel nameLabel;
	private JLabel propertiesLabel;
	private JPanel panel3;
	private JButton deleteButton;
	private JTextField nameText;
	private JTextField multiplicityText;
	private JButton cancelButton;
	private JButton acceptButton;
	private JPanel panel4;
	private JComboBox domainCombo;
	private JComboBox derivateCombo;
	private JComboBox nullableCombo;
	private JLabel jLabel1;
	private JLabel multipliciteLabel;
	private JLabel domainLabel;
	private JButton newCompositeAttributeButton;
	private JButton newSingleAttributeButton;
	private JList attributesList;
	private JLabel attributesLabel;

	private String title;
	private boolean newAttribute = false;

	private ListModel attributesListModel = 
		new DefaultComboBoxModel(
				new String[] { "Attribute 1", "Attribute 2" });

	private ComboBoxModel nullableComboModel = 
		new DefaultComboBoxModel(
				new String[] { "true", "false" });

	private ComboBoxModel derivateComboModel = 
		new DefaultComboBoxModel(
				new String[] { "true", "false" });


	private ComboBoxModel domainComboModel = 
		new DefaultComboBoxModel(
				new String[] { "String", "int" });



	public AttributesWizard(String title){
		this.title = title;
		JFrame frame = new JFrame();
		AttributesWizard inst = new AttributesWizard();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(527, 588);
		frame.setPreferredSize(new java.awt.Dimension(527, 588));
	}

	public AttributesWizard() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			this.setPreferredSize(new java.awt.Dimension(527, 558));
			this.setBounds(0, 0, 527, 558);
			FlowLayout thisLayout = new FlowLayout();
			getContentPane().setLayout(thisLayout);
			setVisible(true);
			this.setTitle(title);
			getContentPane().setBackground(new java.awt.Color(240,240,240));
			this.setMaximumSize(new java.awt.Dimension(527, 588));
			{
				panel1 = new JPanel();
				BorderLayout panel1Layout = new BorderLayout();
				getContentPane().add(panel1);
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
					attributesList = new JList();
					panel1.add(attributesList, "Center");
					attributesList.setModel(attributesListModel);
					attributesList.setBounds(12, 27, 456, 128);
					attributesList.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
					attributesList.setSelectedIndex(0);
					attributesList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					attributesList.addListSelectionListener(new ListSelectionListener(){
						public void valueChanged(ListSelectionEvent evt) {
							if (evt.getValueIsAdjusting())
								return;
							//						        //se muestran las propiedades de los atributos
							//						        Atributo a = attributesList.getSelectedValue();
							//						        nameText.setText(a.name);
							//						        nullableCombo.setSelectedItem(a.nullable);
							//						        //si el atributo es simple
							//						        derivateCombo.enable();
							//						        derivateCombo.setSelectedItem(a.derivate);
							//						        domainCombo.enable();
							//						        derivateCombo.setSelectedItem(a.domain);
							//						        multiplicityText.enable();
							//						        multiplicityText.setText(a.multiplicity);		        

							//						        //si el atributo es compuesto
							//						        derivateCombo.disable();
							//						        domainCombo.disable();
							//						        multiplicityText.disable(); 
						}
					});
				}
			}
			{
				panel2 = new JPanel();
				getContentPane().add(panel2);
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
									//es un nuevo attributo
									newAttribute = true;
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
									//es un nuevo attributo
									newAttribute = true;
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
				}
			}
			{
				panel3 = new JPanel();
				getContentPane().add(panel3);
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
					domainCombo.setModel(domainComboModel);
					domainCombo.setBounds(137, 149, 317, 20);
					domainCombo.setSize(315, 20);
					domainCombo.setBackground(new java.awt.Color(210,210,210));
					domainCombo.setSelectedIndex(0);
				}
				{
					multipliciteLabel = new JLabel();
					panel3.add(multipliciteLabel);
					multipliciteLabel.setText("Multiplicity");
					multipliciteLabel.setBounds(10, 180, 236, 31);
				}
				{
					multiplicityText = new JTextField();
					panel3.add(multiplicityText);
					multiplicityText.setText("1");
					multiplicityText.setBounds(138, 185, 315, 20);
				}
			}
			{
				panel4 = new JPanel();
				getContentPane().add(panel4);
				panel4.setPreferredSize(new java.awt.Dimension(442, 45));
				panel4.setLayout(null);
				panel4.setBackground(new java.awt.Color(240,240,240));
				{
					acceptButton = new JButton();
					panel4.add(acceptButton);
					acceptButton.setText("Accept");
					acceptButton.setBounds(117, 17, 80, 23);
					acceptButton.setBackground(new java.awt.Color(210,210,210));
					//accept button listener 
					acceptButton.addActionListener(
							new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									//si el atributo no es nuevo
									if(!newAttribute){
										//modifico sus valores con los de las propiedades
										//comparo las propiedades y si hay diferencias las modifico
										
									}else{
										//si ya existe un attributo con ese nombre
//										    int i = 1;
//											while(exista nameText.getText().trim()+i){
//												i++;
//									        }
//										    nameText.setText(nameText.getText().trim()+i);
										//si la multiplicidad es invalida
										String multi = multiplicityText.getText().trim();
										if(multi.equalsIgnoreCase("N") || 
										   multi.equalsIgnoreCase("*") ||
										   multi.equalsIgnoreCase("-1") || 
										   !isInt(multi)){
											multiplicityText.setText("N");
										}
										//se crea un attributo con los valores de las propiedades
										//se añade a la lista de atributos de la relación
										//se actualiza la lista
									}
									
									//el attributo ya no es nuevo
									newAttribute = false;
								}
							}
					);
				}
				{
					cancelButton = new JButton();
					panel4.add(cancelButton);
					cancelButton.setText("Cancel");
					cancelButton.setBounds(229, 17, 80, 23);
					cancelButton.setBackground(new java.awt.Color(210,210,210));
					//cancel button listener 
					cancelButton.addActionListener(
							new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									System.exit(0);
								}
							}
					);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	/**
	 * Method isInt.
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


}

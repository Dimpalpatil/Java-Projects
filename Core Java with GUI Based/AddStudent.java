package mainpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxEditor;

public class AddStudent {

	private JFrame frmAddStudentPage;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtmobile;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent window = new AddStudent();
					window.frmAddStudentPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddStudentPage = new JFrame();
		frmAddStudentPage.getContentPane().setForeground(new Color(255, 0, 0));
		frmAddStudentPage.setTitle("Add Student Page");
		frmAddStudentPage.setBounds(250, 50, 1050, 800);
		frmAddStudentPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddStudentPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Entry Form");
		lblNewLabel.setForeground(new Color(128, 0, 255));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel.setBounds(252, 23, 531, 49);
		frmAddStudentPage.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 94, 1016, 0);
		frmAddStudentPage.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 82, 1016, 32);
		frmAddStudentPage.getContentPane().add(separator_1);
		
		JLabel btnNewButton = new JLabel("FirstName");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 30));
		btnNewButton.setBounds(43, 120, 226, 32);
		frmAddStudentPage.getContentPane().add(btnNewButton);
		
		JLabel btnNewButton_1 = new JLabel("LastaName");
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		btnNewButton_1.setBounds(29, 195, 245, 32);
		frmAddStudentPage.getContentPane().add(btnNewButton_1);
		
		JLabel btnNewButton_1_1 = new JLabel("Mobile");
		btnNewButton_1_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		btnNewButton_1_1.setBounds(60, 258, 127, 32);
		frmAddStudentPage.getContentPane().add(btnNewButton_1_1);
		
		JLabel btnNewButton_1_2 = new JLabel("Address");
		btnNewButton_1_2.setFont(new Font("Arial Black", Font.BOLD, 30));
		btnNewButton_1_2.setBounds(51, 322, 154, 32);
		frmAddStudentPage.getContentPane().add(btnNewButton_1_2);
		
		JLabel btnNewButton_1_3 = new JLabel("Gender");
		btnNewButton_1_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_1_3.setBounds(52, 421, 145, 49);
		frmAddStudentPage.getContentPane().add(btnNewButton_1_3);
		
		JLabel btnNewButton_1_3_1 = new JLabel("Degree");
		btnNewButton_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_1_3_1.setBounds(703, 418, 98, 49);
		frmAddStudentPage.getContentPane().add(btnNewButton_1_3_1);
		
		JLabel btnNewButton_1_3_2 = new JLabel("D O B");
		btnNewButton_1_3_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_1_3_2.setBounds(54, 491, 76, 32);
		frmAddStudentPage.getContentPane().add(btnNewButton_1_3_2);
		
		JLabel btnNewButton_1_3_3 = new JLabel("Subject");
		btnNewButton_1_3_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_1_3_3.setBounds(703, 482, 98, 49);
		frmAddStudentPage.getContentPane().add(btnNewButton_1_3_3);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(4, 575, 1016, 32);
		frmAddStudentPage.getContentPane().add(separator_1_1);
		
		
		JTextArea txtAddress = new JTextArea();
		txtAddress.setBounds(303, 300, 598, 108);
		frmAddStudentPage.getContentPane().add(txtAddress);
		
		
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("JAVA");
		chckbxNewCheckBox.setForeground(new Color(255, 0, 0));
		chckbxNewCheckBox.setFont(new Font("Arial", Font.BOLD, 10));
		chckbxNewCheckBox.setBounds(819, 499, 61, 21);
		frmAddStudentPage.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxPython = new JCheckBox("PYTHON");
		chckbxPython.setForeground(new Color(255, 0, 0));
		chckbxPython.setFont(new Font("Arial", Font.BOLD, 10));
		chckbxPython.setBounds(893, 499, 77, 21);
		frmAddStudentPage.getContentPane().add(chckbxPython);
		
		
		btnNewButton_2.setBounds(81, 609, 106, 40);
		frmAddStudentPage.getContentPane().add(btnNewButton_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("yyyy-MM-dd");
		dateChooser.setBounds(163, 491, 277, 19);
		frmAddStudentPage.getContentPane().add(dateChooser);
		
		JButton btnNewButton_2_1 = new JButton("RESET");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFirstName.setText("");
				txtLastName.setText("");
				txtmobile.setText("");
				txtAddress.setText("");
				chckbxNewCheckBox.setSelected(false);
				chckbxPython.setSelected(false);
				dateChooser.setCalendar(null);
				
			
				
				
				
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBounds(186, 426, 265, 52);
		frmAddStudentPage.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Arial Black", Font.BOLD, 10));
		rdbtnNewRadioButton.setBounds(26, 6, 103, 21);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Arial Black", Font.BOLD, 10));
		rdbtnFemale.setBounds(148, 6, 103, 21);
		panel.add(rdbtnFemale);
		btnNewButton_2_1.setBounds(334, 609, 106, 40);
		frmAddStudentPage.getContentPane().add(btnNewButton_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial Black", Font.BOLD, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BE", "BCA", "MCA"}));
		comboBox.setBounds(811, 428, 148, 32);
		frmAddStudentPage.getContentPane().add(comboBox);
		
		
		JButton btnNewButton_2_1_1 = new JButton("SAVE");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstName = txtFirstName.getText();
				String lastname = txtLastName.getText();
				long mobile = Long.parseLong(txtmobile.getText());
				String address = txtAddress.getText();
				
				System.out.println( firstName + lastname + mobile + address );
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String date = sdf.format(dateChooser.getDate());
				
				System.out.println(date);
				
				String subject1 = null;
				String subject2 = null;
				
				boolean isSelected = chckbxNewCheckBox.isSelected();
				
				if(isSelected) {
					
					subject1 = chckbxNewCheckBox.getLabel();
				}
				
				isSelected = chckbxPython.isSelected();
				if(isSelected) {
					
					subject1 = chckbxPython.getLabel();
				}
				System.out.println(subject1 + subject2);
				
				String gender = null;
				
				if(rdbtnNewRadioButton.isSelected()) {
					gender = "male";
					
					}else if (rdbtnFemale.isSelected()) {
						gender = "female";
					}
				System.out.println(gender);
				
				String degree = null;
				degree = (String)comboBox.getSelectedItem();
				System.out.println(degree);
				
				JDBCHandling db = new JDBCHandling();
				
				int status = db.insertData(firstName, lastname, mobile, address, gender, degree, degree, subject1, subject2);
				
				if(status==1) {
					JOptionPane.showMessageDialog(null, "Data Updated");
					
				}else {
					
					JOptionPane.showMessageDialog(null, "Problem in Add Date ");
					
					
				}
					
				
				
				
				
			}
		});
		btnNewButton_2_1_1.setBounds(581, 609, 106, 40);
		frmAddStudentPage.getContentPane().add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_1_2 = new JButton("CLOSE");
		btnNewButton_2_1_2.setBounds(848, 609, 106, 40);
		frmAddStudentPage.getContentPane().add(btnNewButton_2_1_2);
		
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Arial", Font.BOLD, 14));
		txtFirstName.setForeground(new Color(0, 64, 0));
		txtFirstName.setBounds(306, 119, 594, 25);
		frmAddStudentPage.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Arial", Font.BOLD, 15));
		txtLastName.setColumns(10);
		txtLastName.setBounds(306, 187, 594, 25);
		frmAddStudentPage.getContentPane().add(txtLastName);
		
		txtmobile = new JTextField();
		txtmobile.setColumns(10);
		txtmobile.setBounds(306, 249, 594, 25);
		frmAddStudentPage.getContentPane().add(txtmobile);
		
	
		
	
		
		
		
		
		
		
		
		
	}
}

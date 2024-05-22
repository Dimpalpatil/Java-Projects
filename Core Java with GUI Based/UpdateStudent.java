package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDayChooser;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class UpdateStudent {

	private JFrame frmUpdatestudent;
	private JTextField textField;
	private JTextField txtfirstname;
	private JTextField txtlastname;
	private JTextField txtmobile;
	private JTextField txtaddress;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStudent window = new UpdateStudent();
					window.frmUpdatestudent.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UpdateStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUpdatestudent = new JFrame();
		frmUpdatestudent.setTitle("UpdateStudent");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ScreenSize = kit.getScreenSize();
		int width = ScreenSize.width;
		int height = ScreenSize.height;
		frmUpdatestudent.setSize(width, height);
		frmUpdatestudent.setLocationRelativeTo(null);





		//		frame.setBounds(100, 100, 450, 300);
		frmUpdatestudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUpdatestudent.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Enter Serial Number For updation :");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 50));
		lblNewLabel.setBounds(40, 10, 870, 64);
		frmUpdatestudent.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(944, 20, 141, 48);
		frmUpdatestudent.getContentPane().add(textField);
		textField.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 84, 1502, 7);
		frmUpdatestudent.getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(218, 602, 1, 2);
		frmUpdatestudent.getContentPane().add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 642, 1484, 7);
		frmUpdatestudent.getContentPane().add(separator_2);

		JLabel lblNewLabel_1 = new JLabel("FirstName");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_1.setBounds(40, 112, 176, 48);
		frmUpdatestudent.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("LastName");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(43, 179, 176, 48);
		frmUpdatestudent.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Mobile");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_1_2.setBounds(43, 244, 176, 48);
		frmUpdatestudent.getContentPane().add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("Address");
		lblNewLabel_1_3.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_1_3.setBounds(40, 322, 176, 48);
		frmUpdatestudent.getContentPane().add(lblNewLabel_1_3);

		txtfirstname = new JTextField();
		txtfirstname.setBounds(240, 108, 512, 42);
		frmUpdatestudent.getContentPane().add(txtfirstname);
		txtfirstname.setColumns(10);

		txtlastname = new JTextField();
		txtlastname.setColumns(10);
		txtlastname.setBounds(240, 179, 512, 42);
		frmUpdatestudent.getContentPane().add(txtlastname);

		txtmobile = new JTextField();
		txtmobile.setColumns(10);
		txtmobile.setBounds(240, 244, 512, 42);
		frmUpdatestudent.getContentPane().add(txtmobile);

		txtaddress = new JTextField();
		txtaddress.setColumns(10);
		txtaddress.setBounds(240, 311, 512, 42);
		frmUpdatestudent.getContentPane().add(txtaddress);

		JLabel lblNewLabel_1_3_1 = new JLabel("Gender");
		lblNewLabel_1_3_1.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_1_3_1.setBounds(43, 406, 176, 48);
		frmUpdatestudent.getContentPane().add(lblNewLabel_1_3_1);

		JPanel panel = new JPanel();
		panel.setBounds(211, 402, 222, 48);
		frmUpdatestudent.getContentPane().add(panel);
		panel.setLayout(null);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnNewRadioButton.setBounds(16, 6, 103, 21);
		panel.add(rdbtnNewRadioButton);

		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnFemale.setBounds(121, 6, 103, 21);
		panel.add(rdbtnFemale);

		JDayChooser dayChooser = new JDayChooser();
		dayChooser.setBounds(123, 444, -247, 34);
		frmUpdatestudent.getContentPane().add(dayChooser);

		JDayChooser dayChooser_1 = new JDayChooser();
		dayChooser_1.setBounds(162, 471, 189, 133);
		frmUpdatestudent.getContentPane().add(dayChooser_1);

		JButton btnNewButton = new JButton("Get Data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int number = Integer.parseInt(SerialNumber.)
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 26));
		btnNewButton.setForeground(new Color(0, 64, 128));
		btnNewButton.setBounds(1190, 10, 176, 57);
		frmUpdatestudent.getContentPane().add(btnNewButton);

		JLabel lblNewLabel_1_3_1_1 = new JLabel("Degree");
		lblNewLabel_1_3_1_1.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_1_3_1_1.setBounds(650, 391, 102, 48);
		frmUpdatestudent.getContentPane().add(lblNewLabel_1_3_1_1);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 24));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BE", "BCA", "MCA"}));
		comboBox.setBounds(767, 402, 189, 34);
		frmUpdatestudent.getContentPane().add(comboBox);

		JLabel lblNewLabel_1_3_1_1_1 = new JLabel("Subject");
		lblNewLabel_1_3_1_1_1.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_1_3_1_1_1.setBounds(650, 473, 102, 48);
		frmUpdatestudent.getContentPane().add(lblNewLabel_1_3_1_1_1);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Java");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 21));
		chckbxNewCheckBox.setBounds(769, 485, 108, 25);
		frmUpdatestudent.getContentPane().add(chckbxNewCheckBox);

		JCheckBox chckbxPython = new JCheckBox("Python");
		chckbxPython.setFont(new Font("Tahoma", Font.BOLD, 21));
		chckbxPython.setBounds(907, 485, 122, 25);
		frmUpdatestudent.getContentPane().add(chckbxPython);

		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frmUpdatestudent.setVisible(false);
			}
		});
		btnBack.setForeground(new Color(0, 64, 128));
		btnBack.setFont(new Font("Arial", Font.BOLD, 26));
		btnBack.setBounds(64, 675, 176, 57);
		frmUpdatestudent.getContentPane().add(btnBack);

		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String firstName = txtfirstname.getText();
				String lastname = txtlastname.getText();
				long mobile = Long.parseLong(txtmobile.getText());
				String address = txtaddress.getText();

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
		btnSave.setForeground(new Color(0, 64, 128));
		btnSave.setFont(new Font("Arial", Font.BOLD, 26));
		btnSave.setBounds(455, 675, 176, 57);
		frmUpdatestudent.getContentPane().add(btnSave);

		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtfirstname.setText("");
				txtlastname.setText("");
				txtmobile.setText("");
				txtaddress.setText("");
				chckbxNewCheckBox.setSelected(false);
				chckbxPython.setSelected(false);

			}
		});
		btnReset.setForeground(new Color(0, 64, 128));
		btnReset.setFont(new Font("Arial", Font.BOLD, 26));
		btnReset.setBounds(841, 675, 176, 57);
		frmUpdatestudent.getContentPane().add(btnReset);

		JButton btnClose = new JButton("CLOSE");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setForeground(new Color(0, 64, 128));
		btnClose.setFont(new Font("Arial", Font.BOLD, 26));
		btnClose.setBounds(1260, 675, 176, 57);
		frmUpdatestudent.getContentPane().add(btnClose);
	}
}

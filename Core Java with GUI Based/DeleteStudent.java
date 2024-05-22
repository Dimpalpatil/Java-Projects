package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteStudent {

	private JFrame frmDeletstudent;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteStudent window = new DeleteStudent();
					window.frmDeletstudent.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DeleteStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDeletstudent = new JFrame();
		frmDeletstudent.setTitle("DeletStudent");
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ScreenSize = kit.getScreenSize();
		int width = ScreenSize.width;
		int height = ScreenSize.height;
		frmDeletstudent.setSize(width, height);
		frmDeletstudent.setLocationRelativeTo(null);
//		frmDeletstudent.setBounds(100, 100, 450, 300);
		frmDeletstudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDeletstudent.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delete Student Entry ");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 48));
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setBounds(439, 10, 644, 84);
		frmDeletstudent.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(84, 73, 1, 2);
		frmDeletstudent.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 103, 1502, 0);
		frmDeletstudent.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 85, 1512, 2);
		frmDeletstudent.getContentPane().add(separator_2);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Serial Number to Delete");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 37));
		lblNewLabel_1.setBounds(70, 104, 699, 77);
		frmDeletstudent.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Get Data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton.setForeground(new Color(255, 0, 128));
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 23));
		btnNewButton.setBounds(1081, 104, 198, 67);
		frmDeletstudent.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(805, 104, 155, 61);
		frmDeletstudent.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("FirstName");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_2.setForeground(new Color(128, 0, 64));
		lblNewLabel_2.setBounds(42, 234, 236, 67);
		frmDeletstudent.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("LastName");
		lblNewLabel_2_1.setForeground(new Color(128, 0, 64));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_2_1.setBounds(42, 311, 236, 67);
		frmDeletstudent.getContentPane().add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(306, 234, 589, 61);
		frmDeletstudent.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(306, 317, 589, 61);
		frmDeletstudent.getContentPane().add(textField_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(-122, 465, 1512, 2);
		frmDeletstudent.getContentPane().add(separator_2_1);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDeletstudent.setVisible(false);
		
			}
		});
		btnBack.setForeground(new Color(255, 0, 128));
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 23));
		btnBack.setBounds(58, 505, 198, 67);
		frmDeletstudent.getContentPane().add(btnBack);
		
		JButton btnSave = new JButton("DELETE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSave.setForeground(new Color(255, 0, 128));
		btnSave.setFont(new Font("Arial Black", Font.BOLD, 23));
		btnSave.setBounds(571, 505, 198, 67);
		frmDeletstudent.getContentPane().add(btnSave);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
			
		});
		btnClose.setForeground(new Color(255, 0, 128));
		btnClose.setFont(new Font("Arial Black", Font.BOLD, 23));
		btnClose.setBounds(1081, 505, 198, 67);
		frmDeletstudent.getContentPane().add(btnClose);
	}
}

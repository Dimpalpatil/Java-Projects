package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class StudentDataManagement {

	private JFrame frmStudentdatabasemanagement;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDataManagement window = new StudentDataManagement();
					window.frmStudentdatabasemanagement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentDataManagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentdatabasemanagement = new JFrame();
		frmStudentdatabasemanagement.setTitle("StudentDatabaseManagement");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ScreenSize = kit.getScreenSize();
		int width = ScreenSize.width;
		int height = ScreenSize.height;
		frmStudentdatabasemanagement.setSize(width, height);
		frmStudentdatabasemanagement.setLocationRelativeTo(null);
//		frmStudentdatabasemanagement.setBounds(100, 100, 450, 300);
		frmStudentdatabasemanagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentdatabasemanagement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Database Management");
		lblNewLabel.setForeground(new Color(128, 0, 128));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel.setBounds(357, 22, 808, 57);
		frmStudentdatabasemanagement.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 77, 1512, 14);
		frmStudentdatabasemanagement.getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBounds(164, 89, 1198, 503);
		frmStudentdatabasemanagement.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnShow = new JButton("show");
		btnShow.setIcon(new ImageIcon(StudentDataManagement.class.getResource("/images/4.png")));
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowStudent.main(null);
				
			}
		});
		btnShow.setBounds(18, 77, 265, 297);
		panel.add(btnShow);
		
		JButton btnUpdate = new JButton("update");
		btnUpdate.setIcon(new ImageIcon(StudentDataManagement.class.getResource("/images/2.png")));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateStudent.main(null);
			}
		});
		btnUpdate.setBounds(305, 77, 273, 297);
		panel.add(btnUpdate);
		
		JButton btnDelete = new JButton("delete");
		btnDelete.setIcon(new ImageIcon(StudentDataManagement.class.getResource("/images/1.png")));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteStudent.main(null);
			}
		});
		btnDelete.setBounds(602, 77, 265, 297);
		panel.add(btnDelete);
		
		JButton btnAdd = new JButton("add");
		btnAdd.setIcon(new ImageIcon(StudentDataManagement.class.getResource("/images/3.png")));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStudent.main(null);
			}
		});
		btnAdd.setBounds(890, 77, 283, 297);
		panel.add(btnAdd);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(-12, 613, 1512, 14);
		frmStudentdatabasemanagement.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStudentdatabasemanagement.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Aparajita", Font.BOLD, 30));
		btnNewButton.setBounds(114, 633, 156, 48);
		frmStudentdatabasemanagement.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Aparajita", Font.BOLD, 30));
		btnExit.setBounds(1257, 633, 156, 48);
		frmStudentdatabasemanagement.getContentPane().add(btnExit);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(102, 0, 101, 22);
		frmStudentdatabasemanagement.getContentPane().add(menuBar);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("UpdateStudent");
		mntmNewMenuItem_2.setBounds(114, 32, 36, -30);
		frmStudentdatabasemanagement.getContentPane().add(mntmNewMenuItem_2);
	}
}

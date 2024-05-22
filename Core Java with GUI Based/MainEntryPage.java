package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainEntryPage {

	private JFrame frmMainentrypage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainEntryPage window = new MainEntryPage();
					window.frmMainentrypage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainEntryPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMainentrypage = new JFrame();
		frmMainentrypage.setIconImage(Toolkit.getDefaultToolkit().getImage(MainEntryPage.class.getResource("/images/dimpal pic.jpg")));
		frmMainentrypage.setTitle("MainEntryPage");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ScreenSize = kit.getScreenSize();
		int width = ScreenSize.width;
		int height = ScreenSize.height;
		frmMainentrypage.setSize(width, height);
		frmMainentrypage.setLocationRelativeTo(null);
		
//		frmMainentrypage.setBounds(100, 100, 450, 300);
		frmMainentrypage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMainentrypage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to NinfinityInfoSolutions");
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel.setBounds(370, 36, 782, 47);
		frmMainentrypage.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 76, 1512, 19);
		frmMainentrypage.getContentPane().add(separator);
		
		JButton btnStaff = new JButton("staff");
		btnStaff.setBounds(165, 237, 443, 313);
		frmMainentrypage.getContentPane().add(btnStaff);
		
		JButton btnStudent = new JButton("student");
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentDataManagement.main(null);
				
			}
		});
		btnStudent.setBounds(943, 227, 443, 313);
		frmMainentrypage.getContentPane().add(btnStudent);
		
		JLabel lblNewLabel_1 = new JLabel("Staff");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_1.setBounds(336, 189, 149, 38);
		frmMainentrypage.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Student");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(1101, 179, 149, 38);
		frmMainentrypage.getContentPane().add(lblNewLabel_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 630, 1522, 2);
		frmMainentrypage.getContentPane().add(separator_1);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMainentrypage.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 30));
		btnBack.setBounds(536, 670, 138, 47);
		frmMainentrypage.getContentPane().add(btnBack);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 30));
		btnExit.setBounds(897, 666, 122, 51);
		frmMainentrypage.getContentPane().add(btnExit);
	}
}

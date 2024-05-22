package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm {

	private JFrame frmNInfinityengineeringAcademy;
	private JTextField txtloginName;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
					window.frmNInfinityengineeringAcademy.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNInfinityengineeringAcademy = new JFrame();
		frmNInfinityengineeringAcademy.setIconImage(Toolkit.getDefaultToolkit().getImage(LoginForm.class.getResource("/images/dimpal pic.jpg")));
		frmNInfinityengineeringAcademy.setTitle("N infinityEngineering academy");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ScreenSize = kit.getScreenSize();
		int width = ScreenSize.width;
		int height = ScreenSize.height;
		frmNInfinityengineeringAcademy.setSize(width/2, height/2);
		frmNInfinityengineeringAcademy.setLocationRelativeTo(null);

		//		frame.setBounds(100, 100, 450, 300);
		frmNInfinityengineeringAcademy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNInfinityengineeringAcademy.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Ninfinity infoSolutions");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(128, 0, 64));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 38));
		lblNewLabel.setBounds(61, 29, 632, 64);
		frmNInfinityengineeringAcademy.getContentPane().add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setBounds(54, 103, 645, 2);
		frmNInfinityengineeringAcademy.getContentPane().add(separator);

		JLabel loginname1 = new JLabel("Login Name:");
		loginname1.setFont(new Font("Arial Black", Font.BOLD, 25));
		loginname1.setForeground(new Color(0, 0, 0));
		loginname1.setBounds(64, 141, 188, 40);
		frmNInfinityengineeringAcademy.getContentPane().add(loginname1);

		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(61, 209, 155, 31);
		frmNInfinityengineeringAcademy.getContentPane().add(lblNewLabel_2);

		txtloginName = new JTextField();
		txtloginName.setBounds(280, 145, 332, 36);
		frmNInfinityengineeringAcademy.getContentPane().add(txtloginName);
		txtloginName.setColumns(10);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(287, 209, 299, 31);
		frmNInfinityengineeringAcademy.getContentPane().add(txtPassword);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(61, 269, 632, 2);
		frmNInfinityengineeringAcademy.getContentPane().add(separator_1);

		JButton btnlogin = new JButton("Login ");
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String loginName = txtloginName.getText();
				String Password = txtPassword.getText();  
//				dupricated methods (if i want numbers in  password so i need to use parsing  )
//				System.out.println(loginName + Password );
				
				
				if(loginName.equals("Dimpal")&& Password.equals("ninfi")) {
//					System.out.println("wow: you are a valid user ");
					
					MainEntryPage.main(null);
					}else {
						JOptionPane.showMessageDialog(null, "Invalid User ");
					}
			}
		});
		btnlogin.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnlogin.setBounds(80, 291, 136, 31);
		frmNInfinityengineeringAcademy.getContentPane().add(btnlogin);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBounds(557, 291, 136, 31);
		frmNInfinityengineeringAcademy.getContentPane().add(btnExit);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtloginName.setText(null);
				txtPassword.setText(null);
				
				
				
				
			}
		});
		btnReset.setBackground(new Color(240, 240, 240));
		btnReset.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnReset.setBounds(308, 291, 136, 31);
		frmNInfinityengineeringAcademy.getContentPane().add(btnReset);
	}
}










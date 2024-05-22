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
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class ShowStudent {

	private JFrame frmShowStudentDatabase;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowStudent window = new ShowStudent();
					window.frmShowStudentDatabase.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ShowStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmShowStudentDatabase = new JFrame();
		frmShowStudentDatabase.setIconImage(Toolkit.getDefaultToolkit().getImage(ShowStudent.class.getResource("/images/dimpal pic.jpg")));
		frmShowStudentDatabase.setTitle("show student Database");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ScreenSize = kit.getScreenSize();
		int width = ScreenSize.width;
		int height = ScreenSize.height;
		frmShowStudentDatabase.setSize(width, height);
		frmShowStudentDatabase.setLocationRelativeTo(null);

//		frmShowStudentDatabase.setBounds(100, 100, 450, 300);
		frmShowStudentDatabase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmShowStudentDatabase.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Database ");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 50));
		lblNewLabel.setBounds(382, -22, 779, 132);
		frmShowStudentDatabase.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 83, 1502, 44);
		frmShowStudentDatabase.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 717, 1512, 28);
		frmShowStudentDatabase.getContentPane().add(separator_1);
		
		JButton btnback = new JButton("BACK");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmShowStudentDatabase.setVisible(false);
			
				
			}
		});
		btnback.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnback.setForeground(new Color(0, 0, 0));
		btnback.setBounds(91, 739, 139, 37);
		frmShowStudentDatabase.getContentPane().add(btnback);
		
		JButton btnShow = new JButton("SHOW");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				JDBCHandling db = new JDBCHandling();
				ResultSet.result = db.gettable();
				
			
				
				DefaultTableModel model = new DefaultTableModel();
				String[] columnNames = { "SerialNumber", "FirstName", "LastName", "Mobile", "Address", "Gender", "Degree", "D O B", "subject1", "subject2"};
				model.setColumnIdentifiers(columnNames);
				
				
				while(result.next()) {
					
					model.addRow(new Object[] {
							
							
							result.getInt(),
							
					});
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnShow.setForeground(Color.BLACK);
		btnShow.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnShow.setBounds(662, 739, 139, 37);
		frmShowStudentDatabase.getContentPane().add(btnShow);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setForeground(Color.BLACK);
		btnClose.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnClose.setBounds(1267, 739, 139, 37);
		frmShowStudentDatabase.getContentPane().add(btnClose);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 103, 1502, 593);
		frmShowStudentDatabase.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 18));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				 "Serial number", "FirstName", "LastName", "Mobile", "Address", "Gender", "Degree", "D O B", "subject1", "subject2"
			}
		));
		
		table.setFont(new Font("Arial", Font.PLAIN,12));
		scrollPane.setViewportView(table);
	}
}

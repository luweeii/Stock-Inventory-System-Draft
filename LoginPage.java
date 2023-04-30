import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class LoginPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setTitle("Login Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 253);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton adLog = new JButton("Admin Login ");
		adLog.setBounds(88, 96, 107, 34);
		contentPane.add(adLog);
		
		JButton userLog = new JButton("User Login");
		userLog.setBounds(249, 96, 107, 34);
		contentPane.add(userLog);
		
		JLabel lblNewLabel = new JLabel("<html><div style = 'text-align: center'>Welcome to the Stock Inventory System<br/>Please Login whether you are the admin or the user</div></html>");
		lblNewLabel.setBounds(78, 45, 307, 53);
		contentPane.add(lblNewLabel);
	}
}

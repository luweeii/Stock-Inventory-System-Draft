import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setTitle("Admin Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel usernameLabel = new JLabel("USERNAME:");
		usernameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		usernameLabel.setBounds(89, 87, 79, 26);
		contentPane.add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("PASSWORD:");
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		passwordLabel.setBounds(89, 134, 79, 26);
		contentPane.add(passwordLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(178, 85, 130, 26);
		contentPane.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(178, 132, 130, 26);
		contentPane.add(passwordField);
		
		JButton loginBtn = new JButton("LOGIN");
		loginBtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		loginBtn.setBounds(233, 182, 91, 26);
		contentPane.add(loginBtn);
		
		JButton backBtn = new JButton("BACK");
		backBtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		backBtn.setBounds(116, 183, 91, 26);
		contentPane.add(backBtn);
		
		JLabel lblwelcomeToAdmin = new JLabel("<html>Welcome to Admin Login Page. Please input\r\n\tyour username and password</html>\r\n");
		lblwelcomeToAdmin.setToolTipText("");
		lblwelcomeToAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblwelcomeToAdmin.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblwelcomeToAdmin.setBounds(23, 31, 399, 36);
		contentPane.add(lblwelcomeToAdmin);
	}

}

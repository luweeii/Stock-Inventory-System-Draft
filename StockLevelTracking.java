import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StockLevelTracking extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StockLevelTracking frame = new StockLevelTracking();
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
	public StockLevelTracking() {
		setTitle("Stock Level Tracking");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 239);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel welcomeLbl = new JLabel("<html><center>Hello Admin! Welcome to the Stock Level Tracking. Here you can edit, view inventory, and backup files!</center></html>");
		welcomeLbl.setBounds(26, 0, 461, 83);
		contentPane.add(welcomeLbl);
		
		JButton btnAddItem = new JButton("Edit Items");
		btnAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddItem.setBounds(36, 75, 125, 34);
		contentPane.add(btnAddItem);
		
		JButton btnViewInventory = new JButton("View Inventory");
		btnViewInventory.setBounds(187, 75, 125, 34);
		contentPane.add(btnViewInventory);
		
		JButton btnBackupFiles = new JButton("Backup Files");
		btnBackupFiles.setBounds(342, 75, 125, 34);
		contentPane.add(btnBackupFiles);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(10, 171, 69, 21);
		contentPane.add(btnNewButton);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(418, 171, 69, 21);
		contentPane.add(btnClose);
	}
}

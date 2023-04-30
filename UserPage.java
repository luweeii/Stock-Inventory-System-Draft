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
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JTextPane;

public class UserPage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserPage frame = new UserPage();
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
	public UserPage() {
		setTitle("Request Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 761, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 45, 110, 144);
		contentPane.add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("Select Item:");
		scrollPane.setColumnHeaderView(lblNewLabel);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Boy Bawang", "Pako", "Martilyo", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "."};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(31, 251, 682, 198);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Boy Bawang", new Integer(5)},
				{"2", "Pako", new Integer(99)},
				{"3", "Martilyo", new Integer(43)},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"ID", "Item Name", "Quantity"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Quantity:");
		lblNewLabel_1.setBounds(201, 46, 93, 13);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(261, 43, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(31, 498, 74, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Request");
		btnNewButton_1.setBounds(261, 69, 96, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(639, 498, 74, 21);
		contentPane.add(btnLogout);
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
	}
}

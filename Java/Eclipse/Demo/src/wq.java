import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class wq {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wq window = new wq();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public wq() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 277);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(78, 12, 227, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Array");
		lblNewLabel.setBounds(21, 14, 66, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Generate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(324, 12, 114, 19);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblSalinTerbalik = new JLabel("Salin terbalik");
		lblSalinTerbalik.setBounds(125, 40, 114, 15);
		frame.getContentPane().add(lblSalinTerbalik);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(78, 56, 227, 19);
		frame.getContentPane().add(textField_1);
		
		JButton button = new JButton("Generate");
		button.setBounds(324, 53, 114, 19);
		frame.getContentPane().add(button);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(42, 135, 263, 19);
		frame.getContentPane().add(textField_2);
		
		JLabel lblTambahArray = new JLabel("Tambah Array");
		lblTambahArray.setBounds(125, 87, 96, 15);
		frame.getContentPane().add(lblTambahArray);
		
		JLabel lblNilai = new JLabel("Nilai");
		lblNilai.setBounds(42, 106, 45, 15);
		frame.getContentPane().add(lblNilai);
		
		textField_3 = new JTextField();
		textField_3.setBounds(78, 104, 54, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton button_1 = new JButton("Generate");
		button_1.setBounds(324, 135, 114, 19);
		frame.getContentPane().add(button_1);
		
		JLabel lblHapusArray = new JLabel("Hapus Array");
		lblHapusArray.setBounds(125, 166, 96, 15);
		frame.getContentPane().add(lblHapusArray);
		
		JLabel lblIndeks = new JLabel("Indeks");
		lblIndeks.setBounds(31, 184, 45, 15);
		frame.getContentPane().add(lblIndeks);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(78, 182, 54, 19);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(42, 213, 263, 19);
		frame.getContentPane().add(textField_5);
		
		JButton button_2 = new JButton("Generate");
		button_2.setBounds(324, 213, 114, 19);
		frame.getContentPane().add(button_2);
		
		JLabel label = new JLabel("Indeks");
		label.setBounds(204, 106, 45, 15);
		frame.getContentPane().add(label);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(251, 104, 54, 19);
		frame.getContentPane().add(textField_6);
	}
}
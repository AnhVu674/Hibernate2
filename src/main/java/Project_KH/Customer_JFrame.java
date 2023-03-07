package Project_KH;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Customer_JFrame extends JFrame {
	DefaultTableModel tablemodel;
	

	private JPanel contentPane;
	private JTextField txtNhapThongTin;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	private AbstractButton kkk;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_JFrame frame = new Customer_JFrame();
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
	public Customer_JFrame() {
		Action action = new Manager_Customer(this);
		tablemodel = (DefaultTableModel) kkk.getModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 896, 584);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtNhapThongTin = new JTextField();
		txtNhapThongTin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNhapThongTin.setText("Nhap thong tin khach hang");
		txtNhapThongTin.setBounds(0, 10, 882, 40);
		contentPane.add(txtNhapThongTin);
		txtNhapThongTin.setColumns(10);

		JPanel panel = new JPanel();
		panel.setToolTipText("Nhap thong tin KH\r\n");
		panel.setBounds(0, 10, 882, 228);
		contentPane.add(panel);
		panel.setLayout(null);

		lblNewLabel = new JLabel("Ten KH:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 58, 93, 31);
		panel.add(lblNewLabel);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setBounds(10, 99, 93, 31);
		panel.add(lblEmail);

		JLabel lblSodt = new JLabel("SoDT:");
		lblSodt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSodt.setBounds(10, 140, 93, 31);
		panel.add(lblSodt);

		JLabel lblDiaChi = new JLabel("Dia Chi:");
		lblDiaChi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDiaChi.setBounds(10, 185, 93, 31);
		panel.add(lblDiaChi);

		textField = new JTextField();
		textField.setBounds(101, 58, 534, 29);
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(101, 99, 534, 29);
		panel.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(101, 140, 534, 29);
		panel.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(101, 181, 534, 29);
		panel.add(textField_3);

		JButton btnNewButton = new JButton("Luu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(697, 58, 85, 29);
		panel.add(btnNewButton);

		JButton btnSua = new JButton("Sua");
		btnSua.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSua.setBounds(697, 99, 85, 29);
		panel.add(btnSua);

		JButton btnXoa = new JButton("Xoa");
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnXoa.setBounds(697, 142, 85, 29);
		panel.add(btnXoa);

		JButton btnfind = new JButton("Find");
		btnfind.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnfind.setBounds(697, 185, 85, 29);
		panel.add(btnfind);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 248, 892, 299);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		table = new JTable();
		table.setToolTipText("kkk");
		table.setModel(new DefaultTableModel(new Object[][] { { null, "", "", null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null }, },
				new String[] { "STT", "Ho ten", "Email", "So DT", "Dia Chi" }));
		table.setBounds(0, 273, 828, -272);
		panel_1.add(table);
	}
}

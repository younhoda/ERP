package erp;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class BookOrder extends JFrame implements ActionListener {
	private JButton btnNewButton;
	private JTextField textField_1;
	private JTextField textField_2;

	public BookOrder() {
		setBackground(Color.GRAY);
		getContentPane().setBackground(Color.CYAN);

		getContentPane().setLayout(null);

		btnNewButton = new JButton("등록");

		JLabel lblNewLabel = new JLabel("바코드번호");
		lblNewLabel.setBounds(12, 196, 66, 15);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("가격");
		lblNewLabel_2.setBounds(12, 135, 57, 15);
		getContentPane().add(lblNewLabel_2);

		btnNewButton.setBounds(12, 275, 97, 23);
		getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("발주서 전체보기");
		btnNewButton_1.setBounds(133, 275, 153, 23);
		getContentPane().add(btnNewButton_1);

		textField_1 = new JTextField();
		textField_1.setBounds(81, 128, 179, 30);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(81, 189, 179, 29);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);

		btnNewButton.addActionListener(this);
		btnNewButton_1.addActionListener(this);

		setTitle("발주서등록");
		setSize(823, 581);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BookOrder();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		BookOrderDAO in = new BookOrderDAO();
		if (e.getSource() == btnNewButton) {

			String price = textField_1.getText();
			int priceInt = Integer.parseInt(price);

			BookOrderDAO dao = new BookOrderDAO();
			BookOrderDTO dto = new BookOrderDTO(textField_2.getText(), priceInt);

			dao.insert(dto);

		}
	}
}
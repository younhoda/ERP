package erp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Member;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;



import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JComboBox;

public class BookMember extends JFrame implements ActionListener {
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnbtnNewButton_1,btnNewButton;

	public BookMember() {
		getContentPane().setBackground(Color.CYAN);
		getContentPane().setLayout(null);
		
		 btnNewButton = new JButton("등록");
		btnNewButton.setBounds(12, 434, 97, 23);
		getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setBounds(175, 434, 97, 23);
		getContentPane().add(btnNewButton_1);
		
		
		JLabel lblNewLabel = new JLabel("회원가입");
		lblNewLabel.setBounds(136, 29, 230, 15);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setBackground(Color.CYAN);
		lblNewLabel_1.setBounds(12, 76, 57, 26);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("패스워드");
		lblNewLabel_2.setBounds(12, 126, 57, 26);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("이름");
		lblNewLabel_3.setBounds(12, 182, 57, 26);
		getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("직급");
		lblNewLabel_4.setBounds(12, 236, 57, 26);
		getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("전화번호");
		lblNewLabel_5.setBounds(12, 292, 57, 15);
		getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("주소");
		lblNewLabel_6.setBounds(12, 332, 57, 15);
		getContentPane().add(lblNewLabel_6);

		textField = new JTextField();
		textField.setBounds(103, 73, 323, 34);
		getContentPane().add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(103, 129, 326, 34);
		getContentPane().add(passwordField);

		textField_1 = new JTextField();
		textField_1.setBounds(106, 187, 323, 34);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(106, 239, 323, 34);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(103, 283, 323, 34);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(103, 332, 326, 34);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);

		
		
		
		btnNewButton.addActionListener(this);
		btnNewButton_1.addActionListener(this);

		setTitle("회원가입");
		setSize(604, 600);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		BookInput in = new BookInput();
		if(e.getSource()==btnNewButton) {
		BookDTO library = new BookDTO(textField.getText(), passwordField.getText(), textField_1.getText(),
				textField_2.getText(), textField_3.getText(), textField_4.getText());
		JOptionPane.showMessageDialog(null, "등록되었습니다.");
		in.input(textField.getText(), library);
		
	}
	}
	public static void main(String[] args) {
		new BookMember();
	}
}

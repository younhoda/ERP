package erp;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;

public class BookSchedule extends JFrame implements ActionListener {
	private JTextField textField;
	private JButton btnNewButton, btnNewButton_1;
	private JTextField textField_1;

	JTextArea textArea_1;

	public BookSchedule() {
		getContentPane().setBackground(Color.PINK);

		getContentPane().setLayout(null);
		
		btnNewButton = new JButton("등록");

		btnNewButton.setBounds(19, 433, 97, 23);
		getContentPane().add(btnNewButton);

		btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setBounds(282, 429, 97, 23);
		getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("작성자");
		lblNewLabel.setBounds(21, 52, 57, 40);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("제목");
		lblNewLabel_1.setBounds(19, 86, 55, 40);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("오늘의 회사일정");
		lblNewLabel_2.setBounds(44, 151, 237, 15);
		getContentPane().add(lblNewLabel_2);

		textField = new JTextField();
		textField.setBounds(74, 63, 177, 21);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(74, 96, 176, 21);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		 textArea_1 = new JTextArea();
		textArea_1.setBounds(19, 176, 360, 247);
		getContentPane().add(textArea_1);
		

		btnNewButton.addActionListener(this);
		btnNewButton_1.addActionListener(this);

		setTitle("ERP 스케줄관리입니다.");
		setSize(765, 550);
		setVisible(true);

	}

	public static void main(String[] args) {
		new BookSchedule();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		WorkSaveRead save = new WorkSaveRead();
		if (e.getSource() == btnNewButton) {
			BookScheduleDTO scheule = new BookScheduleDTO(textField.getText(), textField_1.getText(),
			textArea_1.getText());
			JOptionPane.showMessageDialog(null, "게시물이 등록되었습니다.");
			save.WorkSaveRead(scheule);
		}
	}
}

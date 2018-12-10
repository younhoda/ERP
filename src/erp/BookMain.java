package erp;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URL;

import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JEditorPane;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JTree;
import javax.swing.event.CaretListener;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class BookMain extends JFrame {
	private JButton btnNewButton_2, btnNewButton, btnNewButton_3;

	public BookMain() {
		getContentPane().setLayout(null);

		JButton btnNewButton_3 = new JButton("스케쥴등록");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookSchedule sch = new BookSchedule();
			}
		});
		btnNewButton_3.setBounds(155, 42, 116, 23);
		getContentPane().add(btnNewButton_3);

		btnNewButton = new JButton("발주등록");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookOrder order = new BookOrder();
			}
		});

		btnNewButton.setBounds(40, 42, 116, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("로그아웃");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookLogin name = new BookLogin();
				JOptionPane.showMessageDialog(null,"로그아웃 하셨습니다.");
			}
		});
		btnNewButton_4.setBounds(272, 42, 97, 23);
		getContentPane().add(btnNewButton_4);

		 
		

		setSize(713, 601);
		setTitle("ERP 메인화면입니다.");
		setVisible(true);

	}

	public static void main(String[] args) {

		new BookMain();
	}
}

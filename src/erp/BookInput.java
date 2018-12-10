package erp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class BookInput {

	//회원정보 등록
	public void input(String id,BookDTO library) {
		
		File file = new File(library.getId()+".txt");
		
		if(file.exists()) {
			System.out.println(library.getId()+"중복되었습니다."+"다시 가입 하시길 바랍니다.");
		}else {
			try {
				FileWriter writer = new FileWriter(file);
				writer.write(library.getId()+"\r\n");
				writer.write(library.getPw()+"\r\n");
				writer.write(library.getName()+"\r\n");
				writer.write(library.getAuthoity()+"\r\n");
				writer.write(library.getTel()+"\r\n");
				writer.write(library.getAddr()+"\r\n");
				
				writer.flush();
				writer.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Scanner input() {
		String fileName=JOptionPane.showInputDialog("아이디를 입력해주세요>>");
		Scanner sc = null;
		
		try {
			sc = new Scanner(new File(fileName+".txt"));
			
			return sc;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return sc;
	}
	
	
	

	
}

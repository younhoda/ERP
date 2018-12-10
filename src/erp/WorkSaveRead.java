package erp;

import java.io.FileWriter;

public class WorkSaveRead {

 public void WorkSaveRead(BookScheduleDTO books ) {
	try {
		FileWriter file = new FileWriter(books+".txt");
		file.write(books.getName()+"\r\n");
		file.write(books.getTitle()+"\r\n");
		file.write(books.getContent()+"\r\n");
		
		file.flush();
		file.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
}


}

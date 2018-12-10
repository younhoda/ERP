package erp;

public class BookScheduleDTO {
	private String name;  //작성자
	private String title;	//제목
	private String content; //오늘의회사일정
	
	public BookScheduleDTO(String name, String title, String content) {
		super();
		this.name = name;
		this.title = title;
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
	
	

	
	
	
	
	

}

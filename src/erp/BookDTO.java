package erp;

public class BookDTO {

	private String id;
	private String pw;
	private String name;
	private String Authoity;
	private String tel;
	private String Addr;
	
	public BookDTO(String id, String pw, String name, String authoity, String tel, String addr) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		Authoity = authoity;
		this.tel = tel;
		Addr = addr;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthoity() {
		return Authoity;
	}

	public void setAuthoity(String authoity) {
		Authoity = authoity;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return Addr;
	}

	public void setAddr(String addr) {
		Addr = addr;
	}

	@Override
	public String toString() {
		return "LibraryDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", Authoity=" + Authoity + ", tel=" + tel
				+ ", Addr=" + Addr + "]";
	}
	
	
	
	
	
	
	
}

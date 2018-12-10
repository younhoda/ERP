package erp;



public class BookOrderDTO {
	
	private String isbn;
	private int price;
	
	public BookOrderDTO(String isbn, int price) {
		super();
		this.isbn = isbn;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookOrderDTO [isbn=" + isbn + ", price=" + price + "]";
	}
	
	

	
	

	

}

package classWork.program1;

public class Book {
	private long isbn;
	private String title;
	private String author;
	private float price;
	
	public Book(){
		
	}
	public Book(long isbn, String title, String author, float price) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public void displayDetails() {
		System.out.println("ISBN:"+getIsbn()+"\n"+"Book Title:"+ getTitle()+"\n"+"Book Author:"+getAuthor()+"\n"+"Book Price:"+getPrice());
	}
	public void discountedPrice(float price,float discount) {
		float disPrice=price-((discount/100)*price);
		System.out.println(disPrice);
	}
	
}

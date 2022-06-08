package classWork.program1;

public class BookMain {

	public static void main(String[] args) {
		long isbn=123456;
		String title="The Alchemist";
		String author="Paulo Coelho";
		float price=500f;
		float discount=20f;
		Book obj=new Book(isbn,title,author,price);
		
		System.out.println("******Book Details********");
		obj.displayDetails();
		obj.discountedPrice(price, discount);
	}

}

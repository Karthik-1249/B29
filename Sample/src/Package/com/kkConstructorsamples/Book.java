package Package.com.kkConstructorsamples;

public class Book {
	int bookid;
	String name;
	double price;
	String language;

	Book(int bookid, String name, double price, String language) {
		this.bookid = bookid;
		this.name = name;
		this.price = price;
		this.language = language;
	}

	public static void main(String[] args) {
		Book b = new Book(123, "Java", 2500.00, "English");
		System.out.println(b.bookid);
		System.out.println(b.name);
		System.out.println(b.price);
		System.out.println(b.language);
	}
}

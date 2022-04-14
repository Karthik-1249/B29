package Package.com.kk.samplesetexamples;

import java.util.HashSet;

public class Book {
	int id;
	String name;

	public Book(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]\n";
	}

	public static void main(String[] args) {
		Book b1 = new Book(1, "Java");
		Book b2 = new Book(2, "CPP");
		Book b3 = new Book(3, "Csharp");
		Book b4 = new Book(3, "Csharp");
		HashSet<Book> books = new HashSet<>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		System.out.println(books);
	}

}

package Package.com.kk.sampleconstructorchaining;

public class Tshirt {
	String color;
	int price;
	boolean isPrinted;
	char size;

	public Tshirt(String color, int price, boolean isPrinted, char size) {
		this.color = color;
		this.price = price;
		this.isPrinted = isPrinted;
		this.size = size;
	}

	public Tshirt(String color, char size) {
		this(color, 0, false, size);
	}

	public Tshirt(String color) {
		this(color, 0, false, '\u0000');
	}

	@Override
	public String toString() {
		return "Tshirt [color=" + color + ", price=" + price + ", isPrinted=" + isPrinted + ", size=" + size + "]";
	}

	public static void main(String[] args) {
		Tshirt t=new Tshirt("Black",'L');
		System.out.println(t);
		

	}

}

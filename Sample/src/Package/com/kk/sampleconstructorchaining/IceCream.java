package Package.com.kk.sampleconstructorchaining;

public class IceCream {
	String flavour;
	boolean addNuts;
	char size;

	// alt+shift+s+o
	IceCream(String flavour, boolean addNuts, char size) {
		this.flavour = flavour;
		this.addNuts = addNuts;
		this.size = size;
	}

	IceCream(String flavour) {
		this(flavour, true, 'R');
	}

	IceCream(String flavour, char size) {
		this(flavour, false, size);
	}

	// tostring() - alt + shift + s + s
	@Override
	public String toString() {
		return "IceCream [flavour=" + flavour + ", addNuts=" + addNuts + ", size=" + size + "]";
	}

	public static void main(String[] args) {
		IceCream i = new IceCream("Black Current");
		System.out.println(i);
		IceCream i2 = new IceCream("choclate", false, 'L');
		System.out.println(i2);

	}

}

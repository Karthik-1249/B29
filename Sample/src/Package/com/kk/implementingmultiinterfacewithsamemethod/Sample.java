package Package.com.kk.implementingmultiinterfacewithsamemethod;

public class Sample implements Interface1, Interface2 {

	@Override
	public void print() {
		System.out.println("Printing");

	}

	public static void main(String[] args) {
		Interface1 i = new Sample();
		i.print();

		Interface2 i1 = new Sample();
		i1.print();

	}
}

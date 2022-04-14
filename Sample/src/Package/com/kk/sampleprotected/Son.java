package Package.com.kk.sampleprotected;

import Package.com.kk.sampleprotectedaccessmodifier.Father;

public class Son extends Father {
	int age;
	private int id;
	// if you need access to the protected member outside the package, then the class
	// that needs access to protected member must become a sub class
	public static void main(String[] args) {
		Son s=new Son();
		System.out.println(s.bankBalance);
	}
}

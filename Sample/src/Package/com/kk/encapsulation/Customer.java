package Package.com.kk.encapsulation;

public class Customer {
	private int customerId;
	private String custometName;
	private int age;
	private char gender;
	private long mobileNumber;

	public int getCustomerID() {
		return this.customerId;
	}

	public void setCustomerID(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return this.custometName;
	}

	public void setCustometName(String custometName) {
		this.custometName = custometName;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return this.gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public long getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
}

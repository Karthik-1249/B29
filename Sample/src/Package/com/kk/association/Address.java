package Package.com.kk.association;

public class Address {
	int houseNo;
	String street;
	String city;
	int pincode;

	public Address(int houseNo, String street, String city, int pincode) {
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}

}

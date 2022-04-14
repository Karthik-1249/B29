package Package.com.kk.methodoverloading;

public class Account {
	String accHolderName;
	long accNum;
	String ifscCode;

	
	@Override
	public String toString() {
		return "Account [accHolderName=" + accHolderName + ", accNum=" + accNum + ", ifscCode=" + ifscCode + "]";
	}


	Account(String accHolderName,long accNum,String ifscCode){
		this.accHolderName=accHolderName;
		this.accNum=accNum;
		this.ifscCode=ifscCode;
	}

}

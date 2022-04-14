package Package.com.kk.methodoverloading;

public class QRCode {
	String qRCodeScan;

	@Override
	public String toString() {
		return "QRCode [qRCodeScan=" + qRCodeScan + "]";
	}

	QRCode(String qRCodeScan){
		this.qRCodeScan=qRCodeScan;
	}
	
}

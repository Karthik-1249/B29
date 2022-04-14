package Package.com.kk.sampleloggercreation;

import java.util.logging.Logger;

public class Sample {

	private static final Logger logger = Logger.getLogger("Karthik");

	public static void main(String[] args) {
		logger.info("Hello world");
		String format = String.format("Mss me %s", "word");
		logger.finest(format);

	}

}

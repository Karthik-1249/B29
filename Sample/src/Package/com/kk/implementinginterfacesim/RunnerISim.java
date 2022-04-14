package Package.com.kk.implementinginterfacesim;

import java.util.Scanner;

public class RunnerISim {
	public static void main(String[] args) {
		System.out.println("Enter the Searvice provider you want");
		Scanner s = new Scanner(System.in);
		String name = s.next();
		ISim i = null;
		if (name.equalsIgnoreCase("airtel")) {
			i = new AirtelSimImpl();
		} else if (name.equalsIgnoreCase("jio")) {
			i = new JioSimImpl();
		} else if (name.equalsIgnoreCase("BSNL")) {
			i = new BsnlImpl();
		}
		i.call();
		i.sms();
		i.browse();
		if (i instanceof AirtelSimImpl) {
			AirtelSimImpl a = (AirtelSimImpl) i;
			a.airtelTv();
		} else if (i instanceof JioSimImpl) {
			JioSimImpl j = (JioSimImpl) i;
			j.jioTv();
		} else if (i instanceof BsnlImpl) {
			BsnlImpl b = (BsnlImpl) i;
		}
	}

	/*
	 * JioSimImpl r = new JioSimImpl(); r.call(); r.jioTv(); r.sms(); r.browse();
	 * 
	 * System.out.println("-----------------"); AirtelSimImpl a = new
	 * AirtelSimImpl(); a.call(); a.sms(); a.browse(); a.airtelTv();
	 * 
	 * System.out.println("-----------------"); BsnlImpl b = new BsnlImpl();
	 * b.call(); b.sms(); b.browse(); b.connectWithSupport();
	 */
}

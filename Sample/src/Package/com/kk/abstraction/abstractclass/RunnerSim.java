package Package.com.kk.abstraction.abstractclass;

public class RunnerSim {
	public static void main(String[] args) {
		// Based on the object stored in the reference, to the method call, which class
		// implementation
		// must be invoked will be decided by JVM at runtime, this is known as run time
		// polymorphism

		AbstractSim a = new Sim();
		a.call();
		a.mms();
		a.sms();
		if (a instanceof Sim) {
			Sim s = (Sim) a;
			s.sos();
		}
	}
}

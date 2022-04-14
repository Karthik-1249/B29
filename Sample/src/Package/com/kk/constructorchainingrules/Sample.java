package Package.com.kk.constructorchainingrules;

public class Sample {
	Sample() {
		this(10);
	}

	Sample(int x) {
		this(10, 20);
	}

	Sample(int x, int y) {

	}

	// one constructor can call only one another constructor i.e., either same class constructor( this()) or super class constructor(super())
	// constructor call must be the first executable statement inside the constructor
	// atleast one constructor will not invoke the same class constructor [error: Recursive constructor invocation Sample]

}

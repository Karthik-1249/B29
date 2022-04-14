package Package.com.kk.implementingmultiinterfacewithsamemethod;

import java.io.Serializable;

public class Department implements Serializable {
	private int deptno;
	private String deptname;
	private int noOfEmployees;

	public Department() {
		super();

	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

}

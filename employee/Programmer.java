package com.prodapt.employee;

public class Programmer extends Employee {

	public Programmer() {
		salary=45000;
		designation="Programmer";
	}

	@Override
	public void raiseSalary() {
		salary=salary+6000;
	}

}

package com.prodapt.employee;

public class Clerk extends Employee {
	
	public Clerk() {
		salary=10000;
		designation="Clerk";
	}

	@Override
	public void raiseSalary() {
		salary=salary+2000;
	}
	
}

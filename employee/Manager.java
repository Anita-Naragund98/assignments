package com.prodapt.employee;

public class Manager extends Employee{
	
	public Manager() {
		salary=30000;
		designation="Manager";
	}
	@Override
	public void raiseSalary() {
		salary=salary+5000;
	}

}

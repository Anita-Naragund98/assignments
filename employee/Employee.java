package com.prodapt.employee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public abstract class Employee {
	int empId;
	String name;
	int age;
	String designation;
	int salary;
	Scanner sc=new Scanner(System.in);
	
	public Employee() {
		try
		{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter EmpId");
		empId=Integer.parseInt(br.readLine());
		System.out.println("Enter name");
		name=br.readLine();
		System.out.println("Enter age");
		age=Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{

		}
	} 
	
	public abstract void raiseSalary();
	
	public void display() {
		    System.out.println("EmpId       : "+empId);
			System.out.println("Name        : " + name);
			System.out.println("Age         : " + age);
			System.out.println("Designation : " + designation);
			System.out.println("Salary      : " + salary);
	}

	
	
	
}

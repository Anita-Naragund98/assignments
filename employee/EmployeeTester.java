package com.prodapt.employee;

import java.util.Scanner;

public class EmployeeTester {

	public static void main(String[] args) {
		int c = 0, ch = 0, i = 0;
		Scanner sc = new Scanner(System.in);
		Employee employee[] = new Employee[100];
		Employee emp=null;
		do {
			System.out.println("1.Create");
			System.out.println("2.Display");
			System.out.println("3.RaiseSalary");
			System.out.println("4.Exit");
			System.out.println("Enter choice");
			c = sc.nextInt();
			switch (c) {
			case 1:
				do {
					System.out.println("1.Clerk");
					System.out.println("2.Manager");
					System.out.println("3.Programmer");
					System.out.println("4.Exit");
					System.out.println("Enter your choice");
					ch = sc.nextInt();
					switch (ch) {
					case 1:
						employee[i] = new Clerk();
						i++;
						break;
					case 2:
						employee[i] = new Manager();
						i++;
						break;
					case 3:
						employee[i] = new Programmer();
						i++;
						break;
					case 4:
						System.out.println("Exiting..........");
						break;
					default:
						System.out.println("Please enter a valid choice.....");
						break;
					}
				} while (ch != 4);
				break;
			case 2:
				try {
					for (Employee employee2 : employee) {
						if (employee2 != null)
							employee2.display();
					}
				} catch (Exception e) {
					System.out.println("No records!!!!");
				}
				break;
			case 3:
				try {
					System.out.println("Salary raised.........");
					for (Employee employee2 : employee) {
						if (employee2 != null)
							employee2.raiseSalary();
			
					}
				} catch (Exception e) {
					System.out.println("No records!!!!");
				}
				break;
			case 4:
				System.out.println("Exiting..........");
				break;
			default:
				System.out.println("Please enter a valid choice.....");
				break;
			}
		} while (c != 4);
	}
}
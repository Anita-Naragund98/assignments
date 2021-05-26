package com.prodapt.employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class EmployeeDataStore {

	public static void main(String[] args) {
		try {
			File file = new File("G:/eclipse/CleverIdiot/prodapt/src/com/prodapt/employee/data_store/Employee_data.txt");
			file.createNewFile();
			PrintWriter writer = new PrintWriter(new FileOutputStream(file, true));
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			ArrayList<Employee> employee = new ArrayList<Employee>();
			int c = 0, ch = 0;
			do {
				System.out.println("1.Create");
				System.out.println("2.Display");
				System.out.println("3.RaiseSalary");
				System.out.println("4.Exit");
				System.out.println("Enter choice");
				c = Integer.parseInt(br.readLine());
				switch (c) {
				case 1:
					do {
						System.out.println("1.Clerk");
						System.out.println("2.Manager");
						System.out.println("3.Programmer");
						System.out.println("4.Exit");
						System.out.println("Enter your choice");
						ch = Integer.parseInt(br.readLine());
						Employee emp = null;
						switch (ch) {
						case 1:
							emp = new Clerk();
							break;
						case 2:
							emp = new Manager();
							break;
						case 3:
							emp = new Programmer();
							break;
						case 4:
							System.out.println("Exiting....");
							break;
						default:
							System.out.println("Please enter a correct choice!");
							break;
						}
						if (ch == 1 || ch == 2 || ch == 3) {
							boolean exist = false;
							for (Employee empl : employee) {
								if (empl.empId == emp.empId || empl.name.equals(emp.name) && empl.age == emp.age) {
									System.out.println("Record is already their in file...!");
									exist = true;
									break;
								}
							}
							if (!exist) {
								employee.add(emp);
								writer.println("*****************************");
								writer.println("EmpId       :" + emp.empId);
								writer.println("Name        :" + emp.name);
								writer.println("Age         :" + emp.age);
								writer.println("Salary      :" + emp.salary);
								writer.println("Designation :" + emp.designation);
								writer.println("*****************************");
								writer.flush();

							}
						}
					} while (ch != 4);
					break;

				case 2:
					if (employee.size() == 0) {
						System.out.println("No records found!!!");
						break;
					} else {
						for (Employee e : employee)
							e.display();
					}
					break;

				case 3:
					if (employee.size() == 0) {
						System.out.print("No records found!!!");
						break;
					} else {
						for (Employee e : employee)
							e.raiseSalary();
						System.out.print("Salary is raised.......");
					}
					break;

				case 4:
					System.out.print("Exiting....!");
					break;
				default:
					System.out.print("Please enter the correct choice....");

				}
			} while (c != 4);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

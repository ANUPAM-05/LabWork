package com.cg.eis.pl;

import java.util.Scanner;
import com.cg.eis.bean.*;
public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id");
		int empid = sc.nextInt();
		System.out.println("Enter Employee Name");
		String name = sc.next();
		System.out.println("Enter Employee salary");
		int salary = sc.nextInt();
		System.out.println("Enter Employee Designation");
		String designation = sc.next();
		sc.close();
		
	}

}

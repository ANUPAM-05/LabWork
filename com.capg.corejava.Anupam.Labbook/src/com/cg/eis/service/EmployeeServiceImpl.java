package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl {

	public static void main(String[] args) {
		@Override
		public Employee getEmployee(int empid, String name, double salary, String designation, String insuranceScheme ) {
			Employee emp = new Employee();
			emp.setEmpid(empid);
			emp.setName(name);
			emp.setSalary(salary);
			emp.setDesignation(designation);
			emp.setInsuranceScheme(insuranceScheme);
			return emp;
		}
		

	}

}

package com.cg.eis.service;

public interface EmployeeService {
	Employee getEmployee(int empid, String name, double salary, String designation, String insuranceScheme );
	void getInsuranceScheme(Employee emp);
	void getDetails(Employee emp);
}

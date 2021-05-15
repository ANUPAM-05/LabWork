package lab9;

import java.util.function.BiFunction;

class Employee{
	String fname;
	String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	//public Employee(String fname, String lname) {
		//super();
		//this.fname = fname;
		//this.lname = lname;
	//}
	public String FullName(String fname,String lname) {
		return (fname.concat(lname));
	}
	
}
public class Ex4InstanceCreationDemo {
	public static void main(String[] args) {
		BiFunction<String,String,String> fun= new Employee()::FullName;
		String fullname=fun.apply("Anupam", " Singh");
		System.out.println(fullname);
	}
}

package com.technoelevate.arralistdemo;

public class Employee  implements Comparable<Employee>  {
	int empid;
	String name;
	double salary;
	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return this.empid-o.empid;//comparable inferfax
		//return (int) (this.salary-o.salary);
		
		//return this.name.compareTo(o.name);
	}
	
	

}

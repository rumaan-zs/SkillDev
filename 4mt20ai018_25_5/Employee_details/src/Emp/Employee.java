package Emp;

import java.io.Serializable;

public class Employee implements Serializable{
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
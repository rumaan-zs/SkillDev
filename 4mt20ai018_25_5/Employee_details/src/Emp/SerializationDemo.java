package Emp;

import java.io.*;
import java.util.Scanner;

public class SerializationDemo {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String filename=in.next();
		ObjectOutputStream oout = null;
		FileOutputStream file=null;
		try 
		{
			file= new FileOutputStream(filename,true);
			System.out.println("employee id:");
			int id=in.nextInt();
			System.out.println("Employee name:");
			String name= in.next();
			System.out.println("salary:");
			double salary = in.nextDouble();
			Employee emp = new Employee(id,name,salary);
			oout= new ObjectOutputStream(file);
			oout.writeObject(emp);
			oout.close();
			file.close();
			}catch(Exception ex) {
			System.out.println("error");
		}
		

	}

}
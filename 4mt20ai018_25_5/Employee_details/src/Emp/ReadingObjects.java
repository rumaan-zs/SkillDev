package Emp;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadingObjects 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter File Name : ");
		String fileName = new java.util.Scanner(System.in).next();
		FileInputStream myFile = null;
		ObjectInputStream ois = null;
		try 
		{
			myFile = new FileInputStream(fileName);
			ois= new ObjectInputStream(myFile);
			Employee emp = (Employee)ois.readObject();
			System.out.println(emp);
			ois.close();
			myFile.close();
		}
		catch(java.io.FileNotFoundException ex)
		{
			System.out.println(fileName + " Does not exist!!");
		}
		catch(java.io.IOException ex) 
		{
			System.out.println("Error "+ex.getMessage());
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println("Error "+ex.getMessage());
		}
	}
}

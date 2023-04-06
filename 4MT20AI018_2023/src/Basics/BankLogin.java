package Basics;

import java.util.Scanner;

public class BankLogin 
{

	public static void main(String[] args) 
	{
		String usern = "user";
		String passs = "pass";
		Scanner in = new Scanner(System.in);
		System.out.println("Username");
		String user = in.nextLine();
		System.out.println("Password");
		String pass = in.nextLine();
		//str1.equals(str2);
		for(int i=3; i>0 ; i--)
		{
			if(usern.equals(user)==true && passs.equals(pass)==true)
			{
				System.out.println("Login Successful");
				break;
			}
			System.out.println("Incorrect USername or Password, You have %d tries",i-1);
		}
		
	}

}

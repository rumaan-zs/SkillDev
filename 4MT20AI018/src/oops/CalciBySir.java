package oops;

public class CalciBySir 
{
	public static long powerInt(int num1, int num2)
	{
		long result=num1;
		for(int i=2; i<=num2 ; result*=num1, i++);
		return result;
	}
	public static double powerDouble(int num1, int num2)
	{
		return(Math.pow(num1, num2));
	}
}

package Basics;

import java.util.Scanner;

import java.util.Arrays;

public class CoinChange 
{
	public static void reverseArray(int[] arr)
	{
		for(int i = 0, j = arr.length-1; i<j;i++,j-- )
			//Swapping opposite elements of array to reverse it
			arr[i] = (arr[i]+arr[j]) - (arr[j] = arr[i]);
	}

	public static void main(String[] args)
	{
		int sum = 0;
		long amount;
		Scanner in = new Scanner(System.in);
		//getting denominations in string format
		String sdenoms[] = in.nextLine().split(" ");
		int[] denoms = new int[sdenoms.length];
		//Converting string array to integer elements
		for(int i = 0; i<sdenoms.length; i++)
			denoms[i]=Integer.parseInt(sdenoms[i]);
		Arrays.sort(denoms);
		reverseArray(denoms);
		amount = in.nextLong();
		for(int i = 0; amount !=0; i++)
		{
			sum = (int)(sum + amount / denoms[i]);
			amount = amount % denoms[i];
		}
		System.out.println(sum);
	}

}

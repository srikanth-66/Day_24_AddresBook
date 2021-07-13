package Day5_Basic_core_programs;

import java.util.Scanner;

public class Day5_Swap_two_numbers 
{

	public static void main(String[] args)
	{
		System.out.println("enter two numbers to swap");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.printf("the two values before swapping are a= %d , b=%d ",a,b);
		System.out.println("\n");
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.printf("the two values After swapping are a=%d ,b=%d ",a,b);
	}

}

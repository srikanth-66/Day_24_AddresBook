package Day5_Basic_core_programs;

import java.util.Scanner;

public class Day5_Largest_of_Three_Numbers {
	public static void main(String[] args) {
		System.out.println("enter the three numbers to find the largest among them");
		Scanner sc =new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		System.out.println("number 1 is"+num1);
		System.out.println("number 2 is"+num2);
		System.out.println("number 3 is"+num3);
		if(num1>num2 && num1>num3)
		{
			System.out.println("num1 is largest"+num1);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("num2 is largest"+num2);

		}
		else
			System.out.println("num3 is largest"+num3);
		
	}

}

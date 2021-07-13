package Day5_Basic_core_programs;
import java.util.Scanner;
import java.lang.*;

public class Day5_Quotient_Remainder
{
	public static void main(String[] args) 
	{
		System.out.println("enter a number to find both quotient and remainder of the number");
		Scanner sc=new Scanner(System.in);
		float number1=sc.nextInt();
		float number2=sc.nextInt();

		if(number1>0)
		{
			float quotient=(number1/number2);
			System.out.println("the quotient is"+quotient);
		}
		if(number1>0)
		{
			float remainder=(number1%number2);
			System.out.println("the Remainder is"+remainder);
		}
		else
		{
			System.out.println("please give the required input");
		}
	}
}

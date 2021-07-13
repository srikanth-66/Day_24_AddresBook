package Day5_Basic_core_programs;
import java.util.Scanner;
public class Day5_Even_Odd 
{
	public static void main(String[] args) 
	{
		System.out.println("enter a number to check its even or odd");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println("the given number is"+number);
		if(number%2== 0)
		{
			System.out.println("number is even");	
			
		}
		else
			System.out.println("number is odd");
		
	}

}

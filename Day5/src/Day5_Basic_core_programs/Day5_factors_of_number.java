package Day5_Basic_core_programs;

import java.util.Scanner;
import java.lang.*;

public class Day5_factors_of_number 
{
	public static void main(String[] args) 
	{
		System.out.println("enter a number to find prime factor");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i = 2; i< num; i++)
		{
	         while(num%i == 0) 
	         {
	            System.out.println(i+" ");
	            num = num/i;
	         }
	      }
	      if(num >2) {
	         System.out.println(num);
	      }
		
	}
	

}

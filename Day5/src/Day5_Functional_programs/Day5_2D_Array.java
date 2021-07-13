package Day5_Functional_programs;
import java.util.Scanner;

public class Day5_2D_Array {
	public static void main(String[] args)   
	{     
			int m,n,i,j;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the no of rows want");
			m= sc.nextInt();
			System.out.println("enter the no of coloumns want");
			n= sc.nextInt();
			int array[][]=new int [m][n];
			System.out.println("enter the values into array");
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					array[i][j]=sc.nextInt();
				}
			}
			System.out.println(" the values of array");

			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.printf(array[i][j]+" ");
				}
				System.out.println(" ");

			}
			

			
	}   

}

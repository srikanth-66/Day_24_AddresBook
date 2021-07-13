package Day5_Basic_core_programs;
import java.util.Scanner;
public class Day5_power_of_2
{
		public void power(int N, int P)
	    {
	        int pow = 1;
	        for (int i = 1; i <= P; i++)
	            pow *= N;
	    	System.out.printf("the power of a given number"+pow);
	    }
	    public static void main(String[] args)
	    {
	    	Scanner sc =new Scanner(System.in);
	    	System.out.println("enter the number you want to find base and power");
	    	int n=sc.nextInt();
	    	int p=sc.nextInt();
	    	Day5_power_of_2 obj=new Day5_power_of_2();
	    	obj.power(n,p);
	    }
}

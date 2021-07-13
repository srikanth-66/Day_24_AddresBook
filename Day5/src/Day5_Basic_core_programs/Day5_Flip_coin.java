package Day5_Basic_core_programs;

import java.util.Scanner;

public class Day5_Flip_coin
{
	static float hcount=0;
	static float  tcount=0;
	static float hper=0;
	static float tper=0;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how times you want to flip a coin");
		int no_times_coin_flip=sc.nextInt();
		for(int flip=1;flip<=no_times_coin_flip;flip++)
		{
			if(Math.random()<=0.5)
			{
				//System.out.println("coin flip is head");
				hcount++;
				//System.out.println("coin flip is head");

			
			}
			else
			{
				//System.out.println("coin flip is tail");
				tcount++;
			}
		}
		System.out.printf("head count %f\n",hcount);
		System.out.printf("tail count %f\n",tcount);
		hper=(hcount/no_times_coin_flip)*100;
		tper=(tcount/no_times_coin_flip)*100;
		System.out.printf("head coin flip count percentage = %f\n",hper);
		System.out.printf("tail coin flip count percentage = %f\n",tper);




	}
}

package Day_4_UC;

import java.util.Scanner;

public class Day_4_UC5 
{
		public void empWage()
		{
			int emp_f=1;
			int emp_p=2;
			int emp_a=0;
			int emp_wage_hr=20;
			int emp_day_hr_work=8;
			int emp_day_hr_p_work=4;
			int emp_month_day_hr_work=20;
			double total_emp_wage=0;
			double empCheack=Math.floor(Math.random()*10)%3;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter 1 for fulltime enter 2 for part time  0 for absent wages respectively");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1 : if(ch==emp_f) 
					{
						System.out.println("employee is present full time overall a month");
						total_emp_wage=emp_wage_hr*emp_day_hr_work*emp_month_day_hr_work;
						System.out.println("the wage of a employee is "+total_emp_wage);
					}
			break;
			case 2:	if(ch==emp_p) 
						{
							System.out.println("employee is present half day work overall a month ");
							total_emp_wage=emp_wage_hr*emp_day_hr_p_work*emp_month_day_hr_work;
							System.out.println("the wage of a employee is "+total_emp_wage);
						}
			break;
			default : 
						System.out.println("employee is absent no wages" +emp_a);
			break;
			}
			
		}
public static void main(String[] args) 
{
	Day_4_UC5 uc5=new Day_4_UC5();
	uc5.empWage();
			
			
}

}

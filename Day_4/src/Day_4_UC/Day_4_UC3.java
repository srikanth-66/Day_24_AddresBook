package Day_4_UC;

public class Day_4_UC3 
{
		public void empWage()
		{
			int emp_f=1;
			int emp_p=2;
			int emp_a=0;
			int emp_wage_hr=20;
			int emp_day_hr_work=8;
			int emp_day_hr_p_work=4;
			double total_emp_wage=0;
			double empCheack=Math.floor(Math.random()*10)%3;
			if(empCheack==emp_f) 
			{
				System.out.println("employee is present full time");
				total_emp_wage=emp_wage_hr*emp_day_hr_work;
				System.out.println("the wage of a employee is "+total_emp_wage);
			}
			else  
			{
				if(empCheack==emp_p) 
				{
					System.out.println("employee is present half day work");
					total_emp_wage=emp_wage_hr*emp_day_hr_p_work;
					System.out.println("the wage of a employee is "+total_emp_wage);
				}
				else 
					System.out.println("employee is absent no wages" +emp_a);
			}
		}
public static void main(String[] args) 
{
	Day_4_UC3 uc3=new Day_4_UC3();
	uc3.empWage();
			
			
}

}
	

package Day_4_UC;

public class Day_4_UC6 
{
	int emp_hr_wk=20;
	int emp_rs_ft_hr=8;
	int emp_rs_pt_hr=4;
	double empCheack=Math.floor(Math.random()*10)%3;
	int emp_p=2;
	int emp_f=1;
	public void empwage()
	{	
		int emp_tt_hr_mo=100;
		int emp_mo_wk=20;
		int emp_wage=0;
		if(empCheack==emp_f)
		{
			for(int day=1;day <=emp_mo_wk;day++)
			{
				emp_wage=emp_rs_ft_hr*emp_hr_wk*day;
				//System.out.println("the emp wage for full time is "+emp_wage);

			}
			System.out.println("the emp wage for full time is "+emp_wage);

		}
		else
		{
			if(empCheack==emp_p)
			{
				for(int day=1;day <=emp_mo_wk;day++)
				{
					emp_wage=emp_rs_pt_hr*emp_hr_wk*day;
				}
				System.out.println("the emp wage for part time is "+emp_wage);

			}
		}
		double emp_a=0;
		if( emp_a==empCheack)
		{
			System.out.println("Absent sorry no salary");
		}
	}
	public static void main(String[] args) 
	{
		Day_4_UC6 uc6=new Day_4_UC6();
		uc6.empwage();
	}
}


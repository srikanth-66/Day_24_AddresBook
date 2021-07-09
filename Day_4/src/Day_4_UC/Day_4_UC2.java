package Day_4_UC;

public class Day_4_UC2 {
	public void empWage() {
		int emp=1;
		int emp_wage_hr=20;
		int emp_day_hr_work=8;
		double total_emp_wage=0;
		double empCheack=Math.floor(Math.random()*10)%2;
		if(empCheack==emp) {
			System.out.println("employee is present");
			total_emp_wage=emp_wage_hr*emp_day_hr_work;
			System.out.println("the wage of a employee is "+total_emp_wage);
		}
		else {
			System.out.println("employee is absent");
		}
		
	}
	public static void main(String[] args) {
		Day_4_UC2 uc2=new Day_4_UC2();
		uc2.empWage();
		
		
	}

}

package Day_4_UC;

public class Day_4_UC1 {
	public void empcheack() {
		int e=1;
		double emp=Math.floor(Math.random() * 10) % 2;
		if(emp==e) {
			System.out.println("employee is present");
		}
		else {
			System.out.println("employee is absent");
		}
	}
public static void main(String[] args) {
	 Day_4_UC1 uc1=new Day_4_UC1();
	 uc1.empcheack();
		
		
	}
	
}

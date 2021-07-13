package line_orientaion;

public class line_geometry {
	public static void main(String[] args) {
		int x1=10,x2=20,x3=50,x4=60;
		int y1=30,y2=40,y3=70,y4=80;
		double length1 =Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("length1 ="+length1);
		double length2 =Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3));
		System.out.println("length2 ="+length2);
		double l1 =length1;
		double l2 =length2;
		int l3 =( l1.compareTo(l2));
		if(l3==0)
		{
			System.out.println("two lengths are equal");
			
		}
	}

}

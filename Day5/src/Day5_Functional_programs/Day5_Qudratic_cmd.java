package Day5_Functional_programs;

public class Day5_Qudratic_cmd 
{
	   public static void main(String args[])
	      {
	            float a,b,c,d;
	            double d1,r1,r2;

	            a=Float.valueOf(args[0]).floatValue();
	            b=Float.valueOf(args[1]).floatValue();
	            c=Float.valueOf(args[2]).floatValue();

	            d=b*b-4*a*c;
	 
	            if(d<0)
	            System.out.println("NO real roots");
	            else if(d==0)
	            {
	                  System.out.println("Equal roots");
	                  r1=-b/(2*a);
	                  System.out.println("Roots are: "+ r1 + ","+ r1);
	            }
	            else
	            {
	                  System.out.println("Real roots");
	                  d1=Math.sqrt(d);
	                  r1=-b+d1/(2*a);
	                  r2=-b-d1/(2*a);
	                  System.out.println("Roots are: "+ r1 + ","+ r2);

	            }
	      }
}


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter a,b,c values:");
		double a,b,c;
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		double d=b*b-4*a*c;
		if(d>0){
		    double r1=(-b+ Math.sqrt(d))/(2*a);
		    double r2=(-b- Math.sqrt(d))/(2*a);
		    System.out.println("The roots are"+r1+"and"+r2);
		}
		else if(d==0)
		{
		    double r1=-b/(2*a);
		    System.out.println("The root is :"+r1);
		}
		else{
		    System.out.println("Roots are not real");
		}
	}
}

	


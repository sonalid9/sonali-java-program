import java.util.Scanner;

public class Percentage 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
	
	System.out.println("enter the marks art");
	double s1=sc.nextInt();
	
	System.out.println("enter the marks mech");
	double s1total=sc.nextInt();
	
	System.out.println("enter the marks cse");
	double s2=sc.nextInt();
	
	System.out.println("enter the marks geo");
	double s2total=sc.nextInt();
	
	System.out.println("enter the marks his");
	double s3=sc.nextInt();
	
	System.out.println("enter the marks physics");
	double s3total=sc.nextInt();
	System.out.println("enter the marks maths");
	double s4=sc.nextInt();
	System.out.println("enter the marks marathi");
	double s4total =sc.nextInt();
	System.out.println("enter the marks hindi");
	double s5=sc.nextInt();
	System.out.println("enter the marks history");
	double s5total=sc.nextInt();
	

	

	

	

	
	sc.close();
	
	double percentage=((s1/s1total)*100+(s2/s2/s2total)*100+(s3/s3total)*100+(s4/s4total)*100+(s5/s5total)*100)/5;
	System.out.println("percentageis:"+percentage);
	if(percentage>=40)
	{
		System.out.println("stuent is pass");
	}
	else
		System.out.println("stuent fail");
	}
}
	

	

	

	

	

	




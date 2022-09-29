import java.util.Scanner;

public class Method {
    

	public void area() {
		     int radius;
		      double area;
		      Scanner sc = new Scanner(System.in);

		      System.out.println("Enter the radius of the circle ::");
		      radius = sc.nextInt();
		      area = (radius*radius)*Math.PI;
		      System.out.println("Area of the circle is ::"+area);
		      }
	   public void rect()
	{
	    Scanner sc = new Scanner(System.in);

		   System.out.println("Enter the length of Rectangle:");
		   double length = sc.nextDouble();
		   System.out.println("Enter the width of Rectangle:");
		   double width = sc.nextDouble();
		   
		   double area = length*width;
		   System.out.println("Area of Rectangle is:"+area);
	   }
	
	
	public static void main(String args[])
	{
		System.out.println("main has started");
		Method a=new Method();
		a.area();
		System.out.println("main is completed");
		Method b=new Method();
		b.rect();
}
}


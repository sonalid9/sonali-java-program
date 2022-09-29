
public class Shape {
	int length,breadth;
	float radius;



	  public  void area(int l,int b)
	    {
	        System.out.println("the area of the react: "+l*b);
	    }
	   public void area(float l, float b)
	    {
	        System.out.println("the area of the triangle: "+0.5*l*b);

	    }
	   public void area(double r)
	    {
	        
	        System.out.println("the area of the circle is :" +r*r);
	    }
	   public void area(int l)
	   {
	        System.out.println("the area of the circle is :" +l*l);

	   }
	


	     public static void main(String args[]) 
		{
		   Shape ob = new Shape();
		   ob.area(2,5);
		   ob.area(2.2f,1.2f);
		   ob.area(2.0);
		   ob.area(2);
	        }
	}

package Inheritance;

public class Car extends Vehical{
	
	private int price;
	String cartype;
	Car()
	{}
	Car(int p,String type)
	{
		super("swift",5000000,"four wheeler");
		this.price=p;
		this.cartype=type;
	}
public void showdetails(int p1,String c)
{
	System.out.println("the car name is:"+p1);
	System.out.println("the car type is:"+c);
}
}




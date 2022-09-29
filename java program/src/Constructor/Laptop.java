package Constructor;

public class Laptop {
	private static String os;
	private String brand;
	private String price;
	int negprice;

	public Laptop()
	{
		System.out.println("This is default constructor:");
		os="null";
	}
	Laptop(String os,String brand)
	{
		this();
		os="window";
		brand="HP";
	}
	Laptop(String brand)
	{
		this(os,brand);
		brand ="HP";
	}
	public void Showdetails()
	{
		System.out.println(os);
		System.out.println(brand);
		System.out.println(price);
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public String getPrice()
	{
		return price;
	}
	public void  setPrice(String price)
	{
		this.price=price;
	}

	
	public static void main(String[]args)
	{
		Laptop l=new Laptop();
		l.Showdetails();
		
		Laptop l1=new Laptop();
		l1 .Showdetails();
		
		Laptop l2=new Laptop("Dell");
		l2.Showdetails();{
		
	}
		

		
		

	}

}

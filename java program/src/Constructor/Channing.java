package Constructor;

public class Channing {
	
	private int id;
	private String name;
	private String Address;
	Channing(int id,String name,String Address)
	{
		id=id;
		name=name;
		Address=Address;
		
	}
	Channing()
	{
		this(1,"sonali","satara");
	}
	Channing(int id,String name)
	{
   
		id=id;
		name=name;
	}
	public void show()
	{
		System.out.println("name:"+id);
		System.out.println("namr:"+name);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Channing c=new Channing();
		c.show();
		
		

	}

}

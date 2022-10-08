package Constructor;

public class Costrctorchanning {
	private int no;
	private  static String name;
	
	Costrctorchanning()
	{}
	Costrctorchanning(int no,String name)
	{
		
		this.no=no;
		this.name=name;
		
	}
	
	Costrctorchanning(String name,int no)
	{
		this(1,"sonali");
	}
	public void show()
	{
		System.out.println("my name:"+this.name);
		System.out.println("my no:"+this.no);

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Costrctorchanning d= new Costrctorchanning(1,"hfh");
		d.show();
		
	}

}

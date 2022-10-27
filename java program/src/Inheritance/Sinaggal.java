package Inheritance;

public class Sinaggal extends Project {
	private int no;
	private String name;
	
	Sinaggal(){}
	Sinaggal(int no,String name)
	{
		super("tata","sonali", "sonali");
		this.no=no;
		this.name=name;
	}
	
	public void showdata()
	{
		super.showdata();
		System.out.println("sinal name is:"+ no);
		System.out.println("sinagl Member:"+name);
	}

	@Override
	public String toString() {
		return "no is"+no+"name"+name;
	}
}

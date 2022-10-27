package Inheritance;

public class Project {
	
	private String Companyyname;
	private String Companytype;
	private String MangerName;
	Project()
	{}
	Project(String c,String m,String n)
	{ 
		Companyyname=c;
		MangerName=m;
		
		Companytype=n;
		
		
	}
	public void showdata()
	{
		System.out.println("comapny name is:"+Companyyname);
		System.out.println("companytype:"+Companytype+"\n MangerName"+MangerName);
	}
	
}

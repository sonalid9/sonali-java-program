package Hospital;

public class Doctor {
	private int did;
	private String dName;
	Doctor(){}
	Doctor (int id,String n)
	{
		did=id;
		dName=n;
	}
	{
		
	}
	public  void setDid(int did)
	{
		this.did=did;
	}
	public void setDName(String x)
	{
		dName=x;
	}
	public String toString()
	{
		return dName +"has Doc Id"+did;
	}
	
	
	public int getDid()
	{
		return did;
	}
	public String getDName()
	{
		return dName;
		}
		
	}
	
	
	



package containment;

public class Manger {
	private int manId;
	private String manName;
	  private String companyname;
	  int size;
	  
	  	 public int getManId()
	 {
		 return manId;
	 }

	 public void setManId(int mn)
	 {
		 manId=mn; 
	 }
	 
	 
	 public String getManName()
	 {
		 return manName;
	 }

	 public void setManName(String dn)
	 {
		  manName=dn ; 
	 } 
	  public String getCompanyName ()
	  {
		  return companyname;
	  }
	  public void  setCompanyName(String c)
	  {
		  companyname=c;
	  }
		
	        

	
	public String toString() 
	{
		return "\nthe manger ID:"  +manId+  "\nThe man Name:"  + manName +  "\nThe company name  is: "  +companyname;
	}
	 

	 

}

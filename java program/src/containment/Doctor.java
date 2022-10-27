package containment;

public class Doctor
{
	 private int regNo;
	private String docName;
	  private String specality;
	 
	 public int getRegNo()
	 {
		 return regNo;
	 }

	 public void setRegNo(int rn)
	 {
		 regNo=rn; 
	 }
	 
	 
	 public String getDocName()
	 {
		 return docName;
	 }

	 public void setDocName(String dn)
	 {
		  docName=dn ; 
	 } 
	  public String getSpecality ()
	  {
		  return specality;
	  }
	  public void  setSpecality(String s)
	  {
		  specality=s;
	  }
	
	public String toString() 
	{
		return "\nthe reg Number"+regNo+"\nThe doc Name"+docName+"\nThe specility is"+specality;
	}
	 

	 
}
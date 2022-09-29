package Hospital;

public class Hospital1 {

	private int hReg;
	private String hName;
	Doctor doc;
	Hospital1()
	{}
	void Hospital(String n,int reg,Doctor d)
	{
		hName=n;
		hReg=reg;
	}
	public void setHName(String n)
	{
		hName=n;
	}
		public void setHreg(int r)
		{
			hReg=r;
		}
		public void setDoc(Doctor d)
		{
			doc=d;
		}

		public String toString()
		{
			return "\n Hospital name is: "+  hName  + "\n hospital regestration id:"+ hReg  +"\n Dr.name:   "  +  doc;
		
		}{
		}
		public void setHName(int r) {
			
			
		}
		}
		
	
		
	
	
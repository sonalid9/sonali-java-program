package containment;

public class MangerContainmentArray {
	int manid;
	int experience;
	String manName;
	public MangerContainmentArray(int manid, int experience, String manName) 
	{
		
		this.manid = manid;
		this.experience = experience;
		this.manName = manName;
	}
	public String toString()
	{
		return "manager name is:"+manName+"\n"+  "experience is:"  +experience+  "maneger id is:"+manid;
	}


}


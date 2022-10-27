package containment;

public class Project {
	private String projectName;
	private int  projectNo;
	private int  projectCost;
	Manger m1;


	public String  getProjectName()
	{
		 return projectName;
	}
	public void setProjectName (String p)
	{
		projectName=p;
	}

	public int   getProjectNo()
	{
		 return projectNo;
	}
	public void setProjectNo(int n)
	{
		projectNo =n;
	}
	public int   getProjectCost()
	{
		 return projectCost;
	}
	public void setProjectCost(int c)
	{
		projectCost =c;
	}
	public void setM1(Manger m)
	{
		m1=m; 
	}
	public String toString()
	{
		return  "The project name:-"+ projectName +"\nThe project no is:-"+projectNo+ "\nThe project cost:-"+projectCost+ "\n the project has:"+m1;
	}

}



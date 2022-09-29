package Inheritance;

public class SingalInheritance {
private	String examtype;
	private int phy,chem,math;
	SingalInheritance()
	{}
	
	SingalInheritance(String examtype ,int phy, int chem,int  math)
	{
		this.examtype=examtype;
		this.phy=phy;
		this.chem=chem;
		this.math=math;
	}
	

public void showcaseExamdetails()
{
	System.out.println("examtype:"  +examtype);
	System.out.println("physics:"  +phy);
	System.out.println("chemistry:"  +chem);
	System.out.println("maths:"  +math);



	
}
}
  
 

public class Marks {
	
	public void result(Semester sem1,Semester sem2)
	{
		float pTotal=(sem1.phy+sem2.phy);
		System.out.println("total marks  physics :"+  pTotal);
		
		float cTotal=(sem1.chem+sem2.chem);
		System.out.println("total marks of chemistry :" +cTotal);
		
		float mTotal=(sem1.maths+sem2.maths);
		System.out.println("total  marks of  maths:"  +mTotal);
		
		
		float percentage=(pTotal+cTotal+mTotal)/600*100;
		System.out.println("total percentage"  +  percentage);
	}
public static void main (String []args)
{
	Semester s1=new Semester();
	s1.accpetmarks(50, 60, 70);
	s1.showdetail();

	Semester s2=new Semester();
	s2.accpetmarks(45,45,50);
	s2.showdetail();

	

	Marks m=new Marks();
	m.result(s1,s2);

	
	 



	}

}

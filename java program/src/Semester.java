
public class Semester {
	int phy,chem,maths;
	


	public void accpetmarks(int p,int c,int m )
	{
	
		phy=p;
		chem=c;
		maths=m;
		
		
	}
	public void showdetail()
	{
	
		System.out.println("phy:" + phy);
		System.out.println("chem:" +chem);
		System.out.println("maths:" +maths);

		
}
}
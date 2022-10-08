
public class Stati {

	private int id;
	private  static  String CompanyName="mona";

	 
	public void run()
	{
		 id=id;
		 CompanyName=CompanyName;
	}
	public  void showdetails(int id)
	{
		System.out.println("School id:"+id);
		System.out.println("company nam:"+CompanyName);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stati s=new Stati();
		s.showdetails(1);
		s.showdetails(2);
		s.showdetails(3);
		s.showdetails(9);
	}

}

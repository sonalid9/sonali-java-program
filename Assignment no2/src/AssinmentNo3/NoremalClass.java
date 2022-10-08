package AssinmentNo3;

public class NoremalClass {
	private int no;
	private String name;
	private String adress;
	NoremalClass(int no,String name,String adress)
	{
		no=no;
		name=name;
		adress= adress;
	System.out.println("no:"+no);
	System.out.println("name:"+name);
	System.out.println("adress:"+adress);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoremalClass n=new NoremalClass(1, "sona", "satra");
		NoremalClass n1= new NoremalClass(1,"priya","pune");
				
	}

}
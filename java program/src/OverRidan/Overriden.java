package OverRidan;

public class Overriden {
	private int no;
	private String name;
	private String adress;
	public void run(int no,String name,String adress)
	{
		no=no;
		name=name;
		adress= adress;
	System.out.println("no:"+no);
	System.out.println("name:"+name);
	System.out.println("adress:"+adress);

	}}
	 class Sample extends Overriden
	 {
		 public void run(int no,String name,String adress)
			{
				no=no;
				name=name;
				adress= adress;
				System.out.println("no:"+no);
				System.out.println("name:"+name);
				System.out.println("adress:"+adress);
			}
	 }
	 class Demo extends Overriden
	 {
		 public void run(int no,String name,String adress)
			{
				no=no;
				name=name;
				adress= adress;
				System.out.println("no:"+no);
				System.out.println("name:"+name);
				System.out.println("adress:"+adress);
			
	 }
	 }
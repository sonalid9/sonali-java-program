package Abstraction;

public abstract class Book {

	String s;
	abstract void  run(String s);
	abstract void move(String a);
}


  class Test extends Book
{
	  String name;
	  

	
	  public void run(String f)
	  {
		  System.out.println("my book:"+f);
	  }
	 
		
   
	 public void move(String a)
	 {
		 System.out.println("my notebook:"+a);
	}
}
	class Exam extends Test
	 {
		public void sample(String s)
		{
			
			 System.out.println("my notebook:"+s);
		}
	 }



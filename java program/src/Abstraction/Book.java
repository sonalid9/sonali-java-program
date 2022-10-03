package Abstraction;

public abstract class Book {

	String s;
	abstract void  run(String s);
	abstract void move(String a);
}


   abstract class Test extends Book
{

	
	 abstract public void run();
	 {
		
	
	 }
	 public void move(String a)
	 {
		 System.out.println("my notebook:"+a);
	}
}
	class Exam extends Test
	 {
		@Override
		 public void run(String d)
		 {
			 System.out.println("my book:"+d);
		 }
		 public void move(String a)
		 {
			 System.out.println("my notebook:"+a);
		}
	 }
	}


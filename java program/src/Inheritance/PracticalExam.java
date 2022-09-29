package Inheritance;

public class PracticalExam extends SingalInheritance{

	 private int outofmarks;
		private  String type;
		
		
		 PracticalExam()
		
		 	 {}
		 PracticalExam(int m,String p)
		 {
			 super("aaa",45,21,32);
			this. outofmarks=m;
			 this.type=p;
		 }
		 
		 public void show()
		 {
				System.out.println("out of marks:"  +outofmarks);
				System.out.println("examtype:"  +type);


		 }
	 }
	 
		 

import java.util.Scanner;

public class PercentageinMethod {

	
		

		public int percent(int x, int y, int z)
		{
			int p = ((x+y+z)*100)/300;
			return p;
			
		}
			public static void main(String args[])
			{
				 Scanner sc =new Scanner(System.in);
				 PercentageinMethod o= new PercentageinMethod(); //class name
			     
			    System.out.println("Enter marks of  subjects");
			    
			   
			    System.out.print("Enter marks of physics subjects:");
			    int x= sc.nextInt();
			    
			    System.out.print("Enter marks of chemistry subjects:");
			    int y= sc.nextInt();
			    
			    System.out.print("Enter marks of maths subjects:");
			    int z= sc.nextInt();
			    
			    sc.close();
			    o.percent(x,y,z);
			   
			    System.out.println("Percentage = "+o.percent(x,y,z)+"%");

			   }
			

	}



import java.util.Scanner;

public class PresentGivenNo {

	public void run()
	{
		
	   int number ;
	   int digit;
	   int sum=0;
	   Scanner sc= new Scanner(System.in);
	   System.out.println("enter no");
	   number=sc.nextInt();
	   while(number > 0)
	   {
		   digit=number % 10;
		   sum=sum+digit;
		   number=number/10;
	   
	   System.out.println("sum od digit:"+sum);
	   }
	
	}
	public void run1()
	{
	Scanner sc=new Scanner (System.in); 
		        int number;
		       int  temp;
		        int total=0;
		        int reamiander;
            System.out.println("enter the no");
            // we declare 527
            temp=sc.nextInt();
            number=temp;
		        
		        while (temp != 0)
		        {
		        	
		        	reamiander = temp % 10;//7
		            total = total + reamiander*reamiander*reamiander;
		            temp /= 10;
		        }

		        if(total == number)
		        {
		            System.out.println( " is an Armstrong number"+number);
		        }
		         else
		        	 
		        	 
		        {
		            System.out.println( " is not an Armstrong number"+number);
		    }
}
	
		
		
public static void main(String args)
	{
		PresentGivenNo a=new PresentGivenNo();
		a.run();
		PresentGivenNo a1=new PresentGivenNo();
		a1.run();

	}
}
import java.util.Scanner;

public class SecondLargestNo {

	
	    public static void main(String args[])
	    {
	        Scanner y=new Scanner(System.in);
	        System.out.println("Enter the number of values to be entered");
	        int n=y.nextInt();
	        System.out.println("Enter number 1");
	        int num=y.nextInt();
	        int max=num,min=num,temp=num;
	        for(int i=2;i<=n;i++)
	        {
	            System.out.println("Enter number "+i);
	            num=y.nextInt();            
	            if(num>max)
	            max=num;
	            else if(num<min)
	            min=num;
	            
	        }
	        System.out.println("The largest number is "+max);
	        System.out.println("The smallest number is "+min);
	    }
	}
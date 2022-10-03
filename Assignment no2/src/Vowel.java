import java.util.Scanner;

public class Vowel {

	public static void main(String[]args) 
	{
		// TODO Auto-generated method stub


		
				
				Scanner sc=new Scanner(System.in);
				System.out.println("enter any charcter");
				char choice;
				choice=sc.nextLine().charAt(0);
				if(choice == 'a' || choice == 'e' || choice == 'i' || choice == 'o' || choice== 'u' )
		            System.out.println(choice + " is vowel");
		        else
		            System.out.println(choice + " is consonant");


			
	}



	}



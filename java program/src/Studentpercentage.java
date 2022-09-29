import java.util.Scanner;

public class Studentpercentage {

	public static void main(String[] args) {
		Scanner marks=new Scanner(System.in);
		System.out.println("enter Marks");
	
		int marks1=marks.nextInt();

		if(marks1>=90)
		{
			System.out.println("Excellent:gradeA");
			
		}
		else if(marks1>=100)
		{
			
		
			System.out.println("Good");
		
	}
	else if(marks1>=70)
	{

	
		
			System.out.println("Avargae");
		}
		else if(marks1>=70)
		{
			System.out.println("normal");
		}
			
		System.out.println("your grade is"+marks);
		}
}






public class PrimeWhile1 
{
	public void test21()
	{
		int givenNumber = 31;
		  int n = 2;
		  int divisibleCount = 0;;
		  while (n <= givenNumber / 2) {
		   if (givenNumber % n == 0) {
		    divisibleCount++;
		    break;
		   }
		   n++;
		  }
		  if (divisibleCount == 0 ) {
		   System.out.println(givenNumber + " is a prime number ");
		  } else {
		   System.out.println(givenNumber + " is not a prime number ");
		  }
		  
		 }

	public static void main(String[] args) {
		PrimeWhile1 a= new PrimeWhile1();
		a.test21();

	}

	
}

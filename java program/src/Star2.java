
public class Star2 {

public void pattern()
{
		int n = 5;
	
		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=i;j++){
				System.out.print(j+ " "); 
			}
			System.out.println();
		}
	}

public static void main(String[] args) {
	Star2 a= new Star2();
	a.pattern();
	
}

}

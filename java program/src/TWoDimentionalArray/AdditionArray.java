package TWoDimentionalArray;

public class AdditionArray {
	void Sum(int c[][])
	{
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
		int b[][]={{1,3,4},{2,4,3},{1,2,4}};
		for(int i=0;i< 3;i++)
		{    
		for(int j=0;j<3;j++)
		{    
		c[i][j]=a[i][j]+b[i][j];   

		System.out.print(c[i][j]+" ");    
		}    
		System.out.println();   
		}    
	}
	
		
		public static void main(String args[])
		{  
		  
		    
		int c[][]=new int[3][3];  
		AdditionArray s= new AdditionArray();
		s.Sum(c);
		}    
		
		
}
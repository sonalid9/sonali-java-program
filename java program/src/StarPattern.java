
public class StarPattern
{
	public void pattern()
	{
		int i, j, row=6;    
	for(i=0; i<row; i++)   
	{   
 
	for(j=0; j<=i; j++)   
	{   

	System.out.print("* ");   
	}  
	System.out.println();   
	}   
	
}
	public static void main (String args[])
	{
		StarPattern a=new StarPattern();
		a.pattern();
		
}}
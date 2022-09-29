
public class ArithmaticMethod {
	
	
	public int add(int a,int b)
	{ 
		int c=a+b;
	     return c;
	}
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
		
	} public int multi(int a,int b)
	{
	int c=a*b;
	return c;
	}
	public int div(int a,int b)
	{
		int c=a/b;
		return c;
	}
	
	
	public static void main(String[] args) {
		ArithmaticMethod a=new ArithmaticMethod();
	    a.add(30, 10);
		
		
		int s=a.add(30, 10);
     System.out.println("Addition is:"  +s);
     
     int s1=a.sub(30, 10);
     System.out.println("sub is:"  +s1);
     
     int s2=a.multi(30, 10);
     System.out.println("mul is:"  +s2);
     
     
     int s3=a.div(30, 10);
     System.out.println("div is:"  +s3);
     
     
     
     
     
	}

}

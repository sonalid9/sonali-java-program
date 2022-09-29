
public class WhileLoop {
	
public  void test()
{
	int Count=0;
		
			int i=12;
			while(i<=45)
			{
				if(i%2==0)
				{
					System.out.println(i);
				Count++;
			}
			i++;
			}
			System.out.println("Count is:"+Count);
		
			
			}
    public static void main(String[] args)   {
	
	WhileLoop a=new WhileLoop();
	a.test();
}

}



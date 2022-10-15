package arrayprograms;

public class ShiftingArray {
    //left
	public void dorotate(int a[])
	{
		int i=0;
	    int j=0;
		
			for(i=1;i<a.length;i++)
				
			if(i==0)
			{
			a[0]=a.length-1;
			{
			a[i]=a[a.length-1];
			{
			{
			
				while(j<a.length-2)
				{
					a[i]=a[j];
					j++;
				
				}
					System.out.println(a[i]);
				
			}}}}}
	
	
	public static void main(String[] args) {
		
		int a[]= { 1 ,2,3,4,5,6};
	
		ShiftingArray s=new ShiftingArray();
		  s.dorotate(a);
		  System.out.println(a);
		 

	}

}

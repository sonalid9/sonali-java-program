package arrayprograms;

public class EvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9,10};
	System.out.println("even no of array:");
	int length=a.length;

	int sum=0;
	for(int i=0;i<a.length;i++)
	{   
		sum+=a[i];
	
	
		if(a[i]%2==0)
		
			System.out.println(a[i]);
		}
		
		int average = sum / length;
        
        System.out.println("avarge of array:"   +average);
 
    }

}

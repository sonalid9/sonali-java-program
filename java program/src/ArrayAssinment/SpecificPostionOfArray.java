package ArrayAssinment;

public class SpecificPostionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = { 1,2,3,4,5,6,7,8,9 };
	    int i, x, pos, n = 10;
	 
	   
	    for (i = 0; i < 10; i++)
	        arr[i] = i + 1;
	 
	  
	    for (i = 0; i < n; i++)
	        System.out.println(arr[i]);
	       x = 50;
	 
	    
	       pos = 5;
	   
	 
	    n++;
	
	    for (i = n - 1; i >= pos; i--)
	        arr[i] = arr[i - 1];
	 
	    
	    arr[pos - 1] = x;
	 
	    
	    for (i = 0; i < n; i++)
	       System.out.println(arr[i]);
	  
	 
	  
	}
	}



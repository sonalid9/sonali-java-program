package ArrayAssinment;

public class Avrage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			 
	     
	        int[] array = { 10, 20, 30, 40, 50};
	 
	      
	        int length = array.length;
	 
	    
	        int sum = 0;
	 
	        
	        for (int i = 0; i < array.length; i++) {
	           sum += array[i];
	        
	        }
	        System.out.println("sum of array:"+sum);
	
	        int  average = sum / length;
	         
	        System.out.println("avrage of element:"+average);
	 
	    

	
	}  
}

package ArrayAssinment;

public class ConatinsValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		   

	     int toFind=6;
	     boolean found=false;
		for(int element:a)
		{ 
		
			if(element==toFind)
			{
			  found =true ;

		
			}
		}
           if(found)
   
	   System.out.println("is found:"  +toFind);
	   else
		   System.out.println("is not  found:"  +toFind);

   }
	}



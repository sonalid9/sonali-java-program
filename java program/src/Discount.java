import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		
		int k,k1,Bp,b1,d,d1,totalamount;
		float discount;
	
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter kurti price");
	     
	     k=sc.nextInt();
	     System.out.println("enter kurti quantity");
	     k1=sc.nextInt();
      System.out.println("enter bottale price");
	     
	     Bp=sc.nextInt();
	     System.out.println("enter bottle quantity");
	     b1=sc.nextInt();
       System.out.println("enter dress price");                                                                                                                              
	     
	     d=sc.nextInt();
	     System.out.println("enter dress quantity");
	     d1=sc.nextInt();
	     totalamount=(k*k1+Bp*b1+d*d1);   
	  
     
	     if(totalamount>=0&&totalamount<=1999)
	     {
	    	 System.out.println(" sry You don't get any discount:your payable amount" +totalamount);
	     }
	     else if(totalamount>=2000&&totalamount<=4999)
	    	 
	     {
	    	 discount=totalamount/100*2;
	    	 System.out.println(" you got discount : " +discount +"\nyour payable amount is :"+(totalamount-discount));
	     }
	      
          else if(totalamount>=5000&&totalamount<=6999)
	    	 
	     {
	    	 discount=totalamount/100*5;
	    	 System.out.println(" you got discount :" +discount +"\nyour payable amount is :"+(totalamount-discount));
	     }
          else 
        	 
 	    	 
 	     {
 	    	 discount=totalamount/100*10;
 	    	 System.out.println(" you got discount :" +discount +"\nyour payable amount is : "+(totalamount-discount));
 	     }
 	      
	      
	}
}
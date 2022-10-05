package Interface;

 interface Purchase {
	 void dopurchase(int qantity,float price);
 }
 
 
 class Cloths implements Purchase
 {
	 public void dopurchase(int quantity,float price)
	 {
		 System.out.println("purchase cloths with quantity:"+quantity);
		 System.out.println("purchase cloths of price:"+price);
	 }
	 }
	 
	 class Raw_Material implements Purchase
	 {
		  public void dopurchase(int qantity,float price)
		  {
			  System.out.println("Raw_Material cloths with quantity:" +qantity);
				 System.out.println("Raw_Material cloths of price:"+price);

		  }}



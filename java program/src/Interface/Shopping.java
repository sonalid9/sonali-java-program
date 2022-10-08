package Interface;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Purchase c=new Cloths() ;
		c.dopurchase(200, 50000.0f); 
		 c =  new Raw_Material();
		c.dopurchase(300, 30000.0f);
		Raw_Material r=new Raw_Material();
		r.show("kurti", "pant");
		

	}

}

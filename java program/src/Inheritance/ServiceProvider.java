package Inheritance;

public class ServiceProvider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Whatsapp w= new Whatsapp("priya",78675867568l);
		   w.ShowInfo();
		   w.showDetails1("abc", "pqr");
		   
		   TextService   t= new TextService("puja",8986987960l);
		   t.ShowText("irewireur",989580590l);
		   
		   
		   AudioMsg  a=new AudioMsg("sonali",787858989l);
		   a.ShowInfo2("sss",9090909009l);
				
	}

}

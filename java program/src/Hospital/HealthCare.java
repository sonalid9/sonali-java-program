package Hospital;

public class HealthCare {

	public static void main(String[] args) {
	
		Doctor d=new Doctor();
		Hospital1 h=new Hospital1();

		d.setDName("sonal");
		d.setDid(111);
		h.setDoc(d);

		
		h.setHName("mamta");
		h.setHreg(123);
	
		System.out.println(h);
	
		
	}

	
}

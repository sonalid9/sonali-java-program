package containment;

public class HospitalInfo {
	public static void main(String[] args) 
	{
	Doctor d2= new Doctor();
		d2.setRegNo(22);
		d2.setDocName("Dr.Madhav Kale");
		d2.setSpecality("Bone Specialist");
		Hospital h1 =new Hospital();
		h1.setHospitalName("M M Hospital");
		h1.setFloor(2);
		h1.setKebinNum(22);
		h1.setD1(d2);
		System.out.println(h1);
				

		
		
	}

}


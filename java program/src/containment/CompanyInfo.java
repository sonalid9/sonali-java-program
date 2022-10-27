package containment;

public class CompanyInfo {
	public static void main(String[] args) 
	{
	Manger m2= new Manger();
		m2.setManId(22);
		m2.setManName("pranav pathak");
		m2.setCompanyName("TATA");
		Project p1 =new Project();
		p1.setProjectName("Hotel mangement");
		p1.setProjectNo(2);
		p1.setProjectCost(2000);
		p1.setM1(m2);
		System.out.println(p1);
				


}
}
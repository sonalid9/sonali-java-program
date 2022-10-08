package encapsulation;

public class School {
private int rollNo;
private String SchoolName;
public int getRollNo()
{
	return rollNo;
}
public void setRollNo(int r)
{
	rollNo=r;
}
public  String getSchoolName()
{
	return SchoolName;
	
}
public void setSchoolName(String s)
{
	SchoolName=s;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School e=new School();
		e.setRollNo(12);
		e.setSchoolName("abc");
		System.out.println("name:"+e.getRollNo());
		System.out.println("name:"+e.getSchoolName());
		

	}

}

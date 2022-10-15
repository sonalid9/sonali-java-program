package arrayprograms;

public class ObjectsOfArray {
	 int empId;float sal;
	 String eName;
	 public ObjectsOfArray()
	 {}
	 public ObjectsOfArray(int id,String n,float s)
	 {
		 empId=id;
		 sal=s;
		 eName=n;
	 }
	 
   public void showEMPRecord()
   {
	   System.out.println("Emp id:"   +empId);
	   System.out.println("Emp Salary:"  +sal);
   }
}

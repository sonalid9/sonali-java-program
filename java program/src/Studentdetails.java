import java.util.Scanner;

public class Studentdetails {
	
	
	
int phy,chem,maths,marks,rollNumber,percentage;
String name;
public void displayrecord()
{
	
	System.out.println("student details");
	System.out.println("Roll no" +rollNumber  +"with Name" +name + "marks:");
	System.out.println("physics:"+phy);
	System.out.println("chemistry"+chem);
	System.out.println("Maths:"+maths);
}




public void displaystudentdetails(int roll,int p,int c,int m,int i, String n)
{
	System.out.println("Student details");
	rollNumber=roll;
	phy=p;
	chem=c;
	maths=m;
}
public void percentage()
{
	
int total=phy+chem+maths;
int percentage=(total*100/300);
	
	
}
	
	


public static void main(String args[])
{ 
	Studentdetails s1= new Studentdetails();
	s1.displayrecord();
	Studentdetails s2=new Studentdetails();
	s2.displaystudentdetails(02,20,30,40,45,"sonali");
}
}
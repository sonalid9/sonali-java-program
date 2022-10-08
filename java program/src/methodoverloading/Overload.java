package methodoverloading;

public class Overload{
   int id;
   String name;

public void run(int id,String name)
{
	id=id;
	name=name;
	System.out.println("id:"+id);
	System.out.println("name:"+name);
}
public void run(String name,String name1)
{
	System.out.println("name:"+name);
	System.out.println("name1:"+name1);
}
public void run(int a,int b)
{
	System.out.println("my number is:"+a);
	System.out.println("my name:"+b);
}

public static void main( String args[])
{
	Overload s=new Overload();
	s.run(11, "sonali");
	s.run("sona","nikhil");
	s.run(10,3 );
}}
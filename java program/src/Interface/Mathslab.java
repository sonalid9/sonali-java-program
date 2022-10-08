package Interface;

public class Mathslab  implements SciCalcultor{

	
	public void add(int a, int b) {
		int add=a+b;
		System.out.println("Addition of two number:"+add);
		
	}
	public float div(int d, int c) {
		int div=d/c;
		System.out.println("division of two number:"+div);
		
		return div;
	}

	
	public void multi(int e, float w) {
		float multi=e*w;
		System.out.println("multiplication:"+multi);
	}


	public void showRoot(double d) {
		double cos=Math.cos(d);
		System.out.println("showRoot:"+cos);

	}
	
	public void showsin(double angle) {
		double sin=Math.sin(angle);
		System.out.println("sin :"+sin);
		
	}

	public static void main(String args[])
	{
		SciCalcultor c= new Mathslab();
		c.add(2, 8);
		c.div(12,4);
		c.multi(30, 6f);
		c.showsin(2);
		c.showRoot(4);
		
	}
}


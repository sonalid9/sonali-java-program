package Interface;

public interface Calculator 
{
   void  add(int a,int b);
   float div(int d,int c);
   void multi(int e,float w);
}
interface SciCalcultor extends  Calculator
{
	void showRoot(double d);
	void showsin(double angle);
}



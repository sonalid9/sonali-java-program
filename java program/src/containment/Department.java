package containment;

import java.util.Arrays;
import java.util.Scanner;

public class Department {

	
		int depId;
		 String depName;
		 MangerContainmentArray[] m1;
		

		
		
		public int getDepId()
		{
			return depId;
		}
		public void setDepId(int depId)
		{
			this.depId=depId;
		}
		public String getDepName()
		{
			return depName;
			
		}
		public void setDepName(String depName)
		{
			this.depName=depName;
		}
		public MangerContainmentArray[] getM1()
		{
			return m1;
		}
		public void setM1(MangerContainmentArray[]m)
		{
			m1=m;
		}
		public String toString()
		{
			return"department id is"+ depId+" department name is:"+depName+m1;
		}
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size:");
			int size=sc.nextInt();
			MangerContainmentArray man[]=new MangerContainmentArray[5];
			man[0]=new MangerContainmentArray(12,21,"j");
			man[1]=new MangerContainmentArray (12,21,"k");
			man[2]=new MangerContainmentArray(12,21,"l");
			man[3]=new MangerContainmentArray(12,21,"m");
			man[4]=new MangerContainmentArray(12,21,"j");
			
			MangerContainmentArray m=new MangerContainmentArray(12,21,"Mr x");
			Department d=new Department();
			d.setDepId(45);
			d.setDepName("Astro");

			
			System.out.println(d.getDepId());
			System.out.println(d.getDepName());
			System.out.println(d.getM1());
			
						System.out.println(Arrays.toString(man));
			
}
}
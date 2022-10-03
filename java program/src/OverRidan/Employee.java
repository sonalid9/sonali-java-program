package OverRidan;

public class Employee {
	 public int salary;
	
	public void calculatesalary(int salary)
	{
	System.out.println(" you calculate empolyee salary:" +salary );
	}
}

class VP extends Employee{
	private float bonus;
		
	public void calculatesalary(int salary)
	{	
		bonus=(salary*10)/100;
		System.out.println("calculate salary is VP :"  +(salary+bonus));
	}
}

class CEO extends Employee
	{
		private int incentive;
		public void calculatesalary(int salary)
			{
				incentive=3000;
				salary=salary+incentive;
				System.out.println("calculate salary of CEO:"  +salary);
			}
	}
class Manger extends Employee{
		private float Allowance;		
		public void calculatesalary(int salary)
		{
			Allowance=(salary*10)/100;

System.out.println("calaculte  salary of  Manger:"   +(salary+Allowance));
		}
		


		
			}
		
	
	
	
	



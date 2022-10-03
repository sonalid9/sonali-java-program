package OverRidan;

public class Payroll {

	public static void main(String[] args) {

		Employee e = new VP();
		e.calculatesalary(10000);
		
		e=new CEO();
		e.calculatesalary(20000);
		
		e= new Manger();
		e.calculatesalary(30000);
	}

	 
		
		
		
		

	}



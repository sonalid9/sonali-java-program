package Abstraction;

abstract class Food {
	
		 String name;
		abstract public void prepareFood(String a);
		abstract public void shareReceipe(String b);
	}
	class HealthyFood extends Food
	{
		HealthyFood()
		{}
	
		HealthyFood(String s)
		{



			System.out.println(" i like food:"+s);
		}
		
		public void prepareFood(String u) 
		{
			System.out.println("Preaparing Healthy food :"+u);
		}
		public void shareReceipe(String h) 
		{
			System.out.println("Receipe for Healthy food :"+h);
		}
	}
	



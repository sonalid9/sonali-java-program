package Abstraction;

abstract class Food {
	
	String name;
		 
		abstract public void prepareFood();
		abstract public void shareReceipe();
	}
	class HealthyFood extends Food
	{
		HealthyFood()
		{}
		HealthyFood(String s)
		{
			
			
			System.out.println(" i like food:"+s);
		}
		
		public void prepareFood() 
		{
			System.out.println("Preaparing Healthy food :");
		}
		public void shareReceipe() 
		{
			System.out.println("Receipe for Healthy food :");
		}
	}
	



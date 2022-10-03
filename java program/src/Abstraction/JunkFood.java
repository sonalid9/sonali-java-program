package Abstraction;


	class JunkFood extends Food
	{
		JunkFood()
		{}


		JunkFood(String a)
		{
			
			System.out.println(" my food:"+a);
		}
		
		public void prepareFood() 
		{
			System.out.println("Preaparing Junk food :");
		}
		public void shareReceipe()
		{
		

			System.out.println("Receipe for Junk food :");
		}
	}

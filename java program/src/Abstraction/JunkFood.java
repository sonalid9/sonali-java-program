package Abstraction;


	class JunkFood extends Food
	{
		String name;
		JunkFood()
		{}


		JunkFood(String a)
		{
			
			System.out.println(" my food:"+a);
		}
		
		public void prepareFood(String f) 
		{
			System.out.println("Preaparing Junk food :"+f);
		}
		public void shareReceipe(String g)
		{
		

			System.out.println("Receipe for Junk food :"+g);
		}
	}

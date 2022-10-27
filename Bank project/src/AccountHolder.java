import java.util.Scanner;

public class AccountHolder {
	
	
		private int accountId;
	    float accountBalance;
	    String name;
		private long password;
		Scanner sc= new Scanner(System.in);
		 AccountHolder(){};
		 AccountHolder(int ac,float bal,String n,long pass)
		{
			accountId = ac;
			accountBalance = bal;
			name = n;
			password = pass;
			
		}
		
		public boolean login(int acId , long pass)
		{
			boolean login = false;
			if(accountId==acId && password == pass)
			{
				login = true;
			}
			return login;
		}
		
		//Admin Section
		public void setAccId(int i)
		{
			accountId = i;
		}
		public int getAccId()
		{
			return accountId;
		}
		public void setAccName(String n)
		{
			name = n;
		}
		public void setAccbal(float b)
		{
			accountBalance = b;
		}
		public void setAccPass(long b)
		{
			accountBalance = b;
		}
		public long getPasswor()
		{
			return password;
		}
		
		//User section
			
		public void deposit(float amount)
		{
			accountBalance = accountBalance+amount;
			System.out.println("your account balance is "+accountBalance);
		}
		
		public void withdraw(float amount)
		{
			accountBalance = accountBalance-amount;
			System.out.println("your account balance is "+accountBalance);
		}
		
		public void  getAccountBalance()
		{
			System.out.println("Your Account balance is " + accountBalance );
			
		}
		
		public int isAccountHolder(int id , long pass, AccountHolder a[])
		{
			int i=-99;
			for(int j=0 ; j<a.length;j++)
			{
				if(a[j].getAccId()==id && a[j].getPasswor()==pass)
				{
					i = j;
					break;
				}
				
			}
			
			return i;
		}
		
		public void userService()
		{
			System.out.println("Welcomr mr "+ name);
			System.out.println("Enter your choice \n1.Deposit Money \n2.Withdraw Money \n3.Check Balance");
			int c = sc.nextInt();
			switch (c)
			{
			case 1:
			{
			   System.out.println("Enter ammout you want to deposit");
			   float am = sc.nextFloat();
			   deposit(am);
			   break;
			}
			case 2:
			{
				System.out.println("Enter ammout you want to Withdraw");
				 float am = sc.nextFloat();
				 withdraw(am);
				 break;
			}
			case 3 :
			{
				getAccountBalance();
			}
			}
			
		}
		
		
	}



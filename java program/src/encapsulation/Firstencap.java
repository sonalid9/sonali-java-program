package encapsulation;

public class Firstencap {
	
	
private int  AccountNo;
private String AccountHolderNAme;



	public int getAccountNo() {
	return AccountNo;
}



public void setAccountNo(int accountNo) {
	AccountNo = accountNo;
}


public String getAccountHolderNAme() {
	return AccountHolderNAme;
}



public void setAccountHolderNAme(String accountHolderNAme) {
	AccountHolderNAme = accountHolderNAme;
}



	public static void main(String[] args) {
		
		Firstencap s=new Firstencap();
		s.setAccountHolderNAme("priya");
		s.setAccountNo(1234);
		System.out.println("my name:"+s.getAccountHolderNAme());
		System.out.println("my accno:"+s.getAccountNo());


	}

}

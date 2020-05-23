package basics;

public class BankAccount implements opp {

	String accountnum;
	String ssn;
	String name;
	private String AccType;

	BankAccount() {
		System.out.println("New account created");
	}
	
	BankAccount(String ssn){
		System.out.println("My ssn is: "+ ssn);
		
	}
	
	void deposit() {

	}
	
	public String getAccType() {
		return AccType;
	}
	
	public void setAccType(String accountT) {
		this.AccType = accountT;
	}
	
	public void setrate() {
		System.out.println("Setting rate");
	}
	
	public void increaserate() {
		System.out.println("Increase Rate");
		
	}
	
}

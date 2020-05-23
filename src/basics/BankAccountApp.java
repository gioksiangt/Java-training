package basics;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount bankacc = new BankAccount();

		BankAccount bankacc2 = new BankAccount("12356");
		
		System.out.println("TEST:" + bankacc.toString());
		
		CDAccount CDAcc = new CDAccount();
		CDAcc.name = "Extends Name";
		CDAcc.InterestRate = "1.3";
		System.out.println("Interest: "+ CDAcc.InterestRate);
		CDAcc.compound();
		
		bankacc.setAccType("Current");
		
		System.out.println("Account Type:" + bankacc.getAccType());
		bankacc.setrate();
		bankacc.increaserate();
		
	}

}

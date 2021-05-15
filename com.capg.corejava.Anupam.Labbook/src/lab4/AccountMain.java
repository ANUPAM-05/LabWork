package lab4;

public class AccountMain {

	public static void main(String[] args) {
		Account acSm = new SavingsAccount();
		Account acKa = new SavingsAccount();
		Account acSm1 = new CurrentAccount();
		Account acKa1 = new CurrentAccount();
		Person p1 = new Person();
		Person p2 = new Person();
		p1.setName("Smith");
		p2.setName("Kathy");
		acSm.setBalance(2000);
		acSm.deposit(2000);
		acKa.setBalance(3000);
		acKa.withdraw(2000);
		System.out.println("Balance in Smith's account: " +acSm.getBalance());
		System.out.println("Balance in Kathy's account: " +acKa.getBalance());
		acSm1.setBalance(3000);
		acSm1.deposit(2000);
		acKa1.setBalance(3000);
		acKa1.withdraw(2000);
		System.out.println("Balance in Smith's account: " +acSm1.getBalance());
		System.out.println("Balance in Kathy's account: " +acKa1.getBalance());
	}	
}

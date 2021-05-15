package lab4;

public class CurrentAccount extends Account{
	final double overdraftLimit = 1000;
	public void withdraw(double withAmount) {
		double updBalance = Math.abs(balance - withAmount);
		
		if(updBalance <= overdraftLimit) {
			System.out.println("True");
			setBalance(updBalance);
		}
		else {
			System.out.println("False: It exceeds the overdraft limit");
		}
	}
}

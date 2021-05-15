package lab4;

public class Account {
	 long accNum;
	 double balance;
	 Person accHolder;

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(double depAmount) {
		double updBalance=balance + depAmount;
		setBalance(updBalance);
	}
	public void withdraw(double withAmount) {
		double updBalance = balance - withAmount;
		setBalance(updBalance);
	}
	public double getBalance(double balance) {
		return balance;
	}

}

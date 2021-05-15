package lab4;

public class SavingsAccount extends Account {
	
		final double minBalance = 500;
	
		
		public void withdraw(double withAmount) {
		
		   double  updBalance = balance - withAmount;
			if( updBalance >= minBalance) {
				setBalance(updBalance);
			}
			else {
				System.out.println("You do not have enough Balance");
			}
		
	}

}

package lab1;

import java.util.Scanner;

public class Ex7CheckNum {
	public void checkNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		sc.close();
		int i,rem1,rem2;
		boolean flag=true;
		int length = String.valueOf(n).length();
		for(i=1;i<length;i++) {
			rem1=n%10;
			n=n/10;
			rem2=n%10;
			if(rem1<rem2) {
				flag=false;
			}
			
		}
		if(flag) {
			System.out.println("it is an ascending integer");
		}
		else {
			System.out.println("it is not an ascending integer");
		}
	}

	public static void main(String[] args) {
		Ex7CheckNum c = new Ex7CheckNum();
		c.checkNumber();

	}
}

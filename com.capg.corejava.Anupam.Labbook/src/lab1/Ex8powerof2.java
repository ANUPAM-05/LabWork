package lab1;

import java.util.Scanner;

public class Ex8powerof2 {
	public void checknumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		sc.close();
		int rem=0;
		boolean flag = true;
		while(n>1) {
			rem = n%2;
			if(rem!=0) {
				flag = false;
			}
			n=n/2;
		}
		if(flag) {
			System.out.println("The number is a power of two");
		}
		else {
			System.out.println("The number is not a power of two");
		}
	}

	public static void main(String[] args) {
		Ex8powerof2 c = new Ex8powerof2();
		c.checknumber();
	}
}

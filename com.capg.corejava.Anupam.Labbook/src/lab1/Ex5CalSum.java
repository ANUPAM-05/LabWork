package lab1;

import java.util.Scanner;

public class Ex5CalSum {
	public void calculateSum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		sc.close();
		int i, sum=0;
		for(i=1;i<=n;i++) {
			if(i%3 == 0 || i%5 == 0) {
			sum=sum+i;
			}
		}
		System.out.println("sum = "+sum);
	}

	public static void main(String[] args) {
		Ex5CalSum cal1 = new Ex5CalSum();
		cal1.calculateSum();
	}
}

package lab1;

import java.util.Scanner;

public class Ex6CalDiff {
	public void calculateDifference() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		sc.close();
		int i, sum1=0,sum3=0,sum2;
		for(i=1;i<=n;i++) {
			sum1=sum1+(i*i);
		}
		for(i=1;i<=n;i++) {
			sum3=sum3+i;
		}
		sum2=sum3*sum3;
		int sum = sum1-sum2;
		System.out.println("difference: "+sum);
	}

	public static void main(String[] args) {
		Ex6CalDiff cal2 = new Ex6CalDiff();
		cal2.calculateDifference();
	}
}

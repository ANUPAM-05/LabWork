package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1secondsmallest {
	public void getSecondSmallest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int i;
		int a[] = new int[n];
		System.out.println("Enter the elements of the array");
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("second smallest: "+a[1]);
		
		}

		public static void main(String[] args) {
			Ex1secondsmallest c = new Ex1secondsmallest();
			c.getSecondSmallest();
		}

}

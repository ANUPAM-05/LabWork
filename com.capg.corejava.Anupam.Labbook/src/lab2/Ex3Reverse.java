package lab2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex3Reverse {
	public void getSorted() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int i;
		String a[] = new String[n];
		System.out.println("Enter the elements of the array");
		for(i=0;i<n;i++) {
			a[i] = sc.next();
		}
		Collections.reverse(Arrays.asList(a));
		System.out.println("reversed array" +Arrays.asList(a));
	}

	public static void main(String[] args) {
		Ex3Reverse c = new Ex3Reverse();
		c.getSorted();
	}

}

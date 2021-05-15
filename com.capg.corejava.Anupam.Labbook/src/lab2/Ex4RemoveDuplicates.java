package lab2;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ex4RemoveDuplicates {
	public void modifyArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int i;
		int a[] = new int[n];
		System.out.println("Enter the elements of the array");
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		LinkedHashSet<Integer> sort = new LinkedHashSet<Integer>();
		for(i=0;i<a.length;i++) {
			sort.add(a[i]);
		}
		System.out.println(sort);
	}
	

	public static void main(String[] args) {
		Ex4RemoveDuplicates c = new Ex4RemoveDuplicates();
		c.modifyArray();
	}

}

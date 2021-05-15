package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2SortStrings {
	
	public void sortStrings(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		
		int i;
		String[] str = new String[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++) {
			str[i] = sc.next();
		}
		
		Arrays.sort(str,String.CASE_INSENSITIVE_ORDER);
		String[] str1 = new String[(n+1)/2];
		String[] str2 = new String[n-str1.length];
		System.arraycopy(str, 0, str1, 0, (n+1)/2);
		System.arraycopy(str, str1.length, str2, 0, str2.length);
		int a = str1.length;
		int b = str2.length;
		for(i=0;i< a;i++) {
			str1[i] = str1[i].toUpperCase();
		}
		for(i=0;i< b;i++) {
			str2[i] = str2[i].toLowerCase();
		}
		for(i=0;i< a;i++) {
			System.out.println(str1[i]);
		}
		for(i=0;i< b;i++) {
			System.out.println(str2[i]);
		}
		
	}

	public static void main(String[] args) {
		Ex2SortStrings c = new Ex2SortStrings();
		c.sortStrings();
	}

}

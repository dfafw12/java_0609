package Day05;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 :");
		int a = sc.nextInt();
		// 방법1.
		for(int i = a ; i>=0; --i) {
			for(int j = 0; j<=i; ++j ) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		// 방법2.
		for (int i = 1; i <= a; ++i) {
			
			for(int j =1; j<=a-i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

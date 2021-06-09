package day04;

import java.util.Scanner;

public class homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;

		System.out.println("정수1 : ");
		a = sc.nextInt();
		System.out.println("정수2 : ");
		b = sc.nextInt();
		System.out.println("정수 3 : ");
		c = sc.nextInt();

		if (a < b) {
			if (a < c)
				System.out.println(a);
			else
				System.out.println(c);
		}
		if (b < a) {
			if (b < c)
				System.out.println(b);
			else
				System.out.println(c);
		}

	}
}

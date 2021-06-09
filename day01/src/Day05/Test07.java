package Day05;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Á¤¼ö : ");
		int a = sc.nextInt();
		
		for(int i =1; i<=a; i++) {
			for (int b=1; b <=a-i; b++) {
				System.out.print("");
			}
			for(int s=1; s<=i*2-1; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}

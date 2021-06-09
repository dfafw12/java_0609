package Day05;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Á¤¼ö : ");
		int a = sc.nextInt();
		
		for(int i =a; i >= 0; i--) {
			
			
			
			for(int j =1; j<=a-i; j++) {
				
				System.out.print(" ");
				
			}
			for(int s =0; s<=i; s++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
}

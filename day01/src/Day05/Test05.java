package Day05;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Á¤¼ö : ");
		int a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			
			System.out.println();
			
			for(int j = 1; j <= a - i; j++) {
				
				System.out.print(" ");
			}
				for(int s = 1; s <= i; s++) {
					
					System.out.print("*");
					
				}
				
			}
			
		}
	}


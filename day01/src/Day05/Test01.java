package Day05;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("하나의 정수 : ");
		int a = sc.nextInt();
		int i = 1;
		while (true) {
			
			int j = i/10;
			
			//10의 자리의 369
			if (j % 10 == 3 || j%10 ==6 || j%10 == 9) {
				System.out.println("박수");
			}
			
			if ( i% 10 == 3 || i%10 ==6 || i%10 == 9) {
				System.out.println("박수");
			}

			
			else System.out.println(i);
			
				
			
				i++;
				if((a+1)==i)break;

		}
	}
}

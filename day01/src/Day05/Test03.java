package Day05;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		//예제 8 : 입력한 정수만큼 별 출력, 5개마다 줄바꿈
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int a = sc.nextInt();
		for(int i = 1; i<=a; ++i) {
			System.out.print("*");
			if (i%5==0) {
				System.out.println();
			}
		}
		
		for (int i = 0; i <= a; ++i) {
			
			for(int j =0; j <=i; ++j) {
				System.out.print("*");
				}
			System.out.println();
			}
		}
	}


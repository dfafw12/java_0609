package Day05;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		//���� 8 : �Է��� ������ŭ �� ���, 5������ �ٹٲ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
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


package Day05;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�ϳ��� ���� : ");
		int a = sc.nextInt();
		int i = 1;
		while (true) {
			
			int j = i/10;
			
			//10�� �ڸ��� 369
			if (j % 10 == 3 || j%10 ==6 || j%10 == 9) {
				System.out.println("�ڼ�");
			}
			
			if ( i% 10 == 3 || i%10 ==6 || i%10 == 9) {
				System.out.println("�ڼ�");
			}

			
			else System.out.println(i);
			
				
			
				i++;
				if((a+1)==i)break;

		}
	}
}

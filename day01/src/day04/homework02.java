package day04;

import java.util.Scanner;

public class homework02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;

		System.out.println("���� 1 : ");
		a = sc.nextInt();
		System.out.println("���� 2 : ");
		b = sc.nextInt();
		System.out.println("���� 3 : ");
		c = sc.nextInt();

		if (a > b) { // ù��°, �ι�° �� �� => ��ȯ
			int tmp = a;
			a = b;
			b = tmp;
		}
		if (b > c) {// �ι�°, ����° �� �� => ��ȯ
			int tmp = b;
			b = c;
			c = tmp;
		}
		if (a > b) {// ù����, �ι�° �� �� => ��ȯ
			int tmp = a;
			a = b;
			b = tmp;
		}
		System.out.println("�������� ���� : " + a + "\t" + b + "\t" + c + " ���Դϴ�");
	}
}

package Day05;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		// for��
		// if ��, for�� () => ; [X]

		for (int i = 0; i < 10; ++i) {
			// i�� 0���� 10�̸� ���� 1�� �����ϸ鼭 �ݺ�
			System.out.println(i);
			
			 // 1. �ʱⰪ �˻� 
			 // 2. ���ǹ� �˻� 
			 // 3. �ڵ� ���� 
			 // 4. ������ => ���ǹ� �˻�[True] => �ڵ���� (�ݺ�) 
			 // 5. ������ => ���ǹ� �˻� [False] => �ݺ��� Ż��
			 
		}
		System.out.println();
		System.out.println();
		// ���� : 1~50���� ���
		for (int i = 1; i <= 50; ++i) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println();
		// ����2 : 1~50 ���� 3�� ����
		for (int i = 1; i <= 50; i += 3) {
			System.out.println(i);
		}
		// ���� 3 : 1~50 ���� �����հ�
		int a = 0;
		for (int i = 1; i <= 50; i++) {
			a += i;
		}
		System.out.println("1~50������ �հ� : " + a);
		// ����4 : 1~50 ������ 3����� �����հ�
		int b = 0;
		for (int i = 0; i <= 50; i += 3) {
			b += i;
		}
		System.out.println("1~50������ 3��� �հ� : " + b);
		int c = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0)
				c += i;
		}
		System.out.println("�����հ� : " + c);

		// ����5: 2�� ������
		for (int i = 1; i < 10; ++i) {
			System.out.println("2X" + i + "=" + (2 * i));
		}
		System.out.println();
		System.out.println();

		// ����6 : ������ [for�� ��ø]
		// for �ȿ� for => ù���� for 1�� �ݺ� => �ι�° for ��� �ݺ�

		for (int i = 2; i < 10; ++i) {
			for (int j = 1; j < 10; ++j) {
				System.out.println(i + "X" + j + "=" + (i * j));
			}
		}
		
		//���� 7 : �Է��� ������ŭ ��[*] ���
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int d = sc.nextInt();
		for(int i  = 1; i<=d; ++i) {
			System.out.print("*");
		}
		

	}
}

package Day02;

import java.util.Scanner;

public class Day02_0 {
	public static void main(String[] args) {

		// ����1 : 2���� �̸��� 1���� ~ 3���� ������ ������ �Է¹޾� ���
//		System.out.println("===========�⼮��============");
//		System.out.println("���� \t1���� \t2���� \t3����");
//		System.out.println("���缮 \t�⼮ \t�Ἦ \t�⼮");
//		System.out.println("��ȣ�� \t�Ἦ \t�⼮ \t�⼮");
//		System.out.println("===========================");

		// �Է¹޾� => ������ ���� => ������ ���
		// 1. �Է���ġ ��ü �����
		Scanner sc = new Scanner(System.in);
		System.out.println("1��° �л��� : ");
		String name1 = sc.next();

		System.out.println("1��° �� 1���� �⼮���� : ");
		String ����1_1 = sc.next();

		System.out.println("1��° �� 2���� �⼮���� : ");
		String ����1_2 = sc.next();

		System.out.println("1��° �� 3���� �⼮���� : ");
		String ����1_3 = sc.next();

		System.out.println("2��° �л��� : ");
		String name2 = sc.next();

		System.out.println("2��° �� 1���� �⼮���� : ");
		String ����2_1 = sc.next();

		System.out.println("2��° �� 2���� �⼮���� : ");
		String ����2_2 = sc.next();

		System.out.println("2��° �� 3���� �⼮���� : ");
		String ����2_3 = sc.next();

		System.out.println("3��° �л��� : ");
		String name3 = sc.next();

		System.out.println("3��° �� 1���� �⼮���� : ");
		String ����3_1 = sc.next();

		System.out.println("3��° �� 2���� �⼮���� : ");
		String ����3_2 = sc.next();

		System.out.println("3��° �� 3���� �⼮���� : ");
		String ����3_3 = sc.next();

		System.out.println("===========�⼮��============");
		System.out.println(name1 + "\t" + ����1_1 + "\t" + ����1_2 + "\t" + ����1_3);
		System.out.println(name2 + "\t" + ����2_1 + "\t" + ����2_2 + "\t" + ����2_3);
		System.out.println(name3 + "\t" + ����3_1 + "\t" + ����3_2 + "\t" + ����3_3);
		System.out.println("===========================");

	}
}

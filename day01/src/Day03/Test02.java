package Day03;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		// ����1.�ϳ��� ������ �Է¹޾� 80�� �̻��̸� �հ���� �ƴϸ� Ż��
//		System.out.println("���� : ");
//		int p = sc.nextInt();
//
//		if (p > 80) {
//			System.out.println("�հ�!");
//		} else {
//			System.out.println("Ż��..");
//		}
//		// ����2. 
//		System.out.println("����2 : ");
//		int pt = sc.nextInt();
//
//		if (pt > 90)
//			System.out.println("A");
//		else if (pt >= 80)
//			System.out.println("B");
//		else if (pt >= 70)
//			System.out.println("C");
//		else if (pt >= 60)
//			System.out.println("F");
//		else
//			System.out.println("Ż��");

		// ���� 3. �ϳ��� ������ ������ �Է¹޾�
		// 90�� �̻��̸�
		// �����̸� A-1���
		// �����̸� A-2���... D����
		System.out.println("���� : ");
		int a = sc.nextInt();

		System.out.println("���� : ");
		String b = sc.next();

		if (a >= 90) {
			if (b.equals("����") ) System.out.println("A-1");
			else System.out.println("A-2");
		}
		else if (a >= 80) {
			if (b.equals("����") ) System.out.println("B-1");
			else System.out.println("B-2");
			
		}
		else if (a >= 70) {
			if (b.equals("����") ) System.out.println("C-1");
			else System.out.println("C-2");
			
		}
		else if (a >= 60) {
			if (b.equals("����") ) System.out.println("D-1");
			else System.out.println("D-2");
			
		}
		else System.out.println("Ż��");

		// if
		// ex)
//		if (3 > 1)
//			System.out.println("3�� ũ��");
//
//		if (3 > 5)
//			System.out.println("3�� ũ��");
//
//		// �����ڵ尡 2�� �̻��϶� ex)
//		if (3 > 1) { // if s
//			System.out.println("true �Դϴ�");
//			System.out.println("3�� ũ��!");
//		}
//		if (3 > 5) {
//			System.out.println("3�� ũ��!");
//		} else {
//			System.out.println("3�� �۴�");
//			
//		//ex4)
//			if(3>5) {
//				System.out.println("3��ŭ");
//			}
//			else if(3>4) {
//				System.out.println("3ŭ2");
//			}
//			else if (3>2) {
//				System.out.println("3ŭ3");
//			}
//			else {
//				System.out.println("True������");
//			}

		
	}
}

package day04;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		while(true) // ���ѹݺ� => ��ӹݺ��ϱ�
			
		System.out.println("���� ���� �� ����");
		
		System.out.println("ù��° �÷��̾� ���� : ");
		String �÷��̾�1 = sc.next();
		int �÷��̾�1��=3;

		if (�÷��̾�1.equals("����"))
			�÷��̾�1�� = 0;
		else if (�÷��̾�1.equals("����"))
			�÷��̾�1�� = 1;
		else if (�÷��̾�1.equals("��"))
			�÷��̾�1�� = 2;
		else
			System.out.println("�߸��Է��߽��ϴ�.");

		System.out.println("�ι�° �÷��̾� ���� : ");
		String �÷��̾�2 = sc.next();
		int �÷��̾�2��=3;
		if (�÷��̾�2.equals("����"))
			�÷��̾�2�� = 0;
		else if (�÷��̾�2.equals("����"))
			�÷��̾�2�� = 1;
		else if (�÷��̾�2.equals("��"))
			�÷��̾�2�� = 2;
		else
			System.out.println("�߸��Է��߽��ϴ�.");

		// �¸� �Ǵ�
		if (�÷��̾�1�� == 0) {
			if (�÷��̾�2�� == 2)
				System.out.println("�÷��̾� 1 �¸�");
			else if (�÷��̾�2�� == 1)
				System.out.println("�÷��̾�2 �¸�");
			else
				System.out.println("���º�");
		} else if (�÷��̾�1�� == 1) {
			if (�÷��̾�2�� == 0)
				System.out.println("�÷��̾� 1 �¸�");
			else if (�÷��̾�2�� == 2)
				System.out.println("�÷��̾�2 �¸�");
			else
				System.out.println("���º�");
		} else if (�÷��̾�1�� == 2) {
			if (�÷��̾�2�� == 0)
				System.out.println("�÷��̾� 2 �¸�");
			else if (�÷��̾�2�� == 1)
				System.out.println("�÷��̾�1 �¸�");
			else
				System.out.println("���º�");

		}
		else {
			System.out.println("�߸� �Էµ� ���� �ֽ��ϴ� [�ٽ�]");
		}
	}
}
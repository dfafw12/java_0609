package day04;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// ���� 4 : ���Ǳ� ����� [�ݶ�[��� : 10��]] => 500�� ���̴� [��� :5��] = > 600��, ȯŸ[��� :7��] =>
		// 700��
		// 1. ���Ǳ� ���α׷� ���ѷ���
		// 2. ����ڿ��� �ݾ��� �Է� �ޱ�
		// 3. �Է¹��� �ݾ����� ��ǰ ����
		// 1. ��ǰ ��ȣ�� ���� �Է¹޾� ����
		// 4. ���� ����, ��� ����, ���� ����
		Scanner sc = new Scanner(System.in);

		while (true) { // ���� ����
			System.out.println(" ���Ǳ� ");
			System.out.println("�ݾ��� �־��ּ��� : ");
			int dr = sc.nextInt();

			int �ѱݾ� = 0;

			int �ݶ���� = 10;
			int ���̴���� = 5;
			int ȯŸ��� = 7;
			int �ݶ󱸸ż� = 0;
			int ���̴ٱ��ż� = 0;
			int ȯŸ���ż� = 0;

			while (true) {
				System.out.println("1.�ݶ�[500��], 2.���̴�[600��], 3.ȯŸ[700��], 4.����");
				int ���� = sc.nextInt();

				if (���� == 1) {

					System.out.println("���� ���� : ");
					�ݶ󱸸ż� = sc.nextInt();
					if (�ݶ󱸸ż� > �ݶ����) {
						System.out.println("��� ����");
					} else if ((�ݶ󱸸ż� * 500) > dr) {
						System.out.println("�ݾ� ����");
					} else {
						System.out.println("��ٱ��Ͽ� �߰�");

						if ((�ѱݾ� += �ݶ󱸸ż� * 500) > dr) {
							System.out.println("�ݾ� ����");
						} else {
							�ѱݾ� += �ݶ󱸸ż� * 500;
							�ݶ���� -= �ݶ󱸸ż�;
					}
				}
				if (���� == 2) {
					System.out.println("���� ���� : ");
					���̴ٱ��ż� = sc.nextInt();
					if (���̴ٱ��ż� > ���̴����) {
						System.out.println("��� ����");
					} else if ((���̴ٱ��ż� * 600) > dr) {
						System.out.println("�ݾ� ����");
					} else {
						System.out.println("��ٱ��Ͽ� �߰�");

						if ((�ѱݾ� += ���̴ٱ��ż� * 600) > dr) {
							System.out.println("�ݾ� ����");
						} else {
							�ѱݾ� += ���̴ٱ��ż� * 600;
							���̴���� -= ���̴ٱ��ż�;
					}
				}
				}
				if (���� == 3) {
					System.out.println("���� ���� : ");
					ȯŸ���ż� = sc.nextInt();
					if (ȯŸ���ż� > ȯŸ���) {
						System.out.println("��� ����");
					} else if ((ȯŸ���ż� * 700) > dr) {
						System.out.println("�ݾ� ����");
					} else {
						System.out.println("��ٱ��Ͽ� �߰�");

						if ((�ѱݾ� += ȯŸ���ż� * 700) > dr) {
							System.out.println("�ݾ� ����");
						} else {
							�ѱݾ� += ȯŸ���ż� * 500;
							ȯŸ��� -= ȯŸ���ż�;
					}
				}
				}
				if (���� == 4) {
					System.out.println("��ٱ���");
					if (�ݶ󱸸ż� != 0)
						System.out.println("�ݶ� ���� : "+�ݶ󱸸ż�+"\n"+"���̴� ���� : "+���̴ٱ��ż�+"\n"+"ȯŸ ���� : "+ȯŸ���ż�+"\n");

				}
				}

			}
		}
	}

}

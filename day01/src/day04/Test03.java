package day04;

import java.util.Random;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		int a = 0;
		int ��1 = 0;
		int ��2 = 0;

		while (true) {

			Scanner sc = new Scanner(System.in);
//	while(true) // ���ѹݺ� => ��ӹݺ��ϱ�

			System.out.println("���� ���� �� [������ =end] ����");

			System.out.println("ù��° �÷��̾� ���� : ");
			String �÷��̾�1 = sc.next();
			int �÷��̾�1�� = 3;

			if (�÷��̾�1.equals("����"))
				�÷��̾�1�� = 0;

			else if (�÷��̾�1.equals("����"))
				�÷��̾�1�� = 1;
			else if (�÷��̾�1.equals("��"))
				�÷��̾�1�� = 2;
			else if (�÷��̾�1.equals("end"))
				break;

			else
				System.out.println("�߸��Է��߽��ϴ�.");

			Random random = new Random();
			int �÷��̾�2�� = random.nextInt(3);
			if (�÷��̾�2�� == 0)
				System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
			else if (�÷��̾�2�� == 1)
				System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
			else if (�÷��̾�2�� == 2)
				System.out.println("��ǻ�ʹ� �� �½��ϴ�.");

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

			} else {
				System.out.println("�߸� �Էµ� ���� �ֽ��ϴ� [�ٽ�]");
			}
			if (�÷��̾�1�� > �÷��̾�2��)
				++��1;
			else if (�÷��̾�2�� > �÷��̾�1��)
				++��2;

			++a;
		}
		System.out.println("�� ���� �� : " + a);
		if (��1 > ��2)
			System.out.println("�÷��̾�1�� ���� �¸�! " + ��1 + "��");
		else if (��2 > ��1)
			System.out.println("�÷��̾�2 (��ǻ��) �� ���� �¸�! " + ��2 + "��");
		else
			System.out.println("���º�");
	}

}
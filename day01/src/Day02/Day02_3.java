package Day02;

import java.util.Scanner;

public class Day02_3 {
	public static void main(String[] args) {
		// ����2 : 2���� �л���� ���� , ����, ���� ������ �Է¹޾� ���

		// ==========����ǥ===========
		// �л��� ���� ���� ���� ���� ���
		// ���缮 90 80 70 240 80
		// ��ȣ�� 100 70 80 250 83.3
		// ==========================
		Scanner sc = new Scanner(System.in);

//		System.out.println("1��° �л����Է� : ");
//		String st1 = sc.next();
//		System.out.println("1�л��� ���������Է� : ");
//		int st1_kr = sc.nextInt();
//		System.out.println("1�л��� ���������Է� : ");
//		int st1_en = sc.nextInt();
//		System.out.println("1�л��� ���������Է� : ");
//		int st1_ma = sc.nextInt();
//		int st1_���� =st1_kr + st1_en + st1_ma;
//		double st1_avg = (st1_kr + st1_en + st1_ma)/3.0;
//		
//
//		System.out.println("2��° �л����Է� : ");
//		String st2 = sc.next();
//		System.out.println("2�л��� ���������Է� : ");
//		int st2_kr = sc.nextInt();
//		System.out.println("2�л��� ���������Է� : ");
//		int st2_en = sc.nextInt();
//		System.out.println("2�л��� ���������Է� : ");
//		int st2_ma = sc.nextInt();
//		int st2_���� =st2_kr + st2_en + st2_ma;
//		double st2_avg = (st2_kr + st2_en + st2_ma)/3.0;
//		
//
//		
//		System.out.println("==========����ǥ===========");
//		System.out.println("�л���	����	����	����	����	���");
//		System.out.println(st1+"\t"+st1_kr+"\t"+st1_en+"\t"+st1_ma+"\t"+st1_����+"\t"+st1_avg);
//		System.out.println(st1+"\t"+st2_kr+"\t"+st2_en+"\t"+st2_ma+"\t"+st2_����+"\t"+st2_avg);
//		System.out.println("==========================");

		// ���� 3 : 1���� ȸ������ ǥ �����
		// ���̵�, ��й�ȣ, �̸�, ����, ����, �̸���, �̓ҹ޾� ����ϱ�
		// ==========ȸ������=========
		// ���̵� ��й�ȣ ���� �̸���
		// asdf 1234 ���缮 asdf@naver.com

		// ���� ����

		System.out.println("�ݾ� �Է� :");
		int �ݾ� = sc.nextInt();
		System.out.println("�ʸ����� : " + �ݾ� / 100000 + "��");
		�ݾ� -= (�ݾ� / 100000) * 100000;
		System.out.println("������ : " + �ݾ� / 10000 + "��");
		�ݾ� -= (�ݾ� / 10000) * 10000;
		System.out.println("õ���� : " + �ݾ� / 1000 + "��");
		�ݾ� -= (�ݾ� / 1000) * 1000;
		System.out.println("��� : " + �ݾ� / 100 + "��");

	}
}

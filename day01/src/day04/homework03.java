package day04;

import java.util.Scanner;

public class homework03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String tid = "qwer1234";
		int tpw = 1234;
		String id;
		String pw;
		
		while (true) {
			System.out.println("���̵� : ");
			id = sc.next();
			System.out.println("��й�ȣ : ");
			pw = sc.next();

			if (id.equals(tid)) {
				if (pw.equals(tpw)) {
					System.out.println("�α��� ����!");
					break;
				} else
					System.out.println("�α��� ����, �ٽ� �Է����ּ���");
			} else
				System.out.println("�α��� ����, �ٽ� �Է����ּ���");
		}
	}
}

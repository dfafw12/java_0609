package Day12;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id, pw, name;
		// ����1. ȸ������
		// 1] member Ŭ������ �����ؼ� �ʵ� ����
		// 2] ����ʵ� private ���� : ���̵� ,��й�ȣ , ����
		// 3] ���̵�� ��й�ȣ, ������ �Է¹ޱ�
		// 4] ��ü �����Ͽ� public �޼ҵ带 ���� ����
		// 5] public �޼ҵ� �ʵ� ȣ��
		

		// ����2. �α���

		System.out.println("���̵� �Է� : ");
		id = sc.next();
		System.out.println("��й�ȣ �Է�: ");
		pw = sc.next();
		System.out.println("�̸� �Է� : ");
		name = sc.next();

		member user = new member();
		user.setId(id);
		user.setPw(pw);
		user.setName(name);

		user.getId();
		user.getPw();
		user.getName();
		System.out.println("���̵� : " + user.getId());
		System.out.println("��й�ȣ : " + user.getPw());
		System.out.println("�̸� : " + user.getName());

		try {
			user.login(id, pw);
		} catch (Exception e) {
			System.out.println("�α��� ����");
			System.out.println("���� ���� : " + e);
		}

	}

}

package Day08;

import java.util.Scanner;

public class ȸ��1 {
	Scanner sc = new Scanner(System.in);
	String id, pw, name, pn;

	public ȸ��1(String id, String pw, String name, String pn) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.pn = pn;

	}

	public void ȸ������() {


		System.out.println("ȸ������ ����");

		System.out.println("���̵� : ");
		id = sc.next();
		System.out.println("��й�ȣ : ");
		pw = sc.next();
		System.out.println("�̸� : ");
		name = sc.next();
		System.out.println("����ó : ");
		pn = sc.next();
		ȸ��1 temp = new ȸ��1(id, pw, name, pn);
		

	}

}

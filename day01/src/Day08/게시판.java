package Day08;

import java.util.Scanner;

public class �Խ��� {
	Scanner sc = new Scanner(System.in);
	// �ʵ�
	// int ��ȣ; => ����Ʈ ��� ���� => ����Ʈ �ε���
	String ����;
	String ����;
	String �ۼ���;
	int ��ȸ��;

	// ������ : �������� �̸��� Ŭ������� �����ϰ� ����
	// �� ������
	public �Խ���() {

	}

	// ��� �ʵ带 �޴� ������
	public �Խ���(String ����, String ����, String �ۼ���, int ��ȸ��) {

		// �μ��� ���� ��ȣ�� ����Ŭ������ ��ȣ�� �־��ֱ�
		this.���� = ����;
		this.���� = ����;
		this.�ۼ��� = �ۼ���;
		this.��ȸ�� = ��ȸ��;
	}

	// �޼ҵ�
	// 1. �Խù� ���

	public void �Խù����() {
		System.out.println("�Խù� ���");
		System.out.println("���� :");
		String ���� = sc.next();
		System.out.println("���� : ");
		String ���� = sc.next();
		System.out.println("�ۼ��� : ");
		String �ۼ��� = sc.next();
		// ��ü ����
		// �Խù� ��ȣ : ����Ʈ�� ����� ��ü���� +1
		�Խ��� temp = new �Խ���(����, ����, �ۼ���, 0);
		Test02.�Խù����.add(temp);
	}

	// �Խù� ���
	public void �Խù����() {
		System.out.println(this.���� + "\t" + this.�ۼ��� + "\t" + this.��ȸ��);
	}

	// 2. �Խù� ����

	public void �Խù�����(int ��ȣ) { // int ���� ������ int �� �ޱ�
		System.out.println("���� ������");
		Test02.�Խù����.remove(��ȣ);
		System.out.println("���� �Ϸ�!");

	}

	// 3. �Խù� ��ȸ�� ����

	public void �Խù���ȸ��() {
		this.��ȸ��++;

	}

	// 4. �ش� �Խù� ����

	public void �Խù�����(int ��ȣ) {
		// �μ� �ޱ�
		�Խ��� temp = Test02.�Խù����.get(��ȣ);
		System.out.println("�Խù� ��������");

		temp.�Խù���ȸ��(); // ��ȸ�� ����

		System.out.println("���� : " + temp.���� + "��ȸ�� : " + temp.��ȸ��);
		System.out.println("���� : " + temp.����);
		System.out.println();
	}

}

package Day02; // ��Ű����

import java.util.Scanner;

public class Test01 { // Ŭ������
	// Ŭ���� ����
	public static void main(String[] args) { // ���� ����
		// main : ������ => �ڵ带 �о��ִ� ����;
		// ���� �ڵ�
		System.out.println("�ڹ��Դϴ�");

		// �Է� Ŭ������ �̿��� �Է� ��ü �����
		Scanner �Է���ġ = new Scanner(System.in);
		// ��ü ����� : Ŭ������ ��ü�̸� = new �����ڸ�();
		// new : ��ü�� �޸� �Ҵ�
		// System.in : �Է���ġ

		// �Է°�ü�� �Էµ� �� �����ͼ� ������ ����
		// int ���� = �Է���ġ.nextInt();
		// �Է���ġ ��ü�� ����� ���� ��������
		// ���� ����� : �ڷ��� �����̸� = ������ ;

		// ������ ���
		// System.out.println("���� �Է��� �� : " + ����);

		int ����1 = 0;
		int ����2 = 10;
		System.out.println(����1);
		System.out.println(����2);
		// int ����1 =123; // ���� ������ �ѹ��� ����!
		����1 = 123; // ������ ������ ���� ����!
		System.out.println(����1);

		// ���� ��� : " " ó�� X
		System.out.println("����2 ������ ����� �� : " + ����2);

		// �ڷ���
		boolean ������ = true; // 1byte
		// true, false �� ���� ����!
		System.out.println("boolean�� ���� : " + ������);

		char ���ں��� = 'a'; // 2byte
		// char = 2����Ʈ : ���� ���
		System.out.println("char�� ���� : " + ���ں���);
		char ���ں���2 = 97; // char���� ���ڸ� �ƽ�Ű �ڵ�� ��ȯ
		System.out.println("char�� ���� 2 : " + ���ں���2);

		byte ����Ʈ���� = 100; // 1byte
		System.out.println("byte�� ���� : " + ����Ʈ����);
		byte ����Ʈ����2 = 'a'; // byte���� ���ڸ� �ƽ�Ű�ڵ�� �ν��ؼ� ���ڸ� �׿��´� ���ڷ� ��ȯ��
		System.out.println("byte�� ����2 : " + ����Ʈ����2);

		short ��Ʈ���� = 300; // 2byte
		System.out.println("short�� ���� : " + ��Ʈ����);
		short ��Ʈ����2 = 'a'; // byte�� ������ ��������.
		System.out.println("short�� ����2 : " + ��Ʈ����2);

		int ��Ʈ���� = 3000; // 4byte
		System.out.println("int�� ���� : " + ��Ʈ����);
		// int ��Ʈ����2 = 'abc'; // ���ڿ��� ������
		// int ��Ʈ����2 = 'a';
		
		long �պ��� = 99999999999999l; // 8byte
		System.out.println("long�� ���� : " + �պ���);
		
		float �Ǽ����� = 10.5111111f;
		System.out.println("�Ǽ��� ���� : " + �Ǽ�����);
		double �Ǽ�����2 = 10.51111111111;
		System.out.println("�Ǽ��� ���� 2 : " + �Ǽ�����2);
		
		String ���ڿ���ü = new String();
		���ڿ���ü = "�ȳ��ϼ���";
		System.out.println("String�� ���� : " + ���ڿ���ü);
		String ���ڿ���ü2 = "�ȳ��ϼ���22";
		System.out.println("String�� ����2 : " + ���ڿ���ü2);
		
		// int�� �ڷ����� Ŭ����
		Integer ����3 = 123;
		System.out.println("Ŭ������ int��ü : " + ����3);
		
		
		// �� ��ȯ => Ŭ���� / �ڷ��� ����
			// �������� -> ū���� ����
		char ��ȯ1 = 123;
		int ��ȯ2 = ��ȯ1;
		float ��ȯ3 = 10.5f;
		double ��ȯ4 = ��ȯ3;
		
		//���� ����ȯ
		double ��ȯ5 = 10.5;
		float ��ȯ6 = (float)��ȯ5; 
		
		
		
		
		
		
	} // ���γ�

} // Ŭ���� ��

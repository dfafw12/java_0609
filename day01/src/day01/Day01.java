package day01;

public class Day01 { // Ŭ����

	// �ּ�ó�� : �ڵ弳�� // ���� ���� X

	// ��Ʈ�� + �����̽��� : �ڵ��ϼ�

	public static void main(String[] args) {// main ����

		// sysout �Է��� ��Ʈ�� + �����̽���
		System.out.println("java");
		System.out.println(10);
		// System Ŭ����

		// 1. ����ϱ� : System �̿��� �ܼ� ����ϱ�
		System.out.println("�ȳ��ϼ���."); // Ű���带 ������ ���ڴ� "" ó��
		System.out.println("�ȳ��ϼ���10"); // �������
		System.out.println("�ȳ��ϼ���" + 10); // ���� + ���� : ���Ῥ����
		System.out.println("�ȳ��ϼ���" + "java �Դϴ�"); // ���ڶ� ���� : ���� ������
		System.out.println(10 + 10); // ���� + ���� = ���ϱ� ������

		System.out.print("\t�ȳ�\n�ϼ���");
		System.out.print("\t�ȳ��ϼ���10\n");
		System.out.printf("%d", 10); // ����
		System.out.printf("%d" + "%d", 10, 10, "\n");
		System.out.printf("%d", 10 + 10, "\n");
		System.out.println();

		System.out.println("===========�⼮��============");
		System.out.println("���� \t1���� \t2���� \t3����");
		System.out.println("���缮 \t�⼮ \t�Ἦ \t�⼮");
		System.out.println("��ȣ�� \t�Ἦ \t�⼮ \t�⼮");
		System.out.println("===========================");

		// ����2 : ����1 print
		System.out.print("===========�⼮��============\n");
		System.out.print("���� \t1���� \t2���� \t3����\n");
		System.out.print("���缮 \t�⼮ \t�Ἦ \t�⼮\n");
		System.out.print("��ȣ�� \t�Ἦ \t�⼮ \t�⼮\n");
		System.out.print("===========================\n");
		System.out.println();

		// ����3 : ����2 printf
		System.out.printf("===========%s============\n","�⼮��");
		System.out.printf("%s\t%s\t%s\t%s\n","����","1����","2����","3����");
		System.out.printf("%s\t%s\t%s\t%s\n","��ȣ��","�⼮","�Ἦ","�⼮");
		System.out.printf("%s\t%s\t%s\t%s\n","���缮","�⼮","�⼮","�Ἦ");
		System.out.printf("===========================\n");
			
		/*
		   ����1. println, print, printf
		   ==================ȸ�����====================
		   ���̵�		���		�̸�		�ֹε�Ϲ�ȣ
		   kgs2072	1234	������	780621-1545454
		   asdasd	1515	���缮 	434454-2463547
		   ============================================	
		   
		 */

	} // main ��
} // Ŭ����

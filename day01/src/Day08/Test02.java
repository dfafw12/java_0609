package Day08;

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {
	public static ArrayList<�Խ���> �Խù���� = new ArrayList();
	// main �ۿ��� �����ϱ� => main �ۿ����� ����ϱ� ���ؼ�
	public static Scanner sc = new Scanner(System.in);

	// static : main �����尡 �ڵ��о��ִµ� main �ۿ� ������ ������
	// => static : static ����� ������ ������ �ڵ� ����� ���� �Ÿ� �Ҵ�
	public static void main(String[] args) {

		// �Խ��� Ŭ����
		// 1. �ʵ� : ����
		// 1] �Խ��ǹ�ȣ, �Խù�����, �Խù�����, �Խù� �ۼ���, ��ȸ�� ��
		// 2. ������ [�ʼ�X] : ��ü������ �ʱⰪ
		// 1] �������, Ư���ʵ常 �޴� ������, ����ʵ带 �޴� ������ ��
		// 3. �޼ҵ� : �ൿ [�����ڵ�] : �ݺ������� ���Ǵ� �ڵ� ����
		// 1, �Խù� ���, �Խù� ����, �Խù� ��ȸ�� ����, �Խù� ���� ��

		// list : �÷���(����) �����ӿ�ũ(�̸� ������� Ŭ����)
		while (true) {
			System.out.println("==== �Խ��� Ŀ�´�Ƽ ====");
			System.out.println("��ȣ\t����\t�ۼ���\t��ȸ��");
			// �ݺ����� �̿��� ����Ʈ�� ��ü ��� ������
			for (int i = 0; i < �Խù����.size(); i++) {
				System.out.print((i + 1) + "\t");
				�Խ��� temp = �Խù����.get(i);
				temp.�Խù����();
				System.out.println();
			}
			System.out.println("1.���, 2.�Խù� ����, 3.�Խù� ����");
			int ���� = sc.nextInt();
			if (���� == 1) {
				�Խ��� temp = new �Խ���();
				temp.�Խù����();
			}
			if (���� == 2) {
				System.out.println("�Խù���ȣ�Է� : ");
				int ��ȣ = sc.nextInt();
				�Խ��� temp = new �Խ���();
				temp.�Խù�����(��ȣ);

			}
			if (���� == 3) {
				System.out.println("������ �Խù� ��ȣ : ");
				int ��ȣ = sc.nextInt();
				�Խ��� temp = new �Խ���();
				temp.�Խù�����(��ȣ);
			}
		}
	}
}

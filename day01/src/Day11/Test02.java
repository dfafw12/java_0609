package Day11;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// extends :���
		// implements : �������̽� ����
		// 1. �������̽� ��ü

		Ű����ũ Ű����ũ = null; // ����ó��
		// Ű����ũ Ű����ũ; // �����Ⱚ [���ǰ�]

		// 2. ���� ��� ����
		System.out.println("1. �Ե�����, 2. ī��");
		int ������ = sc.nextInt();

		if (������ == 1)
			Ű����ũ = new �Ե�����();
		if (������ == 2)
			Ű����ũ = new ī��();

		while (true) {
			System.out.println("===Ű����ũ===");
			System.out.println("1.�޴�, 2. ��ٱ���, 3. ����, 4. ����");
			int ���� = sc.nextInt();

			if (���� == 1)
				Ű����ũ.�޴�();
			if (���� == 2)
				Ű����ũ.��ٱ���();
			if (���� == 3)
				Ű����ũ.����();
			if (���� == 4)
				Ű����ũ.����();
			break;
		}

	}
}

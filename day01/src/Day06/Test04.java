package Day06;

import java.util.Random;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ��� ����

		// 1. ������ �����
//		String[] ������ = new String[9];
//		������[0] = "[]";
//		������[1] = "[]";
//		������[2] = "[]";
//		������[3] = "[]";
//		������[4] = "[]";
//		������[5] = "[]";
//		������[6] = "[]";
//		������[7] = "[]";
//		������[8] = "[]";
		String[] ������ = { "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]" };
		while (true) {
			// 2. ������ ���
			for (int i = 0; i < ������.length; ++i) {
				// 3�� �� ����� �ٹٲ�
				System.out.print(������[i]);
				if (i % 3 == 2)
					System.out.println();

			}

			// 3. ����ڿ��� �Է¹޾� �˳���.
			// �̹� �� �ڸ����� �Է��Ҽ� ������ X
			while (true) {
				System.out.println("��ȣ ���� [0~8]");
				int ���� = sc.nextInt();

				if (������[����].equals("[ ]")) {
					������[����] = "[O]";
					break;
				} else
					System.out.println("�̹� �� �ڸ��Դϴ� [�ٸ��� ����]");
			}
			// 4. ��ǻ�� �÷��̾�
			System.out.println("��ǻ�� ���� �Դϴ�.");
			Random random = new Random();
			while (true) {
				int ���� = random.nextInt(9);
				if (������[����].equals("[ ]")) {
					������[����] = "[X]";
					break;
				}
			}
			String �¸��� = "O";
			// 5. �̱�� ����� ��
			// 012,345,678,037,148,269,048,246
//			if (������[0].equals("[X]") && ������[1].equals("[X]") && ������[2].equals("[X]") ) System.out.println(" ��ǻ�� �¸�!");
//			if (������[3].equals("[X]") && ������[4].equals("[X]") && ������[5].equals("[X]") ) System.out.println(" ��ǻ�� �¸�!");
//			if (������[6].equals("[X]") && ������[7].equals("[X]") && ������[8].equals("[X]") ) System.out.println(" ��ǻ�� �¸�!");
			for (int i = 0; i <= 6; i += 3) {
				if (������[i].equals(������[i + 1]) && ������[i + 1].equals(������[i + 2])) {
					if (!������[i].equals("[ ]"))
						�¸��� = ������[i];
				}
			}
			if (������[0].equals(������[4]) && ������[4].equals(������[8])) {
				if (!������[0].equals("[ ]"))
					�¸��� = ������[0];
			}
			if (������[0].equals(������[3]) && ������[3].equals(������[6])) {
				if (!������[0].equals("[ ]"))
					�¸��� = ������[0];
			}


			if (�¸���.equals("[O]")) {
				System.out.println("�÷��̾� �¸�!");
				break;

			} else if (�¸���.equals("[X]")) {
				System.out.println("��ǻ�� �¸�!");
				break;
			}
		}
	}
}

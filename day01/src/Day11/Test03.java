package Day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Test03 {
	public static ArrayList<����> ���¸�� = new ArrayList<>();
	public static Scanner sc = new Scanner(System.in);
	// static : �޸� �켱�Ҵ� => ���α׷������ �Ҵ�/ ���α׷������ �ʱ�ȭ
	// ������ : ���α׷� ��ü ���Ǵ� �޸�

	public static void main(String[] args) {

		ATM atm = null;
		atm = new ����();
		while (true) {
			System.out.println("1.�������� 2. �������� 3. �������� 4. ����");
			int ���� = sc.nextInt();

			if (���� == 1) {
				System.out.println("�������� ����");
				atm = new ��������();
				atm.�޴�();
			}
			if (���� == 2) {
				System.out.println("�������� ����");
				atm = new ��������();
			}
			if (���� == 3) {
				System.out.println("�������� ����");
				atm = new ��������();
			}
			if (���� == 4)
				break;
		}

	}
}

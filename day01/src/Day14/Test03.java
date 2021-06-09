package Day14;

import java.util.Calendar;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();

		System.out.println("�⵵ : ");
		int year = sc.nextInt();

		System.out.println("�� : ");
		int month = sc.nextInt();

		calendar.set(year, month - 1, 1);
		int sDay = calendar.get(calendar.DAY_OF_WEEK);
		int eDay = calendar.getActualMaximum(calendar.DAY_OF_MONTH);

		System.out.println("==================" + year + "��	" + month + "�� ========================");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		System.out.println("===================================================");

		int ssDay = sDay;

		System.out.println("==================" + year + "��	" + month + "�� ========================");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		System.out.println("===================================================");

		// �� ���� 1���� ��ġ
		for (int i = 1; i < sDay; ++i) {
			System.out.print("\t");

		}

		// ���� ���
		for (int i = 1; i <= eDay; ++i) {
			System.out.print(i + "\t");
			if (ssDay % 7 == 0)
				System.out.println(); // �ٹٲ�
			ssDay++;
				
		}
		
	}
}

package Day14;

import java.util.Calendar;
import java.util.Scanner;

public class �޷� {

	public �޷�() {
	}

	public static void �޷°˻�(int year, int month) {

		Calendar calendar = Calendar.getInstance();



		calendar.set(year, month - 1, 1);
		int sDay = calendar.get(calendar.DAY_OF_WEEK);
		int eDay = calendar.getActualMaximum(calendar.DAY_OF_MONTH);

		System.out.println("==================" + year + "��	" + month + "�� ========================");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		System.out.println("====================================================");

		int ssDay = sDay;



		for (int i = 1; i < sDay; ++i) {
			System.out.print("\t");

		}

		for (int i = 1; i <= eDay; ++i) {
			System.out.print(i + "\t");
			if (ssDay % 7 == 0)
				System.out.println();
			ssDay++;
		}
		
	}
}

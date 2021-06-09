package Day14;

import java.util.Calendar;
import java.util.Scanner;

public class 달력 {

	public 달력() {
	}

	public static void 달력검색(int year, int month) {

		Calendar calendar = Calendar.getInstance();



		calendar.set(year, month - 1, 1);
		int sDay = calendar.get(calendar.DAY_OF_WEEK);
		int eDay = calendar.getActualMaximum(calendar.DAY_OF_MONTH);

		System.out.println("==================" + year + "년	" + month + "월 ========================");
		System.out.println("일\t월\t화\t목\t금\t토\t일");
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

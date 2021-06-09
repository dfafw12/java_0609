package Day14;

import java.util.Calendar;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();

		System.out.println("년도 : ");
		int year = sc.nextInt();

		System.out.println("달 : ");
		int month = sc.nextInt();

		calendar.set(year, month - 1, 1);
		int sDay = calendar.get(calendar.DAY_OF_WEEK);
		int eDay = calendar.getActualMaximum(calendar.DAY_OF_MONTH);

		System.out.println("==================" + year + "년	" + month + "월 ========================");
		System.out.println("일\t월\t화\t목\t금\t토\t일");
		System.out.println("===================================================");

		int ssDay = sDay;

		System.out.println("==================" + year + "년	" + month + "월 ========================");
		System.out.println("일\t월\t화\t목\t금\t토\t일");
		System.out.println("===================================================");

		// 현 월의 1일의 위치
		for (int i = 1; i < sDay; ++i) {
			System.out.print("\t");

		}

		// 요일 출력
		for (int i = 1; i <= eDay; ++i) {
			System.out.print(i + "\t");
			if (ssDay % 7 == 0)
				System.out.println(); // 줄바꿈
			ssDay++;
				
		}
		
	}
}

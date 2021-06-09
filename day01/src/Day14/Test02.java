package Day14;

import java.util.Calendar;

public class Test02 {
	public static void main(String[] args) {

		// 현재 날짜의 달력
		Calendar calendar = Calendar.getInstance(); // 1. 현재 달력 가져오기
		int today = calendar.get(calendar.DAY_OF_MONTH); // 2. 현재 날짜의 일수
		int year = calendar.get(calendar.YEAR); // 3. 현재 날짜의 연도
		int month = calendar.get(calendar.MONTH) + 1; // 4. 현재날짜의 월 +1 [1월:0 ~ 12월:11]

		calendar.set(year, month, 1); // 5. 현재 날짜의 1일
		int sDay = calendar.get(calendar.DAY_OF_WEEK); // 6. 시작요일 //3
		int eDay = calendar.getActualMaximum(calendar.DAY_OF_MONTH); // 7. 현재 날짜 월의 마지막 일수

		// 달력 출력
		System.out.println("==================" + year + "년	" + month + "월 ========================");
		System.out.println("일\t월\t화\t목\t금\t토\t일");
		System.out.println("===================================================");

		int ssDay = sDay; // 요일구분 [토요일마다 줄바꿈] //임시

		// 현 월의 1일의 위치
		for (int i = 1; i < sDay; ++i) {
			System.out.print("\t");

		}

		// 요일 출력
		for (int i = 1; i < eDay; ++i) {
			System.out.print(i + "\t");
			if (ssDay % 7 == 0)
				System.out.println(); // 줄바꿈
			ssDay++;

		}

	}
}

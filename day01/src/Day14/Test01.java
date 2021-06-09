package Day14;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Test01 {
	public static void main(String[] args) {
		// 날짜 과련 클래스
		/*
		 * date 클래스 : 시스템 날짜/시간 SimpleDateFormat 클래스 : 날짜형식[모양]클래스 calendar : 달력 클래스
		 * .get(필드)
		 * 
		 */

		// 현재 날짜
		Date date = new Date(); // 날짜 객체
		System.out.println("날씨 객체 : " + date);
		System.out.println("날씨 객체 정보 : " + date.toString());

		// 날짜형식[모양]
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy년 mm월 dd일 HH시 MM분 SS초");
		System.out.println("날씨 형식 변경 : " + dateFormat.format(date)); // 객체 를 형식넣기

		// 예3 달력
		Calendar calendar = Calendar.getInstance(); // 현재달력
		System.out.println(calendar);

		System.out.println("연도 : " + calendar.get(calendar.YEAR));
		System.out.println("월 : " + calendar.get(calendar.MONTH) + 1); // 1월 :0 2월:1 3월:2
		System.out.println("일단위[연단위] : " + calendar.get(calendar.DAY_OF_YEAR)); // 연단위 일수
		System.out.println("일단위[주단위] : " + calendar.get(calendar.DAY_OF_WEEK)); // 주단위 일수 [일:1/월:2/화:3/~~~토:7
		System.out.println("일단위[월단위] : " + calendar.get(calendar.DAY_OF_MONTH)); // 월단위 일수

		// 요일 : 숫자 => 한글
		int 요일 = calendar.get(calendar.DAY_OF_WEEK);
		if (요일 == 1)
			System.out.println("일요일");
		if (요일 == 2)
			System.out.println("월요일");
		if (요일 == 3)
			System.out.println("화요일");
		if (요일 == 4)
			System.out.println("수요일");
		if (요일 == 5)
			System.out.println("목요일");
		if (요일 == 6)
			System.out.println("금요일");
		if (요일 == 7)
			System.out.println("토요일");

		// 예4 시간
		System.out.println("오전[0]/오후[1] : " + calendar.get(calendar.AM_PM));
		int ampm = calendar.get(calendar.AM_PM);
		if (ampm == 0)
			System.out.println("현재 오전");
		if (ampm == 1)
			System.out.println("현재 오후");

		System.out.println("현재 시 : " + calendar.get(calendar.HOUR));
		System.out.println("현재 시 : " + calendar.get(calendar.MINUTE));
		System.out.println("현재 시 : " + calendar.get(calendar.SECOND));

		// 예 5)
		LocalDate 현재날짜 = LocalDate.now();
		System.out.println(현재날짜);
		LocalDate 사용자날짜 = LocalDate.of(2024, 6, 10);
		System.out.println("사용자 날짜 : " + 사용자날짜);

		LocalTime 현재시간 = LocalTime.now();
		System.out.println(현재시간);
		LocalTime 사용자시간 = LocalTime.of(6, 30, 58);
		System.out.println("사용자시간 : " + 사용자시간);
		LocalDateTime 현재날짜시간 = LocalDateTime.now();
		System.out.println(현재날짜시간);
		LocalDateTime 사용자날짜시간 = LocalDateTime.of(2022, 1, 2, 3, 2);
		System.out.println("사용자날짜시간 + " + 사용자날짜시간);

		// 협정시계
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정세계 시 : " + zonedDateTime);

		ZonedDateTime newyork = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(newyork);

	}
}

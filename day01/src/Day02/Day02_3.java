package Day02;

import java.util.Scanner;

public class Day02_3 {
	public static void main(String[] args) {
		// 예제2 : 2명의 학생명과 국어 , 수학, 영어 점수를 입력받아 출력

		// ==========점수표===========
		// 학생명 국어 영어 수학 총점 평균
		// 유재석 90 80 70 240 80
		// 강호동 100 70 80 250 83.3
		// ==========================
		Scanner sc = new Scanner(System.in);

//		System.out.println("1번째 학생명입력 : ");
//		String st1 = sc.next();
//		System.out.println("1학생의 국어점수입력 : ");
//		int st1_kr = sc.nextInt();
//		System.out.println("1학생의 영어점수입력 : ");
//		int st1_en = sc.nextInt();
//		System.out.println("1학생의 수학점수입력 : ");
//		int st1_ma = sc.nextInt();
//		int st1_총점 =st1_kr + st1_en + st1_ma;
//		double st1_avg = (st1_kr + st1_en + st1_ma)/3.0;
//		
//
//		System.out.println("2번째 학생명입력 : ");
//		String st2 = sc.next();
//		System.out.println("2학생의 국어점수입력 : ");
//		int st2_kr = sc.nextInt();
//		System.out.println("2학생의 영어점수입력 : ");
//		int st2_en = sc.nextInt();
//		System.out.println("2학생의 수학점수입력 : ");
//		int st2_ma = sc.nextInt();
//		int st2_총점 =st2_kr + st2_en + st2_ma;
//		double st2_avg = (st2_kr + st2_en + st2_ma)/3.0;
//		
//
//		
//		System.out.println("==========점수표===========");
//		System.out.println("학생명	국어	영어	수학	총점	평균");
//		System.out.println(st1+"\t"+st1_kr+"\t"+st1_en+"\t"+st1_ma+"\t"+st1_총점+"\t"+st1_avg);
//		System.out.println(st1+"\t"+st2_kr+"\t"+st2_en+"\t"+st2_ma+"\t"+st2_총점+"\t"+st2_avg);
//		System.out.println("==========================");

		// 예제 3 : 1명의 회원가입 표 만들기
		// 아이디, 비밀번호, 이름, 성명, 성별, 이메일, 이볅받아 출력하기
		// ==========회원가입=========
		// 아이디 비밀번호 성명 이메일
		// asdf 1234 유재석 asdf@naver.com

		// 지폐 세기

		System.out.println("금액 입력 :");
		int 금액 = sc.nextInt();
		System.out.println("십만원권 : " + 금액 / 100000 + "장");
		금액 -= (금액 / 100000) * 100000;
		System.out.println("만원권 : " + 금액 / 10000 + "장");
		금액 -= (금액 / 10000) * 10000;
		System.out.println("천원권 : " + 금액 / 1000 + "장");
		금액 -= (금액 / 1000) * 1000;
		System.out.println("백원 : " + 금액 / 100 + "장");

	}
}

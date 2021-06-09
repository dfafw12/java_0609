package day01;

public class Day01 { // 클래스

	// 주석처리 : 코드설명 // 실행 관련 X

	// 컨트롤 + 스페이스바 : 자동완성

	public static void main(String[] args) {// main 시작

		// sysout 입력후 컨트롤 + 스페이스바
		System.out.println("java");
		System.out.println(10);
		// System 클래스

		// 1. 출력하기 : System 이용한 콘솔 출력하기
		System.out.println("안녕하세요."); // 키워드를 제외한 문자는 "" 처리
		System.out.println("안녕하세요10"); // 문자출력
		System.out.println("안녕하세요" + 10); // 문자 + 숫자 : 연결연산자
		System.out.println("안녕하세요" + "java 입니다"); // 문자랑 문자 : 연결 연산자
		System.out.println(10 + 10); // 숫자 + 숫자 = 더하기 연산자

		System.out.print("\t안녕\n하세요");
		System.out.print("\t안녕하세요10\n");
		System.out.printf("%d", 10); // 형식
		System.out.printf("%d" + "%d", 10, 10, "\n");
		System.out.printf("%d", 10 + 10, "\n");
		System.out.println();

		System.out.println("===========출석부============");
		System.out.println("성명 \t1교시 \t2교시 \t3교시");
		System.out.println("유재석 \t출석 \t결석 \t출석");
		System.out.println("강호동 \t결석 \t출석 \t출석");
		System.out.println("===========================");

		// 예제2 : 예제1 print
		System.out.print("===========출석부============\n");
		System.out.print("성명 \t1교시 \t2교시 \t3교시\n");
		System.out.print("유재석 \t출석 \t결석 \t출석\n");
		System.out.print("강호동 \t결석 \t출석 \t출석\n");
		System.out.print("===========================\n");
		System.out.println();

		// 예제3 : 예제2 printf
		System.out.printf("===========%s============\n","출석부");
		System.out.printf("%s\t%s\t%s\t%s\n","성명","1교시","2교시","3교시");
		System.out.printf("%s\t%s\t%s\t%s\n","강호동","출석","결석","출석");
		System.out.printf("%s\t%s\t%s\t%s\n","유재석","출석","출석","결석");
		System.out.printf("===========================\n");
			
		/*
		   과제1. println, print, printf
		   ==================회원목록====================
		   아이디		비번		이름		주민등록번호
		   kgs2072	1234	김현수	780621-1545454
		   asdasd	1515	유재석 	434454-2463547
		   ============================================	
		   
		 */

	} // main 끝
} // 클래스

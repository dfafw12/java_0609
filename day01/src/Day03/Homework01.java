package Day03;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 하나의 정수를 입력받아 7의 배수인지 확인

//		System.out.println("정수를 입력하세요 : ");
//		int a = sc.nextInt();
//		System.out.println("7의 배수 ? " + (a % 7 == 0));

		// 2. 하나의 정수를 입력받아 홀수인지 확인

//		System.out.println("정수 입력 : ");
//		int b = sc.nextInt();
//		System.out.println("홀수 ? : " + (b % 2 == 1));

		// 3. 하나의 점수를 입력받아 7의 배수이면서 짝수 인지 확인

//		System.out.println("정수 입력 : ");
//		int c = sc.nextInt();
//		System.out.println("7의배수 and 짝수 ? : " + (c % 7 == 0 && c % 2 == 0));

		// 4. 두개의 정수를 입력받아 더 큰수 확인

//		System.out.println("1정수 입력 : ");
//		int d = sc.nextInt();
//		System.out.println("2정수 입력 : ");
//		int e = sc.nextInt();
//		System.out.println("1정수 가 더 큰가? : " + (d > e));
//		System.out.println("2정수 가 더 큰가 ? : " + (e > d));

		// 5. 반지름을 입력받아 원 넓이 출력하기

//		System.out.println("반지름 입력 : ");
//		int f = sc.nextInt();
//		int g = (int) (3.14 * (f * f));
//		System.out.println("원의 넓이 : " + g);

		// 6. 두실수를 입력받아 앞 실수의 값이 뒤의 값의 몇% 인지 출력하기
		// ex) 54.5 84.3 이면 64.285714%

//		System.out.println("1정수 입력 : ");
//		double h = sc.nextDouble();
//		System.out.println("2정수 입력 : ");
//		double i = sc.nextDouble();
//		System.out.println(h/i);

		// 7. 사다리꼴 넓이 구하기 [윗변과 밑변 높이를 입력받아 출력하기
		// 사다리꼴 계산식 => (윗변* 밑변) *높이 /2

//		System.out.println("윗변 : ");
//		int j = sc.nextInt();
//		System.out.println("밑변 : ");
//		int k = sc.nextInt();
//		System.out.println("높이 : ");
//		int l = sc.nextInt();
//		System.out.println("사다리꼴 넓이 : " + (j * k) * l / 2);

		// 8. 키를 정수로 입력받아 표준체중 출력하기
		// 표준체중 계산식 => (키-100) *0.9
//		System.out.println("키 : ");
//		int m = sc.nextInt();
//		System.out.println("표준 체중 : " + ((m - 100) * 0.9)+"kg");

		// 9. 키와몸무게를 입력받아 BMI 출력
		// BMI 계산식 => 몸무게/((키/100) * (키/100))

//		System.out.println("키 : ");
//		int 키 = sc.nextInt();
//		
//		System.out.println("몸무게 : ");
//		int 몸무게 = sc.nextInt();
//		
//		double bmi = 몸무게/((키/100) * (키/100)) ;
//		System.out.println("BMI : " + bmi);

		// 10. inch 를 입력받아 cm로 변환하기

//		System.out.println("inch 입력 : ");
//		int inch = sc.nextInt();
//		double cm = inch*2.54;
//		System.out.println("cm : "+cm);

		// 11. 중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여 수소 둘째 자리 까지 점수 출력하기
		// 중간고사 반영비율 => 30%
		// 기말고사 반영비율 => 30%
		// 수행평가 반영비율 => 40%

		System.out.println("중간고사 : ");
		int mt = sc.nextInt();
		System.out.println("기말고사 : ");
		int fe = sc.nextInt();
		System.out.println("수행평가 : ");
		int pa = sc.nextInt();
		System.out.printf("중간고사 반영비율 : %.2f " , (mt * 0.3));
		System.out.println();
		System.out.printf("기말고사 반영비율 : %.2f " , (fe * 0.3));
		System.out.println();
		System.out.printf("수행평가 반영비율 : %.2f " , (pa * 0.4));
		
		// 12. 연산 순서 나열 하고 x와 y값 예측하기
		//int x = 10;
		// int y = x-- + 5 + --x;
		//printf(" x의값 : %d , y의값 : %d ", x,y)
	}
}

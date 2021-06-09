package Day03;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		// 문제1.하나의 점수를 입력받아 80점 이상이면 합격출력 아니면 탈락
//		System.out.println("점수 : ");
//		int p = sc.nextInt();
//
//		if (p > 80) {
//			System.out.println("합격!");
//		} else {
//			System.out.println("탈락..");
//		}
//		// 문제2. 
//		System.out.println("점수2 : ");
//		int pt = sc.nextInt();
//
//		if (pt > 90)
//			System.out.println("A");
//		else if (pt >= 80)
//			System.out.println("B");
//		else if (pt >= 70)
//			System.out.println("C");
//		else if (pt >= 60)
//			System.out.println("F");
//		else
//			System.out.println("탈락");

		// 문제 3. 하나의 점수와 성별을 입력받아
		// 90점 이상이면
		// 남자이면 A-1출력
		// 여자이면 A-2출력... D까지
		System.out.println("점수 : ");
		int a = sc.nextInt();

		System.out.println("성별 : ");
		String b = sc.next();

		if (a >= 90) {
			if (b.equals("남자") ) System.out.println("A-1");
			else System.out.println("A-2");
		}
		else if (a >= 80) {
			if (b.equals("남자") ) System.out.println("B-1");
			else System.out.println("B-2");
			
		}
		else if (a >= 70) {
			if (b.equals("남자") ) System.out.println("C-1");
			else System.out.println("C-2");
			
		}
		else if (a >= 60) {
			if (b.equals("남자") ) System.out.println("D-1");
			else System.out.println("D-2");
			
		}
		else System.out.println("탈락");

		// if
		// ex)
//		if (3 > 1)
//			System.out.println("3이 크다");
//
//		if (3 > 5)
//			System.out.println("3이 크다");
//
//		// 실행코드가 2줄 이상일때 ex)
//		if (3 > 1) { // if s
//			System.out.println("true 입니다");
//			System.out.println("3이 크다!");
//		}
//		if (3 > 5) {
//			System.out.println("3이 크다!");
//		} else {
//			System.out.println("3이 작다");
//			
//		//ex4)
//			if(3>5) {
//				System.out.println("3이큼");
//			}
//			else if(3>4) {
//				System.out.println("3큼2");
//			}
//			else if (3>2) {
//				System.out.println("3큼3");
//			}
//			else {
//				System.out.println("True가없음");
//			}

		
	}
}

package Day06;

public class Test03 {
	public static void main(String[] args) {
		//day01 : 출력
		//day02 : 입력
		//day03 : 변수 / 자료형
		//day04 : 연산자 / 제어문
		//day05 : 반복문
		
		
		// 배열(list) : 특정 기준[인덱스]으로 순서대로 저장된 변수
			//여러개 변수를 동시에 관리하기 위해서 사용
			// 변수 => 메모리 할당
			// 배열 => 여러개 변수 => 여러개 메모리할당
			// 인덱스 : 변수가 배열에 저장되는 순서
				// **** 0번부터 시작
		
		int a ; // 4바이트 변수
		int b ; // 4바이트 변수
		int c ; // 4바이트 변수
		int[] a1 =new int[3]; // 4바이트 변수 3개 = 12바이트 배열
		
		System.out.println( a1[0] ); // 배열 호출
		System.out.println(a1[1]);
		System.out.println(a1[2]);
		//System.out.println(a1[3]); // 해당 인덱스 없다
		
		// 값대입
		a1[0] = 10;
		a1[1] = 20;
		a1[2] = 30;
		System.out.println(a1); // 배열의 주소값
		System.out.println(a1.length); // 배열의 길이
		System.out.println(a1.toString()); // 배열의 주소값
		System.out.println( a1[0]); // 배열의 값
		
		// 1차원 배열 : int[] 배열명 = new int[]; 
		//2차원 배열 : int[][] 배열명 = new int[행][열];
		
		int[][] a2 = new int[2][2]; //2행 2열
		a2[0][0] = 80;
		a2[0][1] = 90;
		a2[1][0] = 100;
		a2[1][1] = 110;
		System.out.println(a2.length); // 행 길이
		System.out.println(a2[0].length); // 열 길이
		System.out.println(a2[0][0]);
		System.out.println(a2[0][1]);
		System.out.println(a2[1][0]);
		System.out.println(a2[1][1]);
		
	}
}

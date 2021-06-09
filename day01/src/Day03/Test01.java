package Day03;

public class Test01 {
	public static void main(String[] args) {

		// 산수 연산자
		int a = 12;
		int b = 24;
		int c = 34;

		System.out.println("더하기 : " + (a + b));
		System.out.println("빼기 : " + (a - b));
		System.out.println("곱하기 : " + (a * b));
		System.out.println("나누기 : " + (b / a));
		System.out.println("나머지 : " + (a % b));

		// 대입 연선자
		a += 5;
		System.out.println("대입연산자 후 : " + a);

		// 비교 연산자
		System.out.println("초과 : " + (a > b)); // F
		System.out.println("미만 : " + (a < b)); // T
		System.out.println("이상 : " + (a >= b)); // F
		System.out.println("이하 : " + (a <= b)); // T
		System.out.println("같다 : " + (a == b)); // F
		System.out.println("틀리다 : " + (a != b)); // T

		// 논리 연산자 => 비교연산자 2개 이상
		System.out.println("And : " + (a > b && b > c)); // F // F T == F
		System.out.println("or : " + (a > b || c > b)); // T // F T == T

		// 증감 연산자
		System.out.println("후위 증가 : " + a++); // print 출력후에 증가
		System.out.println("확인: " + a);
		System.out.println("선위 증가 : " + ++a); // print 출력전에 증가
		
		System.out.println("후위 감소 : " + a--); // print 출력후에 감소
		System.out.println("확인: " + a);
		System.out.println("선위 감소 : " + --a);
		

	}
}

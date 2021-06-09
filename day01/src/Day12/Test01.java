package Day12;

import Day11.Test03;
import Day12_2.Test01_3;

public class Test01 {
	//1. 상속 : 
			// 1. 슈퍼클래스의 멤버를 상속받아 그대로 사용가능 혹은 재정의 가능
			// 2. extends 뒤에는 하나의 클래스만 가능 **
			// super.멤버 : 슈퍼클래스 에 멤버 접근
			// 오버라이드 : 슈퍼클래스 멤버 재정의
	
	// 2. 인터페이스 : implements
		// 1. 동일한 목적하에 동일한 메소드[기능]을 처리 역할
		// 2. implements 뒤에는 여러개의 인터페이스 가능
		// 3. 특징 : 추상메소드를 선언만 => 실제 정의는 연결된 클래스에서 정의
	
	// **접근 제한자 : 필드, 생성자, 메소드 가 외부로부터 호출 제한
	// 1. 선언시 맨 앞에서 작성
	/* 2. 종류
	 			가정 : 프로젝트 내 접근
	 		public : 모든 곳에서 접근가능
	  		protected : 동일한 패키지 내에서 접근 가능 [상속받은 클래스는 접근 가능 ]
	  		default :동일한 패키지 내에서 접근 가능 
	  		private : 현재 클래스에서만 접근 가능
	*/
	public static void main(String[] args) {
		Test01_2 Test01_2 = new Test01_2();
		//예제 1)
		Test01_2.id = "qwe"; // public 필드는 다른 클래스에서 접근 가능
//		Test01_2.성명 = "홍길동"; // private 필드는 다른 클래스에서 접근 불가
		Test01_2.연락처 = "123"; // default 필드는 동일한 패키지에서 접근 가능
		Test01_2.성별 = "남자"; // protected 필드는 동일한 패키지에서 접근 가능
		
		Test01_2.필드접근("유재석"); // public 메소드를 통한 private 필드 접근00
		

		// 예제 2)
		Test01_3 test01_3 =  new Test01_3();
		
		test01_3.id = "qwe"; // public 필드는 다른 패키지에서 접근 가능
		//test01_3.성명 = "유재석"; // private 필드는 다른 패키지에서 접근불가
		//test01_3.연락처 = "123"; // default 필드는 다른 패키지에서 접근 불가
		test01_3.성별 = "남자";  // protected 필드는 다른 패키지에서 접근 불가
		
		test01_3.필드접근("강호동"); // public 메소드를 통한 private 필드 접근
	}

		
}
 
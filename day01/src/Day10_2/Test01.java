package Day10_2;

import java.util.ArrayList;

public class Test01 {
	public static void main(String[] args) {
		
		회원 회원1 = new 회원("qwe","qwe");
		vip 회원2 = new vip("asd","asd","골드");
		관리자 회원3 = new 관리자("zxc","zxc","대리");
		
		회원1.정보();
		System.out.println();
		회원2.정보();
		System.out.println();
		회원3.정보();
		
		// 상속 받았을때 리스트 
		//	* 리스트를 사용시 슈퍼 클래스 선언된 리스트는 하위 클래스를 리스트에 담을수 있다
		// * 하위클래스 선언된 리스트는 슈퍼클래스를 리스트에 담을수 없다.
		ArrayList<회원> 회원목록 = new ArrayList<>();
		ArrayList<vip> vip목록 = new ArrayList<>();
		ArrayList<관리자> 관리자목록 = new ArrayList<>();
		
		회원목록.add(회원1); // 슈퍼클래스로 생성된 리스트는 하위클래스의 객체를 담을수 있다
		회원목록.add(회원2);
		회원목록.add(회원3);
		
		
			회원목록.get(0).정보(); // get(0) : 리스트내 첫번째 객체
			System.out.println();
			회원목록.get(1).정보();// 1 : 리스트내 두번째 객체
			System.out.println();
			회원목록.get(2).정보(); // 2 : 리스트내 세번째 객체
//			회원목록.get(2).회원등급();
			
			
		System.out.println();
//		vip목록.add(회원1); // 하위 클래스로 생성된 리스트는 슈퍼클래스의객체를 담을수 없다.
		vip목록.add(회원2);
			 vip목록.get(0).정보();
			 vip목록.get(0).회원등급 = "실버"; // 슈퍼클래스는 하위클래스 맴버 사용X
			 
			 
//		vip목록.add(회원3); // 하위클래스로 생성된 다른 하위클래스도 담을수 없다.
			 System.out.println();
//		관리자목록.add(회원1); // 하위 클래스로 생성된 리스트는 슈퍼클래스의객체를 담을수 없다.
//		관리자목록.add(회원2);
		관리자목록.add(회원3);
			관리자목록.get(0).정보();
		
	}
}

package Day08;

public class 회원 {

	
	//필드
	
	String id;
	String pw;
	String name;
	int age;
	
	
	//생성자 : 객체의 초기값 : 객체가 생성될때 기본값.
	//생성자1.
	public 회원() {}
	
	//생성자2.
	public 회원(String id) {
		this.id = id;
		//해당클래스의 필드와 인수의 필드명이 다를경우 this 생략
		
		
	}
	//생성자3.
	public 회원 (String id, String pw, String name, int age) {
		this.id = id;
		//현재 클래스의 변수 = 생성자로 들어온 인수의 변수
		this.pw = pw;
		this.name = name;
		this.age = age;
		// this.vlfemaud : 현재 클래스 내에서 선언된 필드
	}
	
	//메소드
	
	public void 회원정보() {
		System.out.println(this.id);
		System.out.println(this.pw);
		System.out.println(this.name);
		System.out.println(this.age);
		
	}
}

package Day09;

import java.util.Random;

public class 캐릭터 {

	// 필드 [변수 설계]
	String 닉네임; // 글자당 2바이트
	int 레벨; // 4바이트
	int hp; // 4바이트
	int power; // 4바이트

	// 생성자: 클래스명과 동일하게 생성
	// 빈생성자 : 필드를 받지않음
	public 캐릭터() {

	}

	// 모든필드생성자 : 모든 필드를 받음
	public 캐릭터(String 닉네임, int 레벨, int hp, int power) {
		// 인수1, 인수2, 인수3, 인수4 : {} 외부로부터 들어오는 데이터
		this.닉네임 = 닉네임;
		// this.현재클래스이 변수 = 인수
		this.레벨 = 레벨;
		this.hp = hp;
		this.power = power;
	}

	// 메소드 : 인수X 반환X
	public void 레벨증가() {

		System.out.println(닉네임 + " 레벨증가 했습니다");
	}

	// 메소드 : 인수O 반환X
	public void 공격(int power) {

		Random random = new Random();

		int rpower = random.nextInt(10) + 1;

		System.out.println(rpower + " 만큼 공격했습니다 ");

	}

	// 메소드 : 인수 O 반환 O
	public int 피해(int power) {

		Random random = new Random();

		int rpower = random.nextInt(power) + 1;

		System.out.println(rpower + " 만큼 피해를 입었습니다.");

		return rpower;
	}

	// 메소드 : 인수 X 반환 O
	public int hp확인() {
		return this.hp;
	}
}

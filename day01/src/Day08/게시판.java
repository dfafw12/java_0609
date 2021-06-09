package Day08;

import java.util.Scanner;

public class 게시판 {
	Scanner sc = new Scanner(System.in);
	// 필드
	// int 번호; => 리스트 등록 순서 => 리스트 인덱스
	String 제목;
	String 내용;
	String 작성자;
	int 조회수;

	// 생성자 : 생성자의 이름은 클래스명과 동일하게 생성
	// 빈 생성자
	public 게시판() {

	}

	// 모든 필드를 받는 생성자
	public 게시판(String 제목, String 내용, String 작성자, int 조회수) {

		// 인수로 들어온 번호를 현재클래스의 번호에 넣어주기
		this.제목 = 제목;
		this.내용 = 내용;
		this.작성자 = 작성자;
		this.조회수 = 조회수;
	}

	// 메소드
	// 1. 게시물 등록

	public void 게시물등록() {
		System.out.println("게시물 등록");
		System.out.println("제목 :");
		String 제목 = sc.next();
		System.out.println("내용 : ");
		String 내용 = sc.next();
		System.out.println("작성자 : ");
		String 작성자 = sc.next();
		// 객체 생성
		// 게시물 번호 : 리스트의 저장된 객체수의 +1
		게시판 temp = new 게시판(제목, 내용, 작성자, 0);
		Test02.게시물목록.add(temp);
	}

	// 게시물 출력
	public void 게시물출력() {
		System.out.println(this.제목 + "\t" + this.작성자 + "\t" + this.조회수);
	}

	// 2. 게시물 삭제

	public void 게시물삭제(int 번호) { // int 보낸 변수를 int 로 받기
		System.out.println("삭제 진행중");
		Test02.게시물목록.remove(번호);
		System.out.println("삭제 완료!");

	}

	// 3. 게시물 조회수 증가

	public void 게시물조회수() {
		this.조회수++;

	}

	// 4. 해당 게시물 보기

	public void 게시물보기(int 번호) {
		// 인수 받기
		게시판 temp = Test02.게시물목록.get(번호);
		System.out.println("게시물 상세페이지");

		temp.게시물조회수(); // 조회수 증가

		System.out.println("제목 : " + temp.제목 + "조회수 : " + temp.조회수);
		System.out.println("내용 : " + temp.내용);
		System.out.println();
	}

}

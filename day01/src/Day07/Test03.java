package Day07;

public class Test03 {
	public static void main(String[] args) {
		// 예1 : 변수 회원가입 만들기
		String 아이디 = "qwe";
		String 비밀번호 = "qwe";
		String 성명 = "qwe";
		String 이메일 = "qwe";
		String 휴대전화 = "qwe";

		// 예1-2 : 2차원 배열 회원가입 만들기
		String[][] 회원목록 = new String[100][5];
		회원목록[0][0] = "qwe";
		회원목록[0][1] = "qwe";
		회원목록[0][2] = "qwe";
		회원목록[0][3] = "qwe";
		회원목록[0][4] = "qwe";
		// 예1-3 : 클래스 회원가입 만들기
		회원 회원1 = new 회원(); // 객체 생성
		회원1.아이디 = "qwe";
		회원1.비밀번호 = "qwe";
		회원1.성명 = "qwe";
		회원1.이메일 = "qwe";
		회원1.휴대전화 = "qwe";
		
		//예2 : 게시판 클래스
			// 1. 변수
				//1. 게시물번호, 2. 게시물 제목, 3. 게시물 내용, 4. 작성자, 5. 별점
		//객체 => 게시판[5개변수]클래스 = > 서로다른 객체 생성
	
	}
}

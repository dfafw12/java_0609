package Day09;

import java.util.ArrayList;
import java.util.Scanner;

public class 도서관리 {
	//1. 클래스 설계 => 2. 객체 생성 => 3. 객체관리 [DB, 파일, 컬렉션, 배열 등] => CRUD
		// 1. 회원 설계
			// 1. 아이디[식별용 = 중복 X], 비밀번호, 성명, 주소
			// 생성자 : 선택 => 필수X
			// 메소드 : 회원가입, 로그인, 아이디찾기, 비밀번호찾기, 내도서목록 등
		
		// 2. 도서 설계
			//필드 : ISBN	[식별용=중복X],도서명, 저자, 대여여부
			// 생성자 : 필수X => 선택
			// 메소드 : 등록, 목록, 삭제 , 수정, 대여, 반납 등
	
	//로그인 성공시 메뉴
		//1. 일반메뉴 => 1.도서목록 2. 도서수정 3. 대여 4. 반납 5. 내도서보기 6. 회원수정 7.종료
		// 2. 관리자 메뉴 => 아이디가 admin 이면 메소드 별도 사용
		// 1.도서등록 2. 도서수정 3.도서삭제 4. 회원목록
	
	
	
	//static : 메모리에 고정적으로 할당되어 **프로그램이 종료될 때 해제되는 변수**
	//객체 관리 컬렉션 => list 컬렉션
	public static ArrayList<회원> 회원목록 = new ArrayList();
	public static Scanner sc =new Scanner(System.in);
	public static ArrayList<도서> 도서목록 = new ArrayList();
	
	//static : 메모리 고정할당 : main 메소드 별개로 우선할당 => 전체 프로그램 종료시 초기화
		// 전체 프로그램에 영향[사용되는] 주는 변수/메소드 할당
	//메인 스레드 메소드
	public static void main(String[] args) {
		
		//프로그램 실행
				프로그램작동(); //현재 클래스내 메소드 호출 : 인수X
				
				
	}
	//메소드
	public static void  프로그램작동() {
			
			
		while(true) {
			
			System.out.println("===도서 관리 프로그램 ===");
			System.out.println("1.로그인, 2. 회원가입, 3. 아이디찾기, 4. 비밀번호 찾기, 5. 종료");
			System.out.println("선택 : ");
			int 선택 = sc.nextInt();
			if(선택 == 1 ) {
				회원 temp = new 회원();
				temp.로그인();
				
				
			}			
			else if (선택 == 2) {
				회원 temp = new 회원(); // 임시 객체
				temp.회원가입();
				
			}
			
			else if (선택 == 3) {
				회원 temp = new 회원();
				temp.아이디찾기();
			}
			else if (선택 == 4) {
				회원 temp = new 회원();
				temp.비밀번호찾기();
			}
			else if (선택 == 5) {
				System.out.println("종료");
				return;
				
			}
			else {
				System.out.println("알수없는 번호");
			}
			
			
			
			
		}
	}

} // 클래스 끝

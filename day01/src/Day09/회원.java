package Day09;

import java.util.Scanner;

public class 회원 {

	Scanner sc = new Scanner(System.in);
	// 필드
	String tid;
	String tpw;
	String tname;
	String tadrs;

	// 생성자
	public 회원() {
	}

	public 회원(String tid, String tpw, String tname, String tadrs) {
		this.tid = tid;
		this.tpw = tpw;
		this.tname = tname;
		this.tadrs = tadrs;
	}

	// 메소드
	public void 회원가입() {
		System.out.println("회원가입 진행!");

		System.out.println("아이디 : ");
		tid = sc.next();
		// 중복제거
		int cnt = 0;
		while (true) {
			for (int i = 0; i < 도서관리.회원목록.size(); ++i) {
				// 리스트내 객체 수
				if (도서관리.회원목록.get(i).tid.equals(tid)) {
					// i번째 아이디가 현재 위에 입력된 아이디와 동일하면
					System.out.println("사용중인 아이디");
					cnt = 1;
					break;
				}
			}
			if (cnt == 0) {
				System.out.println("비밀번호 : ");
				tpw = sc.next();
				System.out.println("이름 : ");
				tname = sc.next();
				System.out.println("주소 : ");
				tadrs = sc.next();
				// 객체 생성
				회원 temp = new 회원(tid, tpw, tname, tadrs);
				// 리스트에 담기
				도서관리.회원목록.add(temp); // 해당 객체 담기 = 리스트명.add(객체명)
				System.out.println("회원가입 완료!");
				return;
						

			}
		}

	}

	public void 로그인() {

		
			System.out.println("로그인 진행!");
			
			System.out.println("아이디 : ");
			String tid = sc.next();
			System.out.println("비밀번호 : ");
			String tpw = sc.next();
			for (int i = 0; i < 도서관리.회원목록.size(); ++i) {
				if (도서관리.회원목록.get(i).tid.equals(tid) &&도서관리.회원목록.get(i).tpw.equals(tpw)) {
					System.out.println("로그인 성공");
						도서 temp =new 도서();
					if(tid.equals("admin")) temp.관리자메뉴();
					else temp.일반메뉴(tid);
					return;
				}
			}
			System.out.println("동일한 회원정보가 없습니다.");
			
		}

	

	public void 아이디찾기() {
		// 성명, 주소 입력받아 반복문을 이용한 리스트에서 동일한 객체 찾기
		System.out.println("아이디 찾기 진행!");
		System.out.println("이름 : ");
		tname = sc.next();
		System.out.println("주소 : ");
		tadrs = sc.next();
		// for 활용 => 리스트 활용
		
		for (회원 temp : 도서관리.회원목록) {
			//임시 객체 : 리스트명 => 리스트내 객체 수만큼 하나씩 임시객체 대입
			if(temp.tname.equals(tname) && temp.tadrs.equals(tadrs)) {
				System.out.println(tname + "회원님의 아이디명 : "+temp.tid);
				return;
			}
			System.out.println("동일한 회원정보가 없습니다.");
		}
	}

	public void 비밀번호찾기() {
		System.out.println("비밀번호 찾기 진행!");
		System.out.println("아이디 : ");
		tid = sc.next();
		System.out.println("성명 : ");
		tname = sc.next();
		// for 활용 => 리스트 활용
		
		for (회원 temp : 도서관리.회원목록) {
			//임시 객체 : 리스트명 => 리스트내 객체 수만큼 하나씩 임시객체 대입
			if(temp.tname.equals(tname) && temp.tid.equals(tid)) {
				System.out.println(tname + "회원님의 비밀번호 : "+temp.tpw);
				return;
			}
			System.out.println("동일한 회원정보가 없습니다.");
		}

	}

	public void 내도서목록() {

	}

}

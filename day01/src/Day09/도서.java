package Day09;

import java.util.Scanner;

public class 도서 {
	Scanner sc = new Scanner(System.in);

	String ISBN;
	String 책이름;
	String 저자;
	boolean 대여여부;
	String 대여회원; // 필드 추가

	public 도서() {
	}

	public 도서(String iSBN, String 책이름, String 저자) {

		ISBN = iSBN;
		this.책이름 = 책이름;
		this.저자 = 저자;
		this.대여여부 = true;
	}

	public void 책등록() {
		System.out.println("도서등록 진행");
		while (true) {
			int cnt = 0;
			System.out.println("ISBN : ");
			ISBN = sc.next();

			if (ISBN.equals("n"))
				return;

			for (도서 temp : 도서관리.도서목록) {
				// 임시 객체 : 리스트명 => 리스트내 객체 수 만큼 반복
				if (temp.ISBN.equals(ISBN)) {
					System.out.println("동일한 ISBN이 있습니다  [n:종료]");
					cnt = 1;
					break;
				}
			}
			if (cnt == 0) {
				System.out.println("도서명 : ");
				책이름 = sc.next();
				System.out.println("저자 : ");
				저자 = sc.next();
				도서관리.도서목록.add(new 도서(ISBN, 책이름, 저자));
				return;

			}
		}

	}

	public void 책목록() {
		System.out.println("=====책 목록====");
		System.out.println("ISBN" + "\t" + "책이름" + "\t" + "저자" + "\t" + "대여여부");
		for (도서 temp : 도서관리.도서목록) {
			System.out.println(temp.ISBN + "\t" + temp.책이름 + "\t" + temp.저자 + "\t" + temp.대여여부);
		}

	}

	public void 책삭제() {

	}

	public void 책수정() {

	}

	public void 책대여(String tid) {
		System.out.println("대여 진행");
		System.out.println("대여할 도서 명 : ");
		책이름 = sc.next();
		for (도서 temp : 도서관리.도서목록) {
			if (temp.책이름.equals(책이름)) {
				if (temp.대여여부) {
					System.out.println("대여 가능");
					System.out.println("1. 대여 신청, 2.취소 ");
					int 선택 = sc.nextInt();
					if (선택 == 1) {
						System.out.println(temp.책이름 + "의 도서를 대여합니다");
						temp.대여여부 = false;
						temp.대여회원 = tid;
					}
					if (선택 == 2) {
						return;
					}

				} else {
					System.out.println("대여 불가");
				}

			}
		}

	}

	public void 책반납(String tid) {
		for (도서 temp : 도서관리.도서목록) {
			if (temp.책이름.equals(책이름)) {
				if (temp.대여여부) {
					System.out.println("반납");
					System.out.println("1. 반납 신청, 2.취소 ");
					int 선택 = sc.nextInt();
					// 대여 회원일 경우만 반납
					if (temp.대여회원.equals(tid)) {
						if (선택 == 1) {
							System.out.println(temp.책이름 + "의 도서를 반납합니다");
							temp.대여여부 = true;
							temp.대여회원 = null;
						}
						if (선택 == 2) {
							return;
						}

					} else {
						System.out.println("반납 권한 없음");
						return;
					}
				} else {
					System.out.println("반납 불가");
				}
			}
		}
	}

	public void 관리자메뉴() {
		System.out.println("관리자 메뉴");
		System.out.println("1.도서등록 2. 도서수정 3.도서삭제 4. 회원목록 5. 로그아웃");
		int a = sc.nextInt();
		도서 temp = new 도서();

		if (a == 1) {
			temp.책등록();
		}
		if (a == 2) {
			temp.책수정();
		}
		if (a == 3) {
			temp.책삭제();
		}
		if (a == 4) {

		}
		if (a == 5) {
			System.out.println("로그아웃");
			return;
		}

	}

	public void 일반메뉴(String tid) {
		System.out.println("안녕하세요");
		System.out.println("1.목록, 2.수정, 3.대여, 4.반납, 5.내 도서보기, 6. 회원수정, 7.로그아웃");
		int b = sc.nextInt();
		도서 temp = new 도서();
		if (b == 1) {
			temp.책목록();
		}
		if (b == 2) {
			temp.책수정();
		}
		if (b == 3) {
			temp.책대여(tid);
		}
		if (b == 4) {
			temp.책반납(tid);
		}
		if (b == 5) {
		}
		if (b == 6) {
		}
		if (b == 7) {
			System.out.println("로그아웃");
			return;
		}

	}

}

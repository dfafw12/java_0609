package Day15;

import java.util.ArrayList;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {

		// 컬렉션 프레임워크 : 메모리 관리 클래스 집합
		// 컬렉션 : 수집
		// 프레임워크 : 미리 만들어진 프로그램
		// 1. List 컬렉션
		
		// 1.ArrayList, 2.Vector, 3.LinkedList
		// 1. 배열과 차이점 : 배열[고정메모리] / List[가변메모리]
		// 배열 :int[] 배열명 = new int[10] = 10개 int형 메모리 우선할당
		// 2. 인뎃그 사용 : 저장되는 순서[0:시작~]
		// 3. 추가,삭제시 : 인덱스 자동 변경
		// 4. 자주 사용되는 메소드
		
				// 1] 리스트명.add("객체명")
				// 2] 리스트명.get(인덱스번호)
				// 3] 리스트명.remove(인덱스번호)
				// 4] 리스트명.size()
				// 5] 리스트명.clear()
		
		// 5. ArrayList vs Vector : 동기화: 단일스레드 X /동기화 O 
		// 6.  ArrayList vLinkedList : 검색 용이 /삽입,삭제 용이
	
		//컬렉션 프레임 워크 
		
		//1. list컬렉션 : 순서[인덱스] 있는 저장
			//1] ArrayList : 동기화 X : 검색용이
			//2] Vector : 동기화 O 
			//3] LinkedList  : 삽입/삭제 용이
	
		// 2. set 컬렉션 : 순서가 없는 저장 // 중복허용 X
			// 1. HashSet 클래스
				// Iterator 인터페이스 이용한 요소 접근 // get없음
			
		// 3. Map 컬렉션 : 키,값 => 한쌍	

		// Map 컬렉션
		// 1. HashMap : 동기화X // 단일 스레드
			// 1.map.put(키,값) => 키 값 중복불가
			// 2.mpa.get (키) => 키 대응하는 값 호출
		// 2. Hashtable : 동기화 O // 멀티스레드
		
		

		// 정리
			//List : 순서[인덱스] 기준으로 저장
				//1.ArrayList : 동기화 X
				//2 .Vector : 동기화 O
				//3. LinkedList
		
			//Set : 순서없는 저장 => iterator 인터페이스
				//1. HashSet
		
			// Map : 키,값 => 한쌍 저장 [ JSON 유사]
				//1. HashMap : 동기화 X
				//2. Hashtable : 동기화 O
		
		
// ===================================================================================
		
		// 예1) ArrayList 클래스
		// 1. 선언
		List<String> list = new ArrayList<>(); // 인터페이스
		ArrayList<String> list2 = new ArrayList<>(); // 클래스
		// 인터페이스/클래스명<리스트에 들어갈 클래스명> 리스트명 = (메모리할당)new ArrayList<생략가능>();

		// 2. 메소드
		// 1. 리스트에 객체 추가하기
		list.add("java"); // 리스트에 객체 넣기
//			list.add(123); // 리스트에 선언된 클래스만 넣을수 있음
		list.add("python");
		list.add("database");

		// 2. 리스트에 객체 호출하기
		System.out.println(list.get(0));
		list.add("c++");
		
		// 3. 리스트에 객체 삭제
		list.remove(0); // 삭제된 인덱스 뒤로 한칸씩 당겨짐
		System.out.println(list.get(0));
	
		// 4. 리스트내 의 객체수
		System.out.println(list.size());
		
		// 5. 반복문 활용1
		for(int i = 0; i<list.size(); ++i) {
			System.err.println(list.get(i));
		}
		//6. 반복문 활용 2
		for(String temp : list) {
			System.out.println(temp);
			System.out.println(temp);
		}
		
	//	7. 객체 모두 삭제
		list.clear();

		// 2. Set 컬렉션
		// 3. Map

	}
}

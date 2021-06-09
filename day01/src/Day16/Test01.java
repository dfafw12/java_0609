package Day16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Test01 {
	
	
	public static void main(String[] args) {
		//컬렉션 프레임 워크 
			//1. list컬렉션 : 순서[인덱스] 있는 저장
				//1] ArrayList : 동기화 X : 검색용이
				//2] Vector : 동기화 O 
				//3] LinkedList  : 삽입/삭제 용이
		
			// 2. set 컬렉션 : 순서가 없는 저장 // 중복허용 X
				// 1. HashSet 클래스
					// Iterator 인터페이스 이용한 요소 접근 // get없음
				
			// 3. Map 컬렉션 : 키,값 => 한쌍	
		
		
		
		List<String> list3 = new ArrayList<String>();
		List<String> list4 = new LinkedList();
		
		Long 시작;
		Long 끝;
		시작 = System.nanoTime();
		for(int i = 0; i<10000; ++i) {
			list3.add(0, String.valueOf(i));
						//StringvalueOf(숫자) => 문자
			
		}
		끝 = System.nanoTime();
		System.out.println("어레이리스트 10000개 삽입 걸린시간 : " + (끝 - 시작) + "ns");
		

		시작 = System.nanoTime(); // 현재 시간[나노] 메소드
		for(int i = 0; i<10000; ++i) {
			list4.add(0, String.valueOf(i));
						// String.valueOf(숫자) => 문자
			
		}
		끝 = System.nanoTime();
		System.out.println("링크드리스트 10000개 삽입 걸린시간 : " + (끝 - 시작) + "ns");
		
		
		// HashSet 클래스
		//1 . 선언
		Set<String> set = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();
		
		//2. 메소드
		set.add("java");
		set.add("java"); // 중복 제거
		set.add("c");
		set.add("database");
		System.out.println("set의 객체수 : " + set.size());
		
		//삭제
		set.remove("c"); // 객체 삭제
		System.out.println("set의 객체수 : " + set.size());
		
		//
		for (String temp : set) {
			System.out.println(temp);
		}
		// get ???? ==> Iterator  인터페이스
		Iterator<String> iterator = set.iterator();
		 // Iterator : 순서 없는 컬렉션에 모든 객체 순회 인터페이스
				// null 부터 시작 next() 메소드로 다음으로 이동
		while(iterator.hasNext()) {
				// hasNext() : 다음 요소가 이쓴ㄴ지 여부 확인 T/F
			String temp = iterator.next(); // 다음 요소 호출
			System.out.println(temp);
		}
		set.clear();
		
	}
}	

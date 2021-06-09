package Day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test03 {
	
	// List 컬렉션 => Map
	public static ArrayList<Map<Integer, user>> usermap = new ArrayList();
	public static ArrayList<Map<Integer, Board>> boardmap = new ArrayList();
	
	// Map 컬렉션 => List
	public static Map<String,ArrayList<Map<Integer, user>> > supermap = new HashMap<>(); 

	//set 컬렉션
	public static Set<Map<String, user>> set = new HashSet<>();
	
	// map 컬렉션
	public static Map<String, Set<user> > map2 = new HashMap<>();
	
	
	
	public static void main(String[] args) {

		// Map < 회원번호 , user >
		// Map < 게시물번호 , 게시판 >

		// 여러개 map 관리하기 위한 list 선언
		// List => map<key,value>
	supermap.put("user", usermap);
	Map<String, user> map = new HashMap<>();
	
	map.put("1", new user());
	map.put("2", new user());
	set.add(map);

	}
}

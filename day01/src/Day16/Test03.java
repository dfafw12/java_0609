package Day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test03 {
	
	// List �÷��� => Map
	public static ArrayList<Map<Integer, user>> usermap = new ArrayList();
	public static ArrayList<Map<Integer, Board>> boardmap = new ArrayList();
	
	// Map �÷��� => List
	public static Map<String,ArrayList<Map<Integer, user>> > supermap = new HashMap<>(); 

	//set �÷���
	public static Set<Map<String, user>> set = new HashSet<>();
	
	// map �÷���
	public static Map<String, Set<user> > map2 = new HashMap<>();
	
	
	
	public static void main(String[] args) {

		// Map < ȸ����ȣ , user >
		// Map < �Խù���ȣ , �Խ��� >

		// ������ map �����ϱ� ���� list ����
		// List => map<key,value>
	supermap.put("user", usermap);
	Map<String, user> map = new HashMap<>();
	
	map.put("1", new user());
	map.put("2", new user());
	set.add(map);

	}
}

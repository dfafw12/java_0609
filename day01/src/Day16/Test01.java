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
		//�÷��� ������ ��ũ 
			//1. list�÷��� : ����[�ε���] �ִ� ����
				//1] ArrayList : ����ȭ X : �˻�����
				//2] Vector : ����ȭ O 
				//3] LinkedList  : ����/���� ����
		
			// 2. set �÷��� : ������ ���� ���� // �ߺ���� X
				// 1. HashSet Ŭ����
					// Iterator �������̽� �̿��� ��� ���� // get����
				
			// 3. Map �÷��� : Ű,�� => �ѽ�	
		
		
		
		// 1. ����
		List<user> list = new Vector<>();
			// �������̽� : �߻�޼ҵ�[ �������� �ʴ� �޼ҵ� ] : Ŭ���� �޸��Ҵ� �ʿ�
				// �������̽� ȥ�ڼ� �Ҽ��ִ� ��� X
		Vector<user> list2 = new Vector<>();
			// < > ���׸� :  �ش� Ŭ������ Ŭ���� �ֱ� 
		// 2. �޼ҵ�
		user user = new user(); // ��ü ���� 
		list.add( user );
				// <Ŭ����>�� ��ü 
		list.add( new user() ); // �ߺ���� 
		
		list.remove(0);	// ù��° ��ü ���� 
		System.out.println( list.size() ); // ����Ʈ�� ��ü�� 
		
		for( user temp : list ) {
					// list�� ��ü�� �ϳ��� temp ����
			System.out.println( temp );
		}
		
		//
		List< String > list3 = new ArrayList<String>();
		List< String > list4 = new LinkedList<>();	
		
		Long ����;
		Long ��;
		
		���� = System.nanoTime(); // ���� �ð�[����] �޼ҵ� 
		for( int i = 0 ; i<10000 ; i++ ) {
			list3.add( 0 , String.valueOf(i));
							// String.valueOf(����) => ���� 
		}
		�� = System.nanoTime();
		System.out.println(" arraylist 10000�� ���� �ɸ��ð� : "  + (��-����) +"ns" );
		
		���� = System.nanoTime(); // ���� �ð�[����] �޼ҵ� 
		for( int i = 0 ; i<10000 ; i++ ) {
			list4.add( 0 , String.valueOf(i));
							// String.valueOf(����) => ���� 
		}
		�� = System.nanoTime();
		System.out.println(" LinkedList 10000�� ���� �ɸ��ð�: "  + (��-����) +"ns" );
		
		
		// HashSet Ŭ���� 
		//1.���� 
		Set<String > set = new HashSet<>();
		HashSet<String > set2 = new HashSet<>();
		
		//2. �޼ҵ� 
		set.add("java");
		set.add("java"); // �ߺ�����  
		set.add("c");
		set.add("database");
		System.out.println(" set�� ��ü�� : "+ set.size());
		set.remove("c"); // ��ü ���� 
		System.out.println(" set�� ��ü�� : "+ set.size());
		
		for( String temp : set ) {
			System.out.println( temp );
		}
		
		// get ???? -----> Iterator �������̽� 
		Iterator<String> iterator = set.iterator();
			// Iterator : ���� ���� �÷��ǿ� ��� ��ü ��ȸ �������̽� 
				// null ���� ���� next() �޼ҵ�� �������� �̵� 
		while( iterator.hasNext() ) {
					// hasNext() : ���� ��Ұ� �ִ��� ���� Ȯ�� T / F
			String temp = iterator.next(); // ���� ��� ȣ�� 
			System.out.println( temp );
		}
		set.clear();
}	
}

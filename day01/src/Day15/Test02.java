package Day15;

import java.util.ArrayList;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {

		// �÷��� �����ӿ�ũ : �޸� ���� Ŭ���� ����
		// �÷��� : ����
		// �����ӿ�ũ : �̸� ������� ���α׷�
		// 1. List �÷���
		
		// 1.ArrayList, 2.Vector, 3.LinkedList
		// 1. �迭�� ������ : �迭[�����޸�] / List[�����޸�]
		// �迭 :int[] �迭�� = new int[10] = 10�� int�� �޸� �켱�Ҵ�
		// 2. �ε��� ��� : ����Ǵ� ����[0:����~]
		// 3. �߰�,������ : �ε��� �ڵ� ����
		// 4. ���� ���Ǵ� �޼ҵ�
		
				// 1] ����Ʈ��.add("��ü��")
				// 2] ����Ʈ��.get(�ε�����ȣ)
				// 3] ����Ʈ��.remove(�ε�����ȣ)
				// 4] ����Ʈ��.size()
				// 5] ����Ʈ��.clear()
		
		// 5. ArrayList vs Vector : ����ȭ: ���Ͻ����� X /����ȭ O 
		// 6.  ArrayList vLinkedList : �˻� ���� /����,���� ����
	
		//�÷��� ������ ��ũ 
		
		//1. list�÷��� : ����[�ε���] �ִ� ����
			//1] ArrayList : ����ȭ X : �˻�����
			//2] Vector : ����ȭ O 
			//3] LinkedList  : ����/���� ����
	
		// 2. set �÷��� : ������ ���� ���� // �ߺ���� X
			// 1. HashSet Ŭ����
				// Iterator �������̽� �̿��� ��� ���� // get����
			
		// 3. Map �÷��� : Ű,�� => �ѽ�	

		// Map �÷���
		// 1. HashMap : ����ȭX // ���� ������
			// 1.map.put(Ű,��) => Ű �� �ߺ��Ұ�
			// 2.mpa.get (Ű) => Ű �����ϴ� �� ȣ��
		// 2. Hashtable : ����ȭ O // ��Ƽ������
		
		

		// ����
			//List : ����[�ε���] �������� ����
				//1.ArrayList : ����ȭ X
				//2 .Vector : ����ȭ O
				//3. LinkedList
		
			//Set : �������� ���� => iterator �������̽�
				//1. HashSet
		
			// Map : Ű,�� => �ѽ� ���� [ JSON ����]
				//1. HashMap : ����ȭ X
				//2. Hashtable : ����ȭ O
		
		
// ===================================================================================
		
		// ��1) ArrayList Ŭ����
		// 1. ����
		List<String> list = new ArrayList<>(); // �������̽�
		ArrayList<String> list2 = new ArrayList<>(); // Ŭ����
		// �������̽�/Ŭ������<����Ʈ�� �� Ŭ������> ����Ʈ�� = (�޸��Ҵ�)new ArrayList<��������>();

		// 2. �޼ҵ�
		// 1. ����Ʈ�� ��ü �߰��ϱ�
		list.add("java"); // ����Ʈ�� ��ü �ֱ�
//			list.add(123); // ����Ʈ�� ����� Ŭ������ ������ ����
		list.add("python");
		list.add("database");

		// 2. ����Ʈ�� ��ü ȣ���ϱ�
		System.out.println(list.get(0));
		list.add("c++");
		
		// 3. ����Ʈ�� ��ü ����
		list.remove(0); // ������ �ε��� �ڷ� ��ĭ�� �����
		System.out.println(list.get(0));
	
		// 4. ����Ʈ�� �� ��ü��
		System.out.println(list.size());
		
		// 5. �ݺ��� Ȱ��1
		for(int i = 0; i<list.size(); ++i) {
			System.err.println(list.get(i));
		}
		//6. �ݺ��� Ȱ�� 2
		for(String temp : list) {
			System.out.println(temp);
			System.out.println(temp);
		}
		
	//	7. ��ü ��� ����
		list.clear();

		// 2. Set �÷���
		// 3. Map

	}
}

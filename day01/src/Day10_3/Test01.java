package Day10_3;

import java.util.ArrayList;

public class Test01 {
	public static void main(String[] args) {
		ArrayList<����> ���¸�� = new ArrayList<>(); 
		
		
		// 1.�Ϲݰ���
		���� ����1 = new ����(111,1000);
		// 2. ���� ����
		�������� ����2 = new ��������(222,2000);
		// 3. ���� ����
		�������� ����3 = new ��������(333,3000);
		
		//4. �ϳ��� ����Ʈ ��δ�� :����Ŭ������ ����Ʈ ����
		
		���¸��.add(����1);
		���¸��.add(����2);
		���¸��.add(����3);
		
		
		//5. �Ա� ���
		���¸��.get(0).�Ա�(5000);
		���¸��.get(1).�Ա�(5000);
		���¸��.get(2).�Ա�(5000);
		
		���¸��.get(0).���(3000);
		���¸��.get(1).���(3000);
		���¸��.get(2).���(3000);
		//6. �ݾ� Ȯ��
		System.out.println(���¸��.get(0).�ݾ�);
		System.out.println(���¸��.get(1).�ݾ�);
		System.out.println(���¸��.get(2).�ݾ�);
		
	}
}

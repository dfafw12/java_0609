package Day06;

public class Test03 {
	public static void main(String[] args) {
		//day01 : ���
		//day02 : �Է�
		//day03 : ���� / �ڷ���
		//day04 : ������ / ���
		//day05 : �ݺ���
		
		
		// �迭(list) : Ư�� ����[�ε���]���� ������� ����� ����
			//������ ������ ���ÿ� �����ϱ� ���ؼ� ���
			// ���� => �޸� �Ҵ�
			// �迭 => ������ ���� => ������ �޸��Ҵ�
			// �ε��� : ������ �迭�� ����Ǵ� ����
				// **** 0������ ����
		
		int a ; // 4����Ʈ ����
		int b ; // 4����Ʈ ����
		int c ; // 4����Ʈ ����
		int[] a1 =new int[3]; // 4����Ʈ ���� 3�� = 12����Ʈ �迭
		
		System.out.println( a1[0] ); // �迭 ȣ��
		System.out.println(a1[1]);
		System.out.println(a1[2]);
		//System.out.println(a1[3]); // �ش� �ε��� ����
		
		// ������
		a1[0] = 10;
		a1[1] = 20;
		a1[2] = 30;
		System.out.println(a1); // �迭�� �ּҰ�
		System.out.println(a1.length); // �迭�� ����
		System.out.println(a1.toString()); // �迭�� �ּҰ�
		System.out.println( a1[0]); // �迭�� ��
		
		// 1���� �迭 : int[] �迭�� = new int[]; 
		//2���� �迭 : int[][] �迭�� = new int[��][��];
		
		int[][] a2 = new int[2][2]; //2�� 2��
		a2[0][0] = 80;
		a2[0][1] = 90;
		a2[1][0] = 100;
		a2[1][1] = 110;
		System.out.println(a2.length); // �� ����
		System.out.println(a2[0].length); // �� ����
		System.out.println(a2[0][0]);
		System.out.println(a2[0][1]);
		System.out.println(a2[1][0]);
		System.out.println(a2[1][1]);
		
	}
}

package Day06;

public class Test02 {
	public static void main(String[] args) {
		// while : ���ѹݺ�
		int i =0;
		int sum = 0;
		while ( i < 10 ) {//�ش� ���� T�̸� ���� F�� ���� X
			i++; // ������ 
			sum+=i;
		} // i �� 10 �̸� �ݺ��� Ż��.

		int j =0;
		
		while (true) {
			j++;
			System.out.println("���ѹݺ�");
			if (j==10)  break;
		}
	}
}

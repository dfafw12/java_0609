package Day03;

public class Test01 {
	public static void main(String[] args) {

		// ��� ������
		int a = 12;
		int b = 24;
		int c = 34;

		System.out.println("���ϱ� : " + (a + b));
		System.out.println("���� : " + (a - b));
		System.out.println("���ϱ� : " + (a * b));
		System.out.println("������ : " + (b / a));
		System.out.println("������ : " + (a % b));

		// ���� ������
		a += 5;
		System.out.println("���Կ����� �� : " + a);

		// �� ������
		System.out.println("�ʰ� : " + (a > b)); // F
		System.out.println("�̸� : " + (a < b)); // T
		System.out.println("�̻� : " + (a >= b)); // F
		System.out.println("���� : " + (a <= b)); // T
		System.out.println("���� : " + (a == b)); // F
		System.out.println("Ʋ���� : " + (a != b)); // T

		// �� ������ => �񱳿����� 2�� �̻�
		System.out.println("And : " + (a > b && b > c)); // F // F T == F
		System.out.println("or : " + (a > b || c > b)); // T // F T == T

		// ���� ������
		System.out.println("���� ���� : " + a++); // print ����Ŀ� ����
		System.out.println("Ȯ��: " + a);
		System.out.println("���� ���� : " + ++a); // print ������� ����
		
		System.out.println("���� ���� : " + a--); // print ����Ŀ� ����
		System.out.println("Ȯ��: " + a);
		System.out.println("���� ���� : " + --a);
		

	}
}

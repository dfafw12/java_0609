package Day03;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. �ϳ��� ������ �Է¹޾� 7�� ������� Ȯ��

//		System.out.println("������ �Է��ϼ��� : ");
//		int a = sc.nextInt();
//		System.out.println("7�� ��� ? " + (a % 7 == 0));

		// 2. �ϳ��� ������ �Է¹޾� Ȧ������ Ȯ��

//		System.out.println("���� �Է� : ");
//		int b = sc.nextInt();
//		System.out.println("Ȧ�� ? : " + (b % 2 == 1));

		// 3. �ϳ��� ������ �Է¹޾� 7�� ����̸鼭 ¦�� ���� Ȯ��

//		System.out.println("���� �Է� : ");
//		int c = sc.nextInt();
//		System.out.println("7�ǹ�� and ¦�� ? : " + (c % 7 == 0 && c % 2 == 0));

		// 4. �ΰ��� ������ �Է¹޾� �� ū�� Ȯ��

//		System.out.println("1���� �Է� : ");
//		int d = sc.nextInt();
//		System.out.println("2���� �Է� : ");
//		int e = sc.nextInt();
//		System.out.println("1���� �� �� ū��? : " + (d > e));
//		System.out.println("2���� �� �� ū�� ? : " + (e > d));

		// 5. �������� �Է¹޾� �� ���� ����ϱ�

//		System.out.println("������ �Է� : ");
//		int f = sc.nextInt();
//		int g = (int) (3.14 * (f * f));
//		System.out.println("���� ���� : " + g);

		// 6. �νǼ��� �Է¹޾� �� �Ǽ��� ���� ���� ���� ��% ���� ����ϱ�
		// ex) 54.5 84.3 �̸� 64.285714%

//		System.out.println("1���� �Է� : ");
//		double h = sc.nextDouble();
//		System.out.println("2���� �Է� : ");
//		double i = sc.nextDouble();
//		System.out.println(h/i);

		// 7. ��ٸ��� ���� ���ϱ� [������ �غ� ���̸� �Է¹޾� ����ϱ�
		// ��ٸ��� ���� => (����* �غ�) *���� /2

//		System.out.println("���� : ");
//		int j = sc.nextInt();
//		System.out.println("�غ� : ");
//		int k = sc.nextInt();
//		System.out.println("���� : ");
//		int l = sc.nextInt();
//		System.out.println("��ٸ��� ���� : " + (j * k) * l / 2);

		// 8. Ű�� ������ �Է¹޾� ǥ��ü�� ����ϱ�
		// ǥ��ü�� ���� => (Ű-100) *0.9
//		System.out.println("Ű : ");
//		int m = sc.nextInt();
//		System.out.println("ǥ�� ü�� : " + ((m - 100) * 0.9)+"kg");

		// 9. Ű�͸����Ը� �Է¹޾� BMI ���
		// BMI ���� => ������/((Ű/100) * (Ű/100))

//		System.out.println("Ű : ");
//		int Ű = sc.nextInt();
//		
//		System.out.println("������ : ");
//		int ������ = sc.nextInt();
//		
//		double bmi = ������/((Ű/100) * (Ű/100)) ;
//		System.out.println("BMI : " + bmi);

		// 10. inch �� �Է¹޾� cm�� ��ȯ�ϱ�

//		System.out.println("inch �Է� : ");
//		int inch = sc.nextInt();
//		double cm = inch*2.54;
//		System.out.println("cm : "+cm);

		// 11. �߰����, �⸻���, �����򰡸� �Է¹޾� �ݿ������� ����Ͽ� ���� ��° �ڸ� ���� ���� ����ϱ�
		// �߰���� �ݿ����� => 30%
		// �⸻��� �ݿ����� => 30%
		// ������ �ݿ����� => 40%

		System.out.println("�߰���� : ");
		int mt = sc.nextInt();
		System.out.println("�⸻��� : ");
		int fe = sc.nextInt();
		System.out.println("������ : ");
		int pa = sc.nextInt();
		System.out.printf("�߰���� �ݿ����� : %.2f " , (mt * 0.3));
		System.out.println();
		System.out.printf("�⸻��� �ݿ����� : %.2f " , (fe * 0.3));
		System.out.println();
		System.out.printf("������ �ݿ����� : %.2f " , (pa * 0.4));
		
		// 12. ���� ���� ���� �ϰ� x�� y�� �����ϱ�
		//int x = 10;
		// int y = x-- + 5 + --x;
		//printf(" x�ǰ� : %d , y�ǰ� : %d ", x,y)
	}
}

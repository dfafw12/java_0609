package Day07;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		// �л� ���� ���� ���α׷�
		// 1.1�����迭 ���
		// 2 . �޴� <= while ���
		// 1. �л��� //�迭 ũ�Ⱑ ����
		// 2. ���� �Է� // �л� ����ŭ ���� �Է�
		// 3. ��� // 1���л�, ���, �������� ���� ���
		// 4. ����
		Integer [] st = null;
		
		

		while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.println("�л� ���� ���� ���α׷�");
			System.out.println("1.�л���, 2. ����, 3.���, 4.����");
			int a = sc.nextInt();

			if (a == 1) {
				System.out.println("�л��� �Է� : ");
				int b = sc.nextInt();
				st = new Integer[b];
			}
			if (a == 2) {
				for (int i = 0; i < st.length; ++i) {
					System.out.println("���� �Է� : ");
					st[i] = sc.nextInt();
				}
				System.out.println("����л��� ������ �Է� �޾ҽ��ϴ�.");

			}
			if (a == 3) {
				// Arrays : �迭Ŭ����
				// .sort(�迭��) : ����(��������) �޼ҵ�
				Arrays.sort(st);
				Arrays.sort(st, Collections.reverseOrder());
				for (int i = 0; i < st.length; ++i) {
					System.out.println((i + 1) + "�� ���� : " + st[i]);
				}
				int max = 0;
				int sum = 0;
					for(int i=0; i <st.length; ++i) {
						sum += st[i];
						if (max < st[i]) {
							max =st[i] ;
						}
					}
					System.out.println("���� ���� ���� : " + max);
					System.out.println("��� ���� : "+ (sum/st.length));
				
			}
			if (a == 4)
				break;
		}

	}
}

package Day14;

import java.util.Calendar;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		
		while (true) {
			System.out.println("���� ���� : ");
			int �˻����� = sc.nextInt();

			System.out.println("���� �� : ");
			int �˻��� = sc.nextInt();

			System.out.println("�� ���� : ");
			int ������ = sc.nextInt();

			System.out.println("�� �� : ");
			int ���� = sc.nextInt();

			int ���۴� = 1;
			int �������� = 12;
			if(�˻�����>������)System.out.println("�˻��Ұ�");
			else if(�˻����� ==������) {
				if(�˻���>����)System.out.println("�˻��Ұ�");
			}
			for (int y = �˻�����; y <= ������; ++y) {
				// �˻����� ���� ������ ���� ������ 1�� ����
				
				
					// ���࿡ ���翬���� �������� �����Ѱ��
					if (������ == y)
						�������� = ����;

					if (�˻����� == y)
						���۴� = �˻���;
					else
						���۴� = 1;
					for (int m = ���۴�; m <= ��������; ++m) {
						�޷�.�޷°˻�(y, m);
						System.out.println();
						System.out.println();
					}

				}
			break;
			}
			
		}
	}


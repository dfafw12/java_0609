package Day07;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		// ȸ���� ���α׷� [ ȸ������, �α���]
		// 1. 2���� �迭
		// 2. �޴� [���ѷ���]
		// 1. ȸ������
		// 1. ���̵�� ��й�ȣ�� �Է¹޾� �迭�� ����
		// 2. �α���
		// 1. ���̵�� ��й�ȣ �Է¹޾� �迭�� �����ϸ� �α��� ����
		// 3. ����
		// �ݺ��� ����
		Scanner sc = new Scanner(System.in);
		String[][] user = new String[100][2];
		String tid = null;
		String tpw = null;
		int cnt = 0;
		while (true) { // �α��� ������ Ż���ϴ� �ݺ���
			System.out.println("1.ȸ������, 2. �α���, 3. ����");
			int a = sc.nextInt();

			if (a == 1) {

				System.out.println("ȸ������ ����");
				System.out.println("���̵� �Է� : ");
				tid = sc.next();
				System.out.println("��й�ȣ �Է� : ");
				tpw = sc.next();
				// �Է¹��� ���� ���� => �迭�� ����� ����
				
				if (cnt == 0) {
					for (int i = 0; i < user.length; ++i) {
						if (user[i][0] == null) {
							user[i][0] = tid;
							user[i][1] = tpw;
							System.out.println("ȸ������ �Ϸ�!");
							break; // for�� ����
						} else if (user[i][0].equals(tid)) {
							cnt = 1;
							System.out.println("�̹� �����ϴ� ���̵� �Դϴ�.");
							break;
						}

					}

				}
			}
			if (a == 2) {
				System.out.println("�α��� ����");
				System.out.println("���̵� : ");
				String id = sc.next();
				System.out.println("��й�ȣ : ");
				String pw = sc.next();
				for (int i = 0; i < user.length; ++i) {
					if (user[i][0] != null) {

						if (user[i][i] != null && cnt == 0) {
							if (user[i][0].equals(id) && user[i][1].equals(pw)) {
								System.out.println("�α��� ����!");
								// ��� ȸ�� ���̵� /��й�ȣ ���
								System.out.println("���̵�\t\t��й�ȣ");
								for (int j = 0; j < user.length; ++j) {
									if (user[j][0] != null) {
										System.out.println(user[j][0] + "\t\t" + user[j][1]);

									}
								}
								System.out.println("1.ȸ�� Ż��, 2. ��й�ȣ ����, 3. �α׾ƿ�");
								int b = sc.nextInt();
								if (b == 1) {
									// ȸ��Ż�� >> null�� ����
									user[i][0] = null; // ���� �α��� �� �� = i
									user[i][1] = null;
										// Ż���� ȸ�� ���� ȸ���� ��ĭ�� ����
									for(int h=i; h<99; ++h) {
										if (user[h+1][0] !=null) { //���� ȸ���� null �ƴϸ�
											
											user[h][0] = user[h+1][0];
											user[h][1] = user[h+1][1];
													
										}else {
											
											user[h][0] = null;
											user[h][1] = null;
											
										}
									}
									System.out.println("ȸ�� Ż�� ����");
								}
								if(b==2) {
									System.out.println("������ ��й�ȣ �Է� : ");
									String cpw = sc.next();
									user[i][1] = cpw ;
									System.out.println("���� �Ϸ�! ==> �α׾ƿ�");
									break;
								}
								if (b == 3) {
									System.out.println("�α׾ƿ� ����");
									break;
								}
							}
						}

					}
				}

			}
			if (a == 3) {
				System.out.println("����");
				break;

			}

		}
	}
}

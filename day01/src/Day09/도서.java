package Day09;

import java.util.Scanner;

public class ���� {
	Scanner sc = new Scanner(System.in);

	String ISBN;
	String å�̸�;
	String ����;
	boolean �뿩����;
	String �뿩ȸ��; // �ʵ� �߰�

	public ����() {
	}

	public ����(String iSBN, String å�̸�, String ����) {

		ISBN = iSBN;
		this.å�̸� = å�̸�;
		this.���� = ����;
		this.�뿩���� = true;
	}

	public void å���() {
		System.out.println("������� ����");
		while (true) {
			int cnt = 0;
			System.out.println("ISBN : ");
			ISBN = sc.next();

			if (ISBN.equals("n"))
				return;

			for (���� temp : ��������.�������) {
				// �ӽ� ��ü : ����Ʈ�� => ����Ʈ�� ��ü �� ��ŭ �ݺ�
				if (temp.ISBN.equals(ISBN)) {
					System.out.println("������ ISBN�� �ֽ��ϴ�  [n:����]");
					cnt = 1;
					break;
				}
			}
			if (cnt == 0) {
				System.out.println("������ : ");
				å�̸� = sc.next();
				System.out.println("���� : ");
				���� = sc.next();
				��������.�������.add(new ����(ISBN, å�̸�, ����));
				return;

			}
		}

	}

	public void å���() {
		System.out.println("=====å ���====");
		System.out.println("ISBN" + "\t" + "å�̸�" + "\t" + "����" + "\t" + "�뿩����");
		for (���� temp : ��������.�������) {
			System.out.println(temp.ISBN + "\t" + temp.å�̸� + "\t" + temp.���� + "\t" + temp.�뿩����);
		}

	}

	public void å����() {

	}

	public void å����() {

	}

	public void å�뿩(String tid) {
		System.out.println("�뿩 ����");
		System.out.println("�뿩�� ���� �� : ");
		å�̸� = sc.next();
		for (���� temp : ��������.�������) {
			if (temp.å�̸�.equals(å�̸�)) {
				if (temp.�뿩����) {
					System.out.println("�뿩 ����");
					System.out.println("1. �뿩 ��û, 2.��� ");
					int ���� = sc.nextInt();
					if (���� == 1) {
						System.out.println(temp.å�̸� + "�� ������ �뿩�մϴ�");
						temp.�뿩���� = false;
						temp.�뿩ȸ�� = tid;
					}
					if (���� == 2) {
						return;
					}

				} else {
					System.out.println("�뿩 �Ұ�");
				}

			}
		}

	}

	public void å�ݳ�(String tid) {
		for (���� temp : ��������.�������) {
			if (temp.å�̸�.equals(å�̸�)) {
				if (temp.�뿩����) {
					System.out.println("�ݳ�");
					System.out.println("1. �ݳ� ��û, 2.��� ");
					int ���� = sc.nextInt();
					// �뿩 ȸ���� ��츸 �ݳ�
					if (temp.�뿩ȸ��.equals(tid)) {
						if (���� == 1) {
							System.out.println(temp.å�̸� + "�� ������ �ݳ��մϴ�");
							temp.�뿩���� = true;
							temp.�뿩ȸ�� = null;
						}
						if (���� == 2) {
							return;
						}

					} else {
						System.out.println("�ݳ� ���� ����");
						return;
					}
				} else {
					System.out.println("�ݳ� �Ұ�");
				}
			}
		}
	}

	public void �����ڸ޴�() {
		System.out.println("������ �޴�");
		System.out.println("1.������� 2. �������� 3.�������� 4. ȸ����� 5. �α׾ƿ�");
		int a = sc.nextInt();
		���� temp = new ����();

		if (a == 1) {
			temp.å���();
		}
		if (a == 2) {
			temp.å����();
		}
		if (a == 3) {
			temp.å����();
		}
		if (a == 4) {

		}
		if (a == 5) {
			System.out.println("�α׾ƿ�");
			return;
		}

	}

	public void �Ϲݸ޴�(String tid) {
		System.out.println("�ȳ��ϼ���");
		System.out.println("1.���, 2.����, 3.�뿩, 4.�ݳ�, 5.�� ��������, 6. ȸ������, 7.�α׾ƿ�");
		int b = sc.nextInt();
		���� temp = new ����();
		if (b == 1) {
			temp.å���();
		}
		if (b == 2) {
			temp.å����();
		}
		if (b == 3) {
			temp.å�뿩(tid);
		}
		if (b == 4) {
			temp.å�ݳ�(tid);
		}
		if (b == 5) {
		}
		if (b == 6) {
		}
		if (b == 7) {
			System.out.println("�α׾ƿ�");
			return;
		}

	}

}

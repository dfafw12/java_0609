package Day09;

import java.util.Scanner;

public class ȸ�� {

	Scanner sc = new Scanner(System.in);
	// �ʵ�
	String tid;
	String tpw;
	String tname;
	String tadrs;

	// ������
	public ȸ��() {
	}

	public ȸ��(String tid, String tpw, String tname, String tadrs) {
		this.tid = tid;
		this.tpw = tpw;
		this.tname = tname;
		this.tadrs = tadrs;
	}

	// �޼ҵ�
	public void ȸ������() {
		System.out.println("ȸ������ ����!");

		System.out.println("���̵� : ");
		tid = sc.next();
		// �ߺ�����
		int cnt = 0;
		while (true) {
			for (int i = 0; i < ��������.ȸ�����.size(); ++i) {
				// ����Ʈ�� ��ü ��
				if (��������.ȸ�����.get(i).tid.equals(tid)) {
					// i��° ���̵� ���� ���� �Էµ� ���̵�� �����ϸ�
					System.out.println("������� ���̵�");
					cnt = 1;
					break;
				}
			}
			if (cnt == 0) {
				System.out.println("��й�ȣ : ");
				tpw = sc.next();
				System.out.println("�̸� : ");
				tname = sc.next();
				System.out.println("�ּ� : ");
				tadrs = sc.next();
				// ��ü ����
				ȸ�� temp = new ȸ��(tid, tpw, tname, tadrs);
				// ����Ʈ�� ���
				��������.ȸ�����.add(temp); // �ش� ��ü ��� = ����Ʈ��.add(��ü��)
				System.out.println("ȸ������ �Ϸ�!");
				return;
						

			}
		}

	}

	public void �α���() {

		
			System.out.println("�α��� ����!");
			
			System.out.println("���̵� : ");
			String tid = sc.next();
			System.out.println("��й�ȣ : ");
			String tpw = sc.next();
			for (int i = 0; i < ��������.ȸ�����.size(); ++i) {
				if (��������.ȸ�����.get(i).tid.equals(tid) &&��������.ȸ�����.get(i).tpw.equals(tpw)) {
					System.out.println("�α��� ����");
						���� temp =new ����();
					if(tid.equals("admin")) temp.�����ڸ޴�();
					else temp.�Ϲݸ޴�(tid);
					return;
				}
			}
			System.out.println("������ ȸ�������� �����ϴ�.");
			
		}

	

	public void ���̵�ã��() {
		// ����, �ּ� �Է¹޾� �ݺ����� �̿��� ����Ʈ���� ������ ��ü ã��
		System.out.println("���̵� ã�� ����!");
		System.out.println("�̸� : ");
		tname = sc.next();
		System.out.println("�ּ� : ");
		tadrs = sc.next();
		// for Ȱ�� => ����Ʈ Ȱ��
		
		for (ȸ�� temp : ��������.ȸ�����) {
			//�ӽ� ��ü : ����Ʈ�� => ����Ʈ�� ��ü ����ŭ �ϳ��� �ӽð�ü ����
			if(temp.tname.equals(tname) && temp.tadrs.equals(tadrs)) {
				System.out.println(tname + "ȸ������ ���̵�� : "+temp.tid);
				return;
			}
			System.out.println("������ ȸ�������� �����ϴ�.");
		}
	}

	public void ��й�ȣã��() {
		System.out.println("��й�ȣ ã�� ����!");
		System.out.println("���̵� : ");
		tid = sc.next();
		System.out.println("���� : ");
		tname = sc.next();
		// for Ȱ�� => ����Ʈ Ȱ��
		
		for (ȸ�� temp : ��������.ȸ�����) {
			//�ӽ� ��ü : ����Ʈ�� => ����Ʈ�� ��ü ����ŭ �ϳ��� �ӽð�ü ����
			if(temp.tname.equals(tname) && temp.tid.equals(tid)) {
				System.out.println(tname + "ȸ������ ��й�ȣ : "+temp.tpw);
				return;
			}
			System.out.println("������ ȸ�������� �����ϴ�.");
		}

	}

	public void ���������() {

	}

}

package Day11;

public class ���� implements ATM {
	String ���¹�ȣ;
	int �ݾ�;

	public ����() {
	}

	public ����(String ���¹�ȣ, int �ݾ�) {

		this.���¹�ȣ = ���¹�ȣ;
		this.�ݾ� = �ݾ�;
	}

	@Override
	public void ���µ��() {
		System.out.println("���� ��� ����");

	}

	@Override
	public void ����() {
		System.out.println("���� ����");

	}

	@Override
	public void �ܰ�() {
		System.out.println("�ܰ� : ");

	}

	@Override
	public void ���() {
		System.out.println("��� ����");

	}

	@Override
	public void �޴�() {
		System.out.println("===�޴�===");

		System.out.println("===ATM�޴�===");
		System.out.println("1. ���µ�� 2. ���� 3. �ܰ�Ȯ�� 4. ��� 5. ����");
		int ���� = Test03.sc.nextInt();
		if (���� == 1) {
			���µ��();

		}
		if (���� == 2) {
			System.out.println("����");
			int result = ����ã��();
			if (result == -1)
				return;
			else {
				System.out.println(" ������ �ݾ� : ");
				int �ݾ� = Test03.sc.nextInt();
				Test03.���¸��.get(result).�ݾ� += �ݾ�;
				System.out.println("�Աݼ���");
			}
		}
		if (���� == 3) {
			System.out.println("�ܰ�");
			int result =����ã��();
			if(result == -1 ) return;
			else {
				System.out.println("���� �ܰ� : " + Test03.���¸��.get(result).�ݾ�);
			}
				
			
		}
		if (���� == 4) {
			int result = ����ã��();
			if (result == -1)
				return;
			else {
				System.out.println(" ����� �ݾ� : ");
				int �ݾ� = Test03.sc.nextInt();
				//���� : ���ݺ��� ��ū �ݾ��� ��� �Ұ�
				if(Test03.���¸��.get(result).�ݾ� < �ݾ�) {
					System.out.println("���ݾ��� �����մϴ�.");
					return; // �޼ҵ� ����
				}
				Test03.���¸��.get(result).�ݾ� -= �ݾ�;
				System.out.println("��ݼ���");
			}
			if (���� == 5) {
				return;
			}
		}

	}

	@Override
	public int ����ã��() {
		System.out.println("���¹�ȣ : ");
		String ���¹�ȣ = Test03.sc.next();

		// for�� Ȱ�� => ����Ʈ for��
		for (int i = 0; i < Test03.���¸��.size(); ++i) {
			���� temp = Test03.���¸��.get(i);
			if (temp.���¹�ȣ.equals(���¹�ȣ)) {
				return i;

			}

		}
		System.out.println("���� ���� ����");
		return -1;
	}

}

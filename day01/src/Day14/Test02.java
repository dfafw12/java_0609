package Day14;

import java.util.Calendar;

public class Test02 {
	public static void main(String[] args) {

		// ���� ��¥�� �޷�
		Calendar calendar = Calendar.getInstance(); // 1. ���� �޷� ��������
		int today = calendar.get(calendar.DAY_OF_MONTH); // 2. ���� ��¥�� �ϼ�
		int year = calendar.get(calendar.YEAR); // 3. ���� ��¥�� ����
		int month = calendar.get(calendar.MONTH) + 1; // 4. ���糯¥�� �� +1 [1��:0 ~ 12��:11]

		calendar.set(year, month, 1); // 5. ���� ��¥�� 1��
		int sDay = calendar.get(calendar.DAY_OF_WEEK); // 6. ���ۿ��� //3
		int eDay = calendar.getActualMaximum(calendar.DAY_OF_MONTH); // 7. ���� ��¥ ���� ������ �ϼ�

		// �޷� ���
		System.out.println("==================" + year + "��	" + month + "�� ========================");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		System.out.println("===================================================");

		int ssDay = sDay; // ���ϱ��� [����ϸ��� �ٹٲ�] //�ӽ�

		// �� ���� 1���� ��ġ
		for (int i = 1; i < sDay; ++i) {
			System.out.print("\t");

		}

		// ���� ���
		for (int i = 1; i < eDay; ++i) {
			System.out.print(i + "\t");
			if (ssDay % 7 == 0)
				System.out.println(); // �ٹٲ�
			ssDay++;

		}

	}
}

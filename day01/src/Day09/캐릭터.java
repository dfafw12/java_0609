package Day09;

import java.util.Random;

public class ĳ���� {

	// �ʵ� [���� ����]
	String �г���; // ���ڴ� 2����Ʈ
	int ����; // 4����Ʈ
	int hp; // 4����Ʈ
	int power; // 4����Ʈ

	// ������: Ŭ������� �����ϰ� ����
	// ������� : �ʵ带 ��������
	public ĳ����() {

	}

	// ����ʵ������ : ��� �ʵ带 ����
	public ĳ����(String �г���, int ����, int hp, int power) {
		// �μ�1, �μ�2, �μ�3, �μ�4 : {} �ܺηκ��� ������ ������
		this.�г��� = �г���;
		// this.����Ŭ������ ���� = �μ�
		this.���� = ����;
		this.hp = hp;
		this.power = power;
	}

	// �޼ҵ� : �μ�X ��ȯX
	public void ��������() {

		System.out.println(�г��� + " �������� �߽��ϴ�");
	}

	// �޼ҵ� : �μ�O ��ȯX
	public void ����(int power) {

		Random random = new Random();

		int rpower = random.nextInt(10) + 1;

		System.out.println(rpower + " ��ŭ �����߽��ϴ� ");

	}

	// �޼ҵ� : �μ� O ��ȯ O
	public int ����(int power) {

		Random random = new Random();

		int rpower = random.nextInt(power) + 1;

		System.out.println(rpower + " ��ŭ ���ظ� �Ծ����ϴ�.");

		return rpower;
	}

	// �޼ҵ� : �μ� X ��ȯ O
	public int hpȮ��() {
		return this.hp;
	}
}

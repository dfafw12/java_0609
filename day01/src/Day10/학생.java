package Day10;

public class �л� extends ��� {
	//�ʵ�
	int �г�;
	

	// ������
	public �л�(String �̸�, int ����,int �г�) {
		super(�̸�, ����); // ����� �� Ŭ������ ������
		this.�г� = �г�;
		
	}
	//�޼ҵ� ������
	@Override // ��ӹ��� Ŭ������ �޼ҵ带 �������ϱ�
	public void ����() {
		System.out.println("�л��� �̸��� : "+this.�̸�);
		super.����();
	}
	
	//�޼ҵ�
	public void �л�����() {
		System.out.println(this.�̸�);
	}
}

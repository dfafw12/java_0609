package Day11;

public class �������� extends ���� {
	int �����ڵ� = 01; //�ĺ���
	
	public ��������() {}
	
	
	public ��������(String ���¹�ȣ, int �ݾ�, int �����ڵ�) {
		super(���¹�ȣ, �ݾ�);
		this.�����ڵ� =�����ڵ�;
	}
	
	@Override
	public void ���µ��() {
		System.out.println("�������� ���� ���");
		System.out.println("���¹�ȣ : ");
		String ���¹�ȣ =  Test03.sc.next();
		//����Ʈ�� �ֱ�
		Test03.���¸��.add( new ��������(���¹�ȣ, 0, �����ڵ�));
		System.out.println("��� �Ϸ�");
		
	}

	@Override
	public void ����() {
		System.out.println("����");
		����();
	}

	@Override
	public void �ܰ�() {
		System.out.println("�ܰ�");
	}

	@Override
	public void ���() {
		System.out.println("���");
		����ã��();
	}
	@Override
	public void �޴�() {
		
		super.�޴�();
	}

}

package Day11;

public interface ������ {
	
	//�ʵ�
	int �ִ���� = 10;
	int �ּҼ��� = 0;
	
	//�߻�޼ҵ� : ���� O ���� X
	public void ����();
	public void ����();
	public void ��������(int ����);
	
	//����Ʈ�޼ҵ� : ���� O ���� O
	public default void ä�κ���() {
		System.out.println("ä�κ���");
	}
	
}

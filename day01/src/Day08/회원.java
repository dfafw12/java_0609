package Day08;

public class ȸ�� {

	
	//�ʵ�
	
	String id;
	String pw;
	String name;
	int age;
	
	
	//������ : ��ü�� �ʱⰪ : ��ü�� �����ɶ� �⺻��.
	//������1.
	public ȸ��() {}
	
	//������2.
	public ȸ��(String id) {
		this.id = id;
		//�ش�Ŭ������ �ʵ�� �μ��� �ʵ���� �ٸ���� this ����
		
		
	}
	//������3.
	public ȸ�� (String id, String pw, String name, int age) {
		this.id = id;
		//���� Ŭ������ ���� = �����ڷ� ���� �μ��� ����
		this.pw = pw;
		this.name = name;
		this.age = age;
		// this.vlfemaud : ���� Ŭ���� ������ ����� �ʵ�
	}
	
	//�޼ҵ�
	
	public void ȸ������() {
		System.out.println(this.id);
		System.out.println(this.pw);
		System.out.println(this.name);
		System.out.println(this.age);
		
	}
}

package Day10_2;

public class vip extends ȸ�� {
	String ȸ�����;

	public vip(String ȸ�����) {

		this.ȸ����� = ȸ�����;
	}

	public vip(String ���̵�, String ��й�ȣ, String ȸ�����) {
		super(���̵�, ��й�ȣ);
		this.ȸ����� = ȸ�����;

	}

	@Override
	public void ����() {

		super.����();
		System.out.println("ȸ����� : " + this.ȸ�����);

	}

}

package Day12;

import java.util.Scanner;

public class member {
	Scanner sc = new Scanner(System.in);
	private String id;
	private String pw;
	private String name;

	public member() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//������, get�޼ҵ� ,set �޼ҵ�, => �ڵ��ϼ�����
	//	���콺 ��Ŭ�� => source
	
	public static void login(String id, String pw) throws Exception {
		
		if(!id.equals("qwe")) {
			//���ܸ����
			throw new Exception("���̵� �ٸ��ϴ�");
		}
		if(!pw.equals("qwe")) {
			throw new Exception("��й�ȣ�� �ٸ��ϴ�");
			
		}
		System.out.println("�α��� ����");
			
		
	}

}

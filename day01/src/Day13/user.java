package Day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class user {
	
	private String id;
	private String pw;
	private String name;

	// ������, get, set
	public user() {}

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

	public user(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public void signup() throws Exception {
		
			System.out.println("ȸ������");
			System.out.println("���̵� : ");
			String id = Test02.sc.next();
			System.out.println("��й�ȣ : ");
			String pw = Test02.sc.next();
			System.out.println("���� : ");
			String name = Test02.sc.next();
			
			user temp = new user(id, pw, name);
			Test02.userlist.add(temp);
			// ���Ͽ� ����
			Fileutil.���Ͼ���("c:/java/","userlist3.txt", Test02.userlist);
			System.out.println("ȸ������ ����");
			
		
	}
	public void login() {
		System.out.println("�α���");
		System.out.println("���̵� : ");
		String id = Test02.sc.next();
		System.out.println("��й�ȣ : ");
		String pw = Test02.sc.next();
		
		
	}


}
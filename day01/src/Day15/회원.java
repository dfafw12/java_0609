package Day15;

import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ȸ�� {

	String id;
	String pw;
	String name;
	String eamil;
	String phone;

	public ȸ��() {
	}

	public ȸ��(String id, String pw, String name, String eamil, String phone) {

		this.id = id;
		this.pw = pw;
		this.name = name;
		this.eamil = eamil;
		this.phone = phone;
	}

	public void ȸ������() {

		System.out.println("ȸ������ ����");

		System.out.println("���̵� : ");
		String id = Test01.sc.next();

		System.out.println("��й�ȣ : ");
		String pw = Test01.sc.next();

		System.out.println("�̸� : ");
		String name = Test01.sc.next();

		System.out.println("�̸��� : ");
		String email = Test01.sc.next();

		System.out.println("�ڵ��� ��ȣ : ");
		String phone = Test01.sc.next();

		ȸ�� temp = new ȸ��(id, pw, name, email, phone);
		Test01.ȸ�����.add(temp);
		System.out.println("ȸ������ �Ϸ�!");

		��������(email, "1", "0");

	}

	public void ���̵�ã��() {
		System.out.println("���̵�ã��");

		System.out.println("�̸� : ");
		String name = Test01.sc.next();

		System.out.println("�̸��� : ");
		String email = Test01.sc.next();

		for (ȸ�� temp : Test01.ȸ�����) {
			if (temp.name.equals(name) && temp.eamil.equals(email)) {
				System.out.println("�̸��Ϸ� ���̵� ����");
				��������(email, "2", temp.id);
				return;

			}
		}
		System.out.println("ȸ�� ������ �����ϴ�");

	}

	public void ��й�ȣã��() {
		System.out.println("��й�ȣã��");

		System.out.println("���̵� : ");
		String id = Test01.sc.next();

		System.out.println("�̸��� : ");
		String email = Test01.sc.next();
		// �ش� ���̵�� �̸��� ã��

		for (ȸ�� temp : Test01.ȸ�����) {
			// for���� ����Ʈ Ȱ�� ����Ʈ�� ��ü ����ŭ �ϳ��� temp��ü ����
			if (temp.id.equals(id) && temp.eamil.equals(email)) {

				��������(email, "3", temp.pw);
				System.out.println("�̸��Ϸ� �н����� ����");
				return;
			}

		}
		System.out.println("ȸ�� ������ �����ϴ�");

	}

	public void ��������(String email, String type, String re) {
		String host = "smtp.naver.com";
		String user = "dfafw12@naver.com";
		String pw = "mjy9915951753";

		Properties properties = new Properties();
		// ���� Ŭ����
		properties.put("mail.smtp.host", host);
		// .put (Ű,��) => �ѽ�
		properties.put("mail.smtp.port", 587); // ���̹� : 587
		properties.put("mail.smtp.auth", "true");

		// 2. ����Ȯ��
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
		
			protected PasswordAuthentication passwordAuthentication() {
				return new PasswordAuthentication(user, pw);
			}
			
			
		});

		// 3. ���� �ۼ�
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));

			if (type.equals("1")) {
				message.setSubject("������ ȯ���մϴ�");
				message.setText("�ȳ��ϼ���");
			}

			else if (type.equals("2")) {
				message.setSubject("ȸ������ ���̵�");
				message.setText("ȸ������ ���̵� : " + re);
				System.out.println("���̵� ����");
			}
			
			else if (type.equals("3")) {
				message.setSubject("ȸ������ �н�����");
				message.setText("ȸ������ �н����� : " + re);
				System.out.println("�н����� ����");
			}
			// ��������
			Transport.send(message);
			
		} catch (Exception e) {
		}
	}

}

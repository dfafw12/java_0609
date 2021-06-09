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

public class 회원 {

	String id;
	String pw;
	String name;
	String eamil;
	String phone;

	public 회원() {
	}

	public 회원(String id, String pw, String name, String eamil, String phone) {

		this.id = id;
		this.pw = pw;
		this.name = name;
		this.eamil = eamil;
		this.phone = phone;
	}

	public void 회원가입() {

		System.out.println("회원가입 진행");

		System.out.println("아이디 : ");
		String id = Test01.sc.next();

		System.out.println("비밀번호 : ");
		String pw = Test01.sc.next();

		System.out.println("이름 : ");
		String name = Test01.sc.next();

		System.out.println("이메일 : ");
		String email = Test01.sc.next();

		System.out.println("핸드폰 번호 : ");
		String phone = Test01.sc.next();

		회원 temp = new 회원(id, pw, name, email, phone);
		Test01.회원목록.add(temp);
		System.out.println("회원가입 완료!");

		메일전송(email, "1", "0");

	}

	public void 아이디찾기() {
		System.out.println("아이디찾기");

		System.out.println("이름 : ");
		String name = Test01.sc.next();

		System.out.println("이메일 : ");
		String email = Test01.sc.next();

		for (회원 temp : Test01.회원목록) {
			if (temp.name.equals(name) && temp.eamil.equals(email)) {
				System.out.println("이메일로 아이디 전송");
				메일전송(email, "2", temp.id);
				return;

			}
		}
		System.out.println("회원 정보가 없습니다");

	}

	public void 비밀번호찾기() {
		System.out.println("비밀번호찾기");

		System.out.println("아이디 : ");
		String id = Test01.sc.next();

		System.out.println("이메일 : ");
		String email = Test01.sc.next();
		// 해당 아이디와 이메일 찾기

		for (회원 temp : Test01.회원목록) {
			// for문의 리스트 활용 리스트내 객체 수만큼 하나씩 temp객체 대입
			if (temp.id.equals(id) && temp.eamil.equals(email)) {

				메일전송(email, "3", temp.pw);
				System.out.println("이메일로 패스워드 전송");
				return;
			}

		}
		System.out.println("회원 정보가 없습니다");

	}

	public void 메일전송(String email, String type, String re) {
		String host = "smtp.naver.com";
		String user = "dfafw12@naver.com";
		String pw = "mjy9915951753";

		Properties properties = new Properties();
		// 설정 클래스
		properties.put("mail.smtp.host", host);
		// .put (키,값) => 한쌍
		properties.put("mail.smtp.port", 587); // 네이버 : 587
		properties.put("mail.smtp.auth", "true");

		// 2. 인증확인
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
		
			protected PasswordAuthentication passwordAuthentication() {
				return new PasswordAuthentication(user, pw);
			}
			
			
		});

		// 3. 메일 작성
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));

			if (type.equals("1")) {
				message.setSubject("가입을 환영합니다");
				message.setText("안녕하세요");
			}

			else if (type.equals("2")) {
				message.setSubject("회원님의 아이디");
				message.setText("회워님의 아이디 : " + re);
				System.out.println("아이디 전송");
			}
			
			else if (type.equals("3")) {
				message.setSubject("회원님의 패스워드");
				message.setText("회워님의 패스워드 : " + re);
				System.out.println("패스워드 전송");
			}
			// 메일전송
			Transport.send(message);
			
		} catch (Exception e) {
		}
	}

}

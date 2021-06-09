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

public class Test01 {
	public static ArrayList<회원> 회원목록 = new ArrayList<>();
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println("=========로그인=========");
			
			System.out.println("1.회원가입 2.로그인 3.비밀번호찾기 4.아이디찾기 5.종료");
			int 선택 = sc.nextInt();
			
			회원 temp = new 회원();
			
			if (선택 == 1) {
				temp.회원가입();
			}
			if(선택 == 2) {
				
			}
			if(선택 == 3) {
				temp.비밀번호찾기();
			}
			if(선택 == 4 ) {
				temp.아이디찾기();
			}
			if(선택 == 5) {
				break;
			}

		}
	}

}

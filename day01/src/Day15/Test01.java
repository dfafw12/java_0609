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
	public static ArrayList<ȸ��> ȸ����� = new ArrayList<>();
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println("=========�α���=========");
			
			System.out.println("1.ȸ������ 2.�α��� 3.��й�ȣã�� 4.���̵�ã�� 5.����");
			int ���� = sc.nextInt();
			
			ȸ�� temp = new ȸ��();
			
			if (���� == 1) {
				temp.ȸ������();
			}
			if(���� == 2) {
				
			}
			if(���� == 3) {
				temp.��й�ȣã��();
			}
			if(���� == 4 ) {
				temp.���̵�ã��();
			}
			if(���� == 5) {
				break;
			}

		}
	}

}

package Day13;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {
	public static Scanner sc = new Scanner(System.in);
	
	public static ArrayList<user> userlist = new ArrayList<>();
	
		//public : ���������� [������� ����]
			//static : �޸� �켱�Ҵ� [���α׷� ����� �ʱ�ȭ]
	
	public static void main(String[] args) throws Exception {
		
		//���� Ŭ���� ����
		userlist = Fileutil.readfile(new File("c:/java/","userlist3.txt"));
		
		
		// ���� : ����Ʈ�� ������ ��� ���Ͽ� ���� / ������ �о�ͼ� ����Ʈ�� ����
		while(true) {
			user temp = new user();
			temp.signup(); 
			
		}
		
		
		
		
		
	}
}

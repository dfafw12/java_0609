package Day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.channels.FileLockInterruptionException;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// 메모리 : 데이터 저장 [ 프로그램 종료시 초기화 ]
			// 영구 저장 : 파일, DB, 클라우드
		
		// 2진수[0,1] : 1비트 => 8비트 => 1바이트 => 1024바이트 => 1kb
			// 스트림 : 입출력 통신 단위 [ 바이트 ]
		
		// 파일
			//1. 파일생성
		FileOutputStream outputStream = new FileOutputStream("c:/java/output.txt");
		// 파일 출력 클래스     객체명 [임의] = new[메모리할당연산자] 		생성자("경로/파일명")

			//2. 파일 쓰기
		String 내용 = "java입니다";
		outputStream.write(내용.getBytes());
			//객체명.write(바이트단위);
				//String.getBytes() : 문자열 => 바이트단위 변환
		
		// 3. 입력값 쓰기
		System.out.println("파일내용 입력 : ");
		String 내용2 = sc.next();
		outputStream.write(내용2.getBytes());
		
		// 4. 파일 내용 추가 // [기존 파일에 내용 추가 (true)]
		outputStream = new FileOutputStream("c:/java/output.txt",true);
		
			//3. 다시 입력값 받기
		
		System.out.println("파일 내용 입력 : ");
		String 내용3 = sc.next();
		outputStream.write(내용3.getBytes());
		
		// 5. 파일 읽어오기
		FileInputStream fileInputStream = new FileInputStream("c:/java/output.txt");
		byte[] 바이트배열 = new byte[1024] ; //1kb
		
		fileInputStream.read(바이트배열);
			//객체명.read(배열) ; 배열스트림에 있는 바이트 읽어와서 배열에 저장
		System.out.println(new String(바이트배열));
							//new String(배열명) : 해당 배열내 바이트를 문자열 변환
		
		
		
		
		
	}
}

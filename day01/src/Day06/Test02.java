package Day06;

public class Test02 {
	public static void main(String[] args) {
		// while : 무한반복
		int i =0;
		int sum = 0;
		while ( i < 10 ) {//해당 논리가 T이면 실행 F면 실행 X
			i++; // 증감식 
			sum+=i;
		} // i 가 10 이면 반복문 탈출.

		int j =0;
		
		while (true) {
			j++;
			System.out.println("무한반복");
			if (j==10)  break;
		}
	}
}

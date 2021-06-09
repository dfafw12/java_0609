package Day06;

public class Test01 {
	public static void main(String[] args) {
		// switch 값 제어 (논리 사용 X)
		int 점수 = 80;
		switch(점수) {
		case 90:
			System.out.println("A");
			break;
		case 80 : 
			System.out.println("B");
			break;
		case 70 : 
			System.out.println("C");
			break;
		case 60 : 
			System.out.println("F");
			break;
		default : 
			System.out.println("탈락");
		}	
		int 버튼 = 3;
		switch (버튼) {
		case 1 :
		case 2 :
		case 3 :
		default : 
		
		}
		
		// 3개의 점수를 평균을 계산후에 평균이 90점 이상이면 "A" 80점 이상이면 "B" 나머지 "탈락"
		int 국어 = 80, 영어 = 80, 수학 = 90 ;
		int 평균 =(국어 + 영어 + 수학 ) /3 ;
		// 90이상 => 9
		// 80이상 => 8
		
		switch (평균/10) {
		case 9 :
			System.out.println("A");
			break;
		case 8 : 
			System.out.println("B");
			break;
		default : 
			System.out.println("탈락");
			
		}
	}
}

package Day06;

public class Test01 {
	public static void main(String[] args) {
		// switch �� ���� (�� ��� X)
		int ���� = 80;
		switch(����) {
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
			System.out.println("Ż��");
		}	
		int ��ư = 3;
		switch (��ư) {
		case 1 :
		case 2 :
		case 3 :
		default : 
		
		}
		
		// 3���� ������ ����� ����Ŀ� ����� 90�� �̻��̸� "A" 80�� �̻��̸� "B" ������ "Ż��"
		int ���� = 80, ���� = 80, ���� = 90 ;
		int ��� =(���� + ���� + ���� ) /3 ;
		// 90�̻� => 9
		// 80�̻� => 8
		
		switch (���/10) {
		case 9 :
			System.out.println("A");
			break;
		case 8 : 
			System.out.println("B");
			break;
		default : 
			System.out.println("Ż��");
			
		}
	}
}

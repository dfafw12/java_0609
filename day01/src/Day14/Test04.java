package Day14;

import java.util.Calendar;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		
		while (true) {
			System.out.println("시작 연도 : ");
			int 검색연도 = sc.nextInt();

			System.out.println("시작 월 : ");
			int 검색월 = sc.nextInt();

			System.out.println("끝 연도 : ");
			int 끝연도 = sc.nextInt();

			System.out.println("끝 월 : ");
			int 끝월 = sc.nextInt();

			int 시작달 = 1;
			int 마지막달 = 12;
			if(검색연도>끝연도)System.out.println("검색불가");
			else if(검색연도 ==끝연도) {
				if(검색월>끝월)System.out.println("검색불가");
			}
			for (int y = 검색연도; y <= 끝연도; ++y) {
				// 검색연도 부터 끝연도 까지 연도가 1씩 증가
				
				
					// 만약에 현재연도와 끝연도가 동일한경우
					if (끝연도 == y)
						마지막달 = 끝월;

					if (검색연도 == y)
						시작달 = 검색월;
					else
						시작달 = 1;
					for (int m = 시작달; m <= 마지막달; ++m) {
						달력.달력검색(y, m);
						System.out.println();
						System.out.println();
					}

				}
			break;
			}
			
		}
	}


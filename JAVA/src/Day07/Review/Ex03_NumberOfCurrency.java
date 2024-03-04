package Day07.Review;

import java.util.Scanner;

/**
 * 	더조은컴퓨터아카데미에서 김조은 대리를 출장보낸다.
 *  이 때, 출방비를 다음과 같이 지급한다.
 *  출장비 		: 537620	
 *  50000		: 10개
 *  10000		: 3개
 *  5000		: 1개
 *  1000		: 2개
 *  500			: 1개
 *  100			: 1개
 *  50			: 0개
 *  10			: 2개
 *  5			: 0개
 *  1 			: 1개
 *  위와 같이 입력하면,
 *  큰 화폐단위부터 계산하여, 화폐단위별로 화폐매수를 출력하는 프로그램을 작성하시오.
 */
public class Ex03_NumberOfCurrency {

	public static void main(String[] args) {
		/*
		 	(순서도)
		 	1. 필요한 변수 선언
		 	- (입력금액), (화폐매수), (화폐단위)
		 	
		 	2. (입력금액) 입력
		 	
		 	3. 화폐매수 계산
		 	[조건] : 큰 화폐단위부터 계산한다.
		 	3-1. 화폐매수 계산 수식
		 		10 = 537620 / 50000 
		 		(화폐매수) = (입력금액) / (화폐단위)
		 		
		 	3-2. 잔액 계산
		 		(잔   액) = 537620 - 500000 = 37620
		 		i) 	(잔   액) = (입력금액) - ((화폐단위)*(화폐매수))
		 		ii)	(잔   액) = (입력금액) % (화폐단위)
		 		
		 	3-3. 화폐단위 변환
		 		번갈아 가면서, /5, /2 연산을 반복한다.
		 		(화폐단위) = (화폐단위) / 5
		 		(화폐단위) = (화폐단위) / 2
		 		
		 	4. 3번의 과정을 반복
		 	- 반복조건 : (화폐단위) 1보다 크거나 같으면 반복
		 	
		 	5. 3-1 과정에서 화폐매수를 출력한다.
		*/
		
		// 필요한 변수 : 입력금액, 화폐매수, 화폐단위
		int input, count, money = 50000;
		
		// 입력금액 입력
		System.out.print("출장비 : ");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		boolean sw = true;
		
		while( money >= 1 ) {
			// 화폐매수 계산
			count = input / money;
			System.out.println(money + "\t : " + count + " 개");
			
			// 잔액 계산
			input = input - (money * count);
			// input = input % money;
			
			// 화폐단위 변환
			if( sw )
				money = money / 5;
			else
				money = money / 2;
			sw = !sw;
		}
		
		sc.close();
	}
}













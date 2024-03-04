package Day03;

import java.util.Scanner;

public class Ex15_Continue {
	
	public static void main(String[] args) {
		// 5개의 정수를 입력받아
		// 입력받은 수중 양수(+)만 합계를 구하여 출력하시오.
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		// -5 8 2 -7 10
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			
			// 음수인 경우는 제외
			if( n < 0 ) 
				continue;
			// ** 남은 실행문을 무시하고, 다음 반복을 점프
			
			sum += n;
		}
		System.out.println("양수의 합 : " + sum);
		sc.close();
	}

}








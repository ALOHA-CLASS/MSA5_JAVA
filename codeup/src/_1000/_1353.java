package _1000;

import java.util.Scanner;

/**
 	n이 입력되면 다음과 같은 삼각형을 출력하시오.
	예)
	n 이 5 이면
	*
	**
	***
	****
	*****
 */
public class _1353 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// 바깥쪽 반복분 : 행 (i)
		for (int i = 1; i <= n; i++) {
			// 안쪽 반복문 : 열 (j)
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}














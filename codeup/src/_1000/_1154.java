package _1000;

import java.util.Scanner;

/**
 * 정수 두개가 입력으로 들어오면 큰수 - 작은수의 값을 출력하시오.
 */
public class _1154 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;
		
		if( a > b ) 
			result = a-b;
		else			// a == b or a < b
			result = b-a;
		System.out.println(result);
		sc.close();
	}
}




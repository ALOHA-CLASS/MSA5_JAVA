package _1000;

import java.util.Scanner;

/**
 *  두 정수를 입력받아 아래와 같이 출력하시오.
 *  
 */
public class _1116 {
	
	public static void main(String[] args) {
		// 1. 두 정수 입력
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 2. 덧셈/뺄셈/곱셈/나눗셈 결과 구하기
		// 3. 출력 양식에 맞게 출력
		//    ex) 3+2=5
		System.out.println(a + "+" + b + "=" + (a+b));
		System.out.println(a + "-" + b + "=" + (a-b));
		System.out.println(a + "*" + b + "=" + (a*b));
		System.out.println(a + "/" + b + "=" + (a/b));
		sc.close();
	}
}










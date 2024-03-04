package _1000;

import java.util.Scanner;

/**
	1. 공이 30m~40m나 60m~70m 에 들어오면 슬기가 이김.
	2. 그 외의 구간에 떨어지면 체육선생님이 이김.
	슬기가 던진 공의 위치가 입력으로 주어지면 슬기가 이기는 구간에는 "win"을 출력하고, 
	그 외에는 "lose"를 출력하시오.
 */
public class _1158 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double input = sc.nextDouble();
		
		if( (input >= 30.0 && input <= 40.0) || (input >= 60.0 && input <= 70.0) ) 
			System.out.println("win");
		else 
			System.out.println("lose");
		
		sc.close();
	}

}



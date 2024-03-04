package Day12.Ex04_Util;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerSum {

	// "1,2,3,4,5"
	// "," ---분리---> 1 2 3 4 5 (String)
	// 토큰을 (int) 타입으로 변환하여 합계를 구해보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();   // 1,2,3,4,5
		
		StringTokenizer st = new StringTokenizer(input, ",");
		int sum = 0;
		
		while( st.hasMoreTokens() ) {
			int item = Integer.parseInt( st.nextToken() );
			sum += item;
		}
		
		System.out.println("합계 : " + sum);
		sc.close();
	}
}




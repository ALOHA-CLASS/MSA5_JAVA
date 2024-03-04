package Day17.Ex02_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LottoStream {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임? ");
		int N = sc.nextInt();

		// N번 반복
		for (int i = 0; i < N; i++) {
			System.out.print("[" + (i+1) + " 게임] : ");
			List<Integer> lottoList = new ArrayList<Integer>();
			
			// 랜덤 수 6개를 대입
			HashSet<Integer> set = new HashSet<Integer>();
			for (int j = 0; j < 6; j++) {
				int rand = (int) (Math.random() * 45 + 1);	// 1~45 랜덤 수

				// 중복제거  
				// - set.add()  : 중복 아니면 true, 중복이면 false 
				if( !set.add(rand) ) j--;
				
			} // -- 랜덤 수 6개 대입 (끝)
			
			
			// 스트림을 사용하여, Set 를 List 로 변환하여 대입
			lottoList = set.stream().collect( Collectors.toList() );

			// 스트림을 사용하여, 정렬 + 출력
			lottoList.stream()			// 스트림 객체 생성
					 .sorted()			// 정렬
					 .forEach( lotto -> System.out.print(lotto + " ") );	// 전체 반복
			System.out.println();
		}
		
		sc.close();
	}
	// [1 게임] : 1 2 3 4 5 6
	// [2 게임] : 1 2 3 4 5 6
	// [3 게임] : 1 2 3 4 5 6
}







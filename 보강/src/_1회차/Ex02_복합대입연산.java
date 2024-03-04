package _1회차;

public class Ex02_복합대입연산 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 0;
		
		// 복합 대입 연산자
		c += a;			// c = c + a;
		c = c + a;		// <- 이렇게 써도 똑같은데, 축약해서 사용한 것.
		
		// 그래서 주로 합계 구할 때 씁니다.
		int sum = 0;
		sum += a;		// sum = sum + a;
		
		
	}
}

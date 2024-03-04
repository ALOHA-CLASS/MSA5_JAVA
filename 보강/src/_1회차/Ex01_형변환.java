package _1회차;

public class Ex01_형변환 {

	public static void main(String[] args) {
		// * 자동 형변환
		// : 작은 자료형을 큰 자료형에 대입하면, 자동으로 자료형이 변환된다.
		int num = 10;				// int 		- 4byte (작은 자료형)
		double  num2 = num;			// double 	- 8byte (큰 자료형)
		// (int) --> (double)
		System.out.println(num2);
		
		// * 강제 형변환
		// : 큰 자료형을 작은 자료형에 대입할 때, "(자료형)" 을 명시하여 변환한다.
		double test = 12.34;
		int test2 = (int) test;	
		// (double) --> (int) 
		System.out.println(test2);
		
	}
}






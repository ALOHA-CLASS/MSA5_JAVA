package Day06.Ex01_ObjectArray;

/**
 *  반지름이 1~5인 Circle 객체를 5개 가지는 객체 배열을 생성하고,
 *  배열 요소에 있는 모든 Circle 객체의 넓이를 출력하세요.
 */

class Circle {
	// 변수		: 반지름
	int radius;
	
	// 생성자
	public Circle(int radius) {
		this.radius = radius;
	}
	
	// 메소드		: 넓이
	public double area() {
		// (원의 넓이) = (원주율) * (반지름)^2
		// * 원주율 (파이) = 3.141592...  : Math.PI
		return Math.PI * Math.pow(radius, 2);
	}
}


public class CircleArray {
	
	public static void main(String[] args) {
		Circle[] c;				// Circle 배열에 대한 레퍼런스 c 선언
		c = new Circle[5];		// 5개의 요소를 갖는 Circle 배열 생성
		
		// i : 0,1,2,3,4
		for (int i = 0; i < c.length; i++) {
			// 반지름 1~5 까지, Circle 객체를 생성
			c[i] = new Circle(i+1);		// (i+1)  : 1,2,3,4,5
		}
		
		for (Circle circle : c) {
			System.out.println("넓이 : " + circle.area());
		}
		
	}

}













package Day10.Ex01_NestedClass;

public class NestedClass2 {

	public static void main(String[] args) {
		// X
		// - Y
		// - Z
		X x = new X();
		
		// 인스턴스 멤버(이너) 클래스 객체 생성
		X.Y y = x.new Y();
		y.value = 10;
		System.out.println("Y의 객체의 변수 : " + y.value);
		y.method1();

		// static 멤버(이너) 클래스 객체 생성
		X.Z z = new X.Z();
		z.value1 = 20;
		System.out.println("X의 Z 객체 변수 : " + z.value1);
		
		X.Z.value2 = 30;
		System.out.println("X의 Z 객체의 static 변수 : " + X.Z.value2);
		z.method1();
		X.Z.method2();
		
		// 로컬 클래스 객체 생성을 위한 메소드 호출
		x.method();				// 내부에서 L 객체 생성
	}
}

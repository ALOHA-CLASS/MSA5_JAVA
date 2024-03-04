package Day08.Ex02_Shape;

public class Point {

	// 멤버변수 x,y
	int x, y;

	// alt + shift + S -> Generate Contstructor Using Field...
	// 기본 생성자
	public Point() {
		
	}
	
	// 매개변수가 있는 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// alt + shift + S -> Generate toString()...
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}

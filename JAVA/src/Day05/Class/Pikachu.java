package Day05.Class;

public class Pikachu {
	
	// 클래스 	: 객체를 정의하는 설계도
	// 멤버 		: 변수, 메소드
	
	// 변수
	public int energy;
	public String type;
	
	// 생성자
	// : 객체가 생성될 때, 실행되는 메소드
	// - 객체의 변수를 초기화하는 역할
	// * 생성자의 이름은 클래스의 이름과 동일하다.
	// 메소드 정의 - 접근지정자 반환타입 메소드명( 매개변수 ) { }
	// 생성자 정의 - 접근지정자 생성자명( 매개변수 ) { }
	// ** 기본 생성자
	// : 매개변수가 없는 생성자
	
	// 생성자 자동 완성 단축키
	// : alt + shift + S , O
	public Pikachu() {
		// this() : 생성자에서 다른 생성자를 호출하는 메소드
		// this() 메소드는 생성자 내에서 첫문장이 되어야한다.
		this(100, "전기");
//		this.energy = 100;
//		this.type = "전기";
	}
	
	// 메소드 오버로딩
	// : 같은 이름의 메소드를 매개변수의 타입/순서/개수를 다르게 하여 중복 정의하는 것
	public Pikachu(int energy, String type) {
		this.energy = energy;
		this.type = type;
	}


	// 메소드
	// - 접근지정자 반환타입 메소드명( 매개변수 ) {} 
	public String aAttack() {
		return "십만볼트";
	}
	

	public String bAttack() {
		return "전광석화";
	}

	@Override
	public String toString() {
		return "Pikachu [energy=" + energy + ", type=" + type + "]";
	}

	
	
	
}

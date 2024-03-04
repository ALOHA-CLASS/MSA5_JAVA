package Day14.Ex02_WildCard;

public class Student extends Person {

	public Student(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Student [" + this.getName() + "]";
	}

	
}

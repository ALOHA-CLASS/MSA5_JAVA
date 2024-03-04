package Day03;

import java.util.Scanner;

public class Ex06_Grade {
	
	public static void main(String[] args) {
		// 학점을 입력받아, 점수대를 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("학점 : ");
		String grade = sc.next();			// String (문자열) 참조자료형

		switch (grade) {
			// B~F 까지 case문, 출력문 완성해보시오.
			case "A":	System.out.println("90~100점입니다.");	break;
			case "B":	System.out.println("80~89점입니다.");		break;
			case "C":	System.out.println("70~79점입니다.");		break;
			case "D":	System.out.println("60~69점입니다.");		break;
			case "F":	System.out.println("60점 미만입니다.");	break;
			default:	System.out.println("A~F 사이의 문자를 입력해주세요.");
						break;
		}
		sc.close();
	}

}


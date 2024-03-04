package _1000;


import java.util.Scanner;

public class _1156 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if( num % 2 == 1 ) {
			System.out.println("odd");
		} 
		else {
			System.out.println("even");
		}
		sc.close();
	}

}

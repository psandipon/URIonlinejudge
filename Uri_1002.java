package uri;

import java.util.Scanner;

public class Uri_1002 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		double R = kb.nextDouble();
		final double pi = 3.14159 ;
		double area = pi*R*R ;
		System.out.printf("A=%.4f%n",area);

	}

}

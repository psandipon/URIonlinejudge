package uri;

/**
 * link :https://www.urionlinejudge.com.br/judge/en/problems/view/1012
 */

import java.util.Scanner;

public class Uri_1012 {

	public static void main(String[] arg) {
		Scanner kb = new Scanner(System.in);
		final double PI = 3.14159 ;
		

		double a = kb.nextDouble();
		double b = kb.nextDouble();
		double c = kb.nextDouble();

		System.out.printf("TRIANGULO: %.3f%n", (a * c) / 2);
		System.out.printf("CIRCULO: %.3f%n", c * c * PI);
		System.out.printf("TRAPEZIO: %.3f%n", ((a + b) / 2) * c);
		System.out.printf("QUADRADO: %.3f%n", b * b);
		System.out.printf("RETANGULO: %.3f%n", a * b);
	}

}



package uri;

import java.util.Scanner;

public class Uri_1043 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		double a = kb.nextDouble();
		double b = kb.nextDouble();
		double c = kb.nextDouble();
		boolean ver = false;

		double mod = b - c;
		if (mod < 0)
			mod = -mod;

		if (mod < a && a < (b + c)) {
			System.out.printf("Perimetro = %.1f%n", (a + b + c));
		} else {
			System.out.printf("Area = %.1f%n", ((a + b) * c) / 2 );
		}

	}

}

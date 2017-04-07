package uri;

import java.util.Scanner;

public class Uri_1041 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		double x = kb.nextDouble();
		double y = kb.nextDouble();

		if (x == 0 && y == 0) {
			System.out.printf("Origem%n");
		} else if (x == 0) {
			System.out.printf("Eixo Y%n");
		} else if (y == 0) {
			System.out.printf("Eixo X%n");
		} else if (x > 0 && y > 0) {
			System.out.printf("Q1%n");
		} else if (x > 0 && y < 0) {
			System.out.printf("Q4%n");
		} else if (x < 0 && y > 0) {
			System.out.printf("Q2%n");
		} else {
			System.out.printf("Q3%n");
		}

	}

}

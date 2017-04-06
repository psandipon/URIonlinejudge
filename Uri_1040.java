package uri;

import java.util.Scanner;

public class Uri_1040 {

	public static void main(String[] args) {

		float a, b, c, d, m, f, recalaverage;

		Scanner kb = new Scanner(System.in);

		a = kb.nextFloat();
		b = kb.nextFloat();
		c = kb.nextFloat();
		d = kb.nextFloat();

		m = ((a * 2) + (b * 3) + (c * 4) + (d * 1)) / 10;

		if (m >= 7.0) {
			System.out.printf("Media: %.1f\n", m);
			System.out.print("Aluno aprovado.\n");
		}

		else if (m >= 5.0 && m <= 6.9) {
			System.out.printf("Media: %.1f\n", m);

			System.out.print("Aluno em exame.\n");

			f = kb.nextFloat();

			System.out.printf("Nota do exame: %.1f\n", f);

			recalaverage = (m + f) / 2;

			if (recalaverage >= 5.0) {
				System.out.print("Aluno aprovado.\n");
			} else {
				System.out.print("Aluno reprovado.\n");
			}
			System.out.printf("Media final: %.1f\n", recalaverage);

		}

		else if (m < 5.0) {
			System.out.printf("Media: %.1f\n", m);
			System.out.print("Aluno reprovado.\n");
		}

	}

}
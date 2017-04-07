package uri;

import java.util.Scanner;

public class Uri_1040 {

	public static void main(String[] args) {



		Scanner kb = new Scanner(System.in);

		float a = kb.nextFloat();
		float b = kb.nextFloat();
		float c = kb.nextFloat();
		float d = kb.nextFloat();

		float m = ((a * 2) + (b * 3) + (c * 4) + (d * 1)) / 10;

		if (m >= 7.0) {
			System.out.printf("Media: %.1f\n", m);
			System.out.print("Aluno aprovado.\n");
		}

		else if (m >= 5.0 && m <= 6.9) {
			System.out.printf("Media: %.1f\n", m);

			System.out.print("Aluno em exame.\n");

			float 	f = kb.nextFloat();

			System.out.printf("Nota do exame: %.1f\n", f);

			float r = (m + f) / 2;

			if (r >= 5.0) {
				System.out.print("Aluno aprovado.\n");
			} else {
				System.out.print("Aluno reprovado.\n");
			}
			System.out.printf("Media final: %.1f\n", r);

		}

		else if (m < 5.0) {
			System.out.printf("Media: %.1f\n", m);
			System.out.print("Aluno reprovado.\n");
		}

	}

}
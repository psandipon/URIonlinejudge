package uri;

import java.util.Scanner;

public class Uri_1018 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int a, b;

		a = kb.nextInt();

		System.out.println(a);
		System.out.println(a / 100 + " nota(s) de R$ 100,00");

		b = (a % 100);
		System.out.println(b / 50 + " nota(s) de R$ 50,00");

		b = (b % 50);
		System.out.println(b / 20 + " nota(s) de R$ 20,00");

		b = (b % 20);
		System.out.println(b / 10 + " nota(s) de R$ 10,00");

		b = (b % 10);
		System.out.println(b / 5 + " nota(s) de R$ 5,00");

		b = (b % 5);
		System.out.println(b / 2 + " nota(s) de R$ 2,00");

		b = (b % 2);
		System.out.println(b / 1 + " nota(s) de R$ 1,00");

	}

}

package uri;

/**
 * link :https://www.urionlinejudge.com.br/judge/en/problems/view/1010
 */

import java.util.Scanner;

public class Uri_1010 {

	public static void main(String[] arg) {
		Scanner kb = new Scanner(System.in);
		kb.nextInt();
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",
				(kb.nextInt() * kb.nextDouble()) + (kb.nextInt() * 0) + (kb.nextInt() * kb.nextDouble()));
	}

}

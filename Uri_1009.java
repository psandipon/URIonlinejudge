package uri;

/**
 * link :https://www.urionlinejudge.com.br/judge/en/problems/view/1009
 */


import java.util.Scanner;

public class Uri_1009 {
	
	public static void main(String[]arg){
		Scanner kb = new Scanner (System.in);
		String s = kb.nextLine();
		double a = kb.nextDouble() ;
		double b = kb.nextDouble() ;
	
		System.out.printf("TOTAL = R$ %.2f%n", a + ((b/100)*15));
	}

}

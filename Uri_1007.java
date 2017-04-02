package uri;

/**
 * link :https://www.urionlinejudge.com.br/judge/en/problems/view/1007
 */


import java.util.Scanner;

public class Uri_1007 {
	
	public static void main(String[]arg){
		Scanner kb = new Scanner (System.in);
		int a = kb.nextInt() ;
		int b = kb.nextInt() ;
		int c = kb.nextInt() ;
		int d = kb.nextInt() ;
		System.out.println("DIFERENCA = "+((a*b)-(c*d)));
	}

}

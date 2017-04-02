package uri;

/**
 * link :https://www.urionlinejudge.com.br/judge/en/problems/view/1006
 */


import java.util.Scanner;

public class Uri_1006 {
	
	public static void main(String[]arg){
		Scanner kb = new Scanner (System.in);
		double A = kb.nextDouble();
		double B = kb.nextDouble();
		double C = kb.nextDouble();
		double calculation = (((A*2)+(B*3)+(C*5))/(10)) ;
		
		System.out.printf("MEDIA = %.1f%n",calculation);
	}

}

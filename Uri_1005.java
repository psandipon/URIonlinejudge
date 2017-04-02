package uri;

/**
 * link :https://www.urionlinejudge.com.br/judge/en/problems/view/1005
 */


import java.util.Scanner;

public class Uri_1005 {
	
	public static void main(String[]arg){
		Scanner kb = new Scanner (System.in);
		double A = kb.nextDouble();
		double B = kb.nextDouble();
		double calculation = (((A*3.5)+(B*7.5))/(11)) ;
		
		System.out.printf("MEDIA = %.5f%n",calculation);
	}

}

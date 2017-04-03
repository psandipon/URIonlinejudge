package uri;

/**
 * link :https://www.urionlinejudge.com.br/judge/en/problems/view/1011
 */


import java.util.Scanner;

public class Uri_1011 {
	
	public static void main(String[]arg){
		Scanner kb = new Scanner (System.in);
		double R = kb.nextDouble() ;
		
		final double PI = 3.14159 ;
		double vol = (4.0/3)*(PI*R*R*R) ;
		System.out.printf("VOLUME = %.3f%n",vol);
	}

}

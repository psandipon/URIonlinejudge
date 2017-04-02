package uri;

/**
 * link :https://www.urionlinejudge.com.br/judge/en/problems/view/1008
 */


import java.util.Scanner;

public class Uri_1008 {
	
	public static void main(String[]arg){
		Scanner kb = new Scanner (System.in);
		int number = kb.nextInt() ;
		System.out.println("NUMBER = "+number);
		int hourPerMonth = kb.nextInt() ;
		double payPerHour = kb.nextDouble() ;
		System.out.printf("SALARY = U$ %.2f%n",(hourPerMonth*payPerHour));
	}

}

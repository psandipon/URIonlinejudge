package uri;

import java.util.Scanner;

public class Uri_1020 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		
		int a = n / 365;
		int b = n % 365;
		int c = b % 30;
		int d = b / 30;
		int e = c % 30;
		
		System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n",a,d,e);
		
		
		
	}

}

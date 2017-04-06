package uri;

import java.util.Scanner;

public class Uri_1035 {

	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in) ;
		
		int a = kb.nextInt() ;
		int b = kb.nextInt() ;
		int c = kb.nextInt() ;
		int d = kb.nextInt() ;
		
		if((b > c) && (d > a) && (c + d > a + b) && c > 0 && c > 0 && (a % 2 == 0)){
			System.out.println("Valores aceitos");
		}else
			System.out.println("Valores nao aceitos");
	}

}

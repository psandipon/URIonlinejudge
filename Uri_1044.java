package uri;

import java.util.Scanner;

public class Uri_1044 {

	public static void main(String[] args) {

		Scanner kb = new Scanner (System.in) ;

		int x = kb.nextInt() ;
		int y = kb.nextInt() ;


		if(x < y){
			if(y % x == 0){
				System.out.println("Sao Multiplos");
			}
			else{
				System.out.println("Nao sao Multiplos");
			}
		}else{
			if(x % y == 0){
				System.out.println("Sao Multiplos");
			}
			else{
				System.out.println("Nao sao Multiplos");
			}
		}


	}

}



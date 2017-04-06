package uri;

import java.util.Scanner;

public class Uri_1036 {

	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		
		double a = kb.nextDouble() ;
		double b = kb.nextDouble() ;
		double c = kb.nextDouble() ;
		
		double delta= b*b - (4*a*c) ;
		
		if (delta<0 || a == 0){
			System.out.println("Impossivel calcular");
		}else{
			double root = Math.sqrt(delta) ;
			double ans1 = (-b+root)/(2*a) ;
			double ans2 = (-b-root)/(2*a) ;
			System.out.printf("R1 = %.5f%n",ans1);
			System.out.printf("R2 = %.5f%n",ans2);
		}
				

	}

}

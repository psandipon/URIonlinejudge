package uri;

import java.util.Scanner;

public class Uri_1015 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		double x1 = kb.nextDouble();
		double y1 = kb.nextDouble();
		
		double x2 = kb.nextDouble();
		double y2 = kb.nextDouble();
		
		
		
		double ans = Math.sqrt( (Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2)) );
		System.out.printf("%.4f%n",ans);

	}

}

package uri;

import java.util.HashMap;
import java.util.Scanner;

public class Uri_1038 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int x = kb.nextInt();
		int y = kb.nextInt();

		HashMap<Integer, Double> map = new HashMap<>();

		map.put( 1, 4.0 ) ;
		map.put( 2, 4.5 ) ;
		map.put( 3, 5.0 ) ;
		map.put( 4, 2.0 ) ;
		map.put( 5, 1.5 ) ;
		
		
		if (map.containsKey(x) ){
			System.out.printf("Total: R$ %.2f%n",(map.get(x) * y) ); ;
		}
		

	}
}
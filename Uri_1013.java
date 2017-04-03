package uri;

import java.util.Arrays;
import java.util.Scanner;

public class Uri_1013 {

	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in) ;
		
		
		int [] arr = new int [3] ;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = kb.nextInt() ;
		}
		
		Arrays.sort(arr);
		
		System.out.printf("%d eh o maior%n",arr[2]);
		

	}

}

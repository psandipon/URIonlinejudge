package uri;

import java.util.Arrays;
import java.util.Scanner;

public class Uri_1042 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int [] arr = {kb.nextInt(),kb.nextInt(),kb.nextInt()} ;

		int [] inputArr = new int[3] ;


		for (int i = 0; i < inputArr.length; i++) {
			inputArr [i] = arr[i] ;
		}

		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println();

		for (int i : inputArr) {
			System.out.println(i);
		}

	}

}

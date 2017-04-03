package uri;

import java.util.Scanner;

public class Uri_1019 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();

		int h = t / 3600; // as one hour = 3600 sec
		t = t - (h * 3600); // left ove calculation

		int m = t / 60; // as one min = 60 sec
		t = t - (m * 60); // left over sec
		int s = t ;
		System.out.println("" + h + ":" + m + ":" + s);

	}

}

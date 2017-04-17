package AOJ;

import java.util.Scanner;

public class P1276 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		float s = cin.nextFloat();
		float h;
		h = 5 * (s - 32) / 9;
		String string = String.format("%.3f", h);
		System.out.println(string);
	}
}

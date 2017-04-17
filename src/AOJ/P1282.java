package AOJ;

import java.util.Scanner;

public class P1282 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		float a = cin.nextFloat();
		float b = Math.abs(a);
		String string = String.format("%.2f", b);
		System.out.println(string);
		cin.close();
	}
}

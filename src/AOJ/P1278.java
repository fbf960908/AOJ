package AOJ;

import java.util.Scanner;

public class P1278 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		double sin = Math.sin(a / 180.0 * Math.PI);
		double cos = Math.cos(a / 180.0 * Math.PI);
		String s1 = String.format("%.3f", sin);
		String s2 = String.format("%.3f", cos);
		System.out.println(s1 + " " + s2);
		cin.close();
	}
}

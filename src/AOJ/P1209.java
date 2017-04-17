package AOJ;

import java.util.Scanner;

public class P1209 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		double U = cin.nextFloat();
		double D = cin.nextFloat();
		double H = cin.nextFloat();
		double S = (D + U) * H / 2;
		double L = U + D + 2 * Math.sqrt(H * H + (D - U) / 2 * (D - U) / 2);
		String s1 = String.format("%.2f", S);
		String s2 = String.format("%.2f", L);
		System.out.println(s1);
		System.out.println(s2);
		cin.close();
	}
}

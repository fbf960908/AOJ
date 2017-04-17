package AOJ;

import java.util.Scanner;
import java.lang.Math;

public class P1064 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			double r = cin.nextDouble();
			double Area;
			Area = Math.PI * r * r * r * 4 / 3;
			String c = String.format("%.3f", Area);
			System.out.println(c);
		}
		cin.close();
	}
}

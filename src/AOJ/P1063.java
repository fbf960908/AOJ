package AOJ;

import java.util.Scanner;
import java.lang.Math;

public class P1063 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			double x1 = cin.nextDouble();
			double y1 = cin.nextDouble();
			double x2 = cin.nextDouble();
			double y2 = cin.nextDouble();
			double l;
			l = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
			String c = String.format("%.2f", l);
			System.out.println(c);
		}
		cin.close();
	}
}

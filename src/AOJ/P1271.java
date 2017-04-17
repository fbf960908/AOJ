package AOJ;

import java.util.Scanner;
import java.lang.Math;

public class P1271 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		double r = cin.nextDouble();
		double h = cin.nextDouble();
		double Area;
		Area = Math.PI * r * r * 2 + h * 2 * Math.PI * r;
		String c = String.format("%.3f", Area);
		System.out.println("Area=" + c);
		cin.close();
	}

}

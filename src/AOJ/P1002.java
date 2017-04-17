package AOJ;

import java.util.Scanner;

public class P1002 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		double a = cin.nextDouble();
		double b = cin.nextDouble();
		double c = cin.nextDouble();
		double x1, x2;
		double delta = b * b - 4 * a * c;
		x1 = (-b + Math.sqrt(delta)) / (2 * a);
		x2 = (-b - Math.sqrt(delta)) / (2 * a);
		String string = String.format("%.2f %.2f", x1, x2);
		System.out.println(string);
		cin.close();
	}
}
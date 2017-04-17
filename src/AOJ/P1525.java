package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1525 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		double H = cin.nextDouble();
		double h = cin.nextDouble();
		double R = cin.nextDouble();
		double r = cin.nextDouble();
		double pi = 3.1415926;
		double r0 = R - (H - h) * (R - r) / H;
		double V = 1.0 / 3 * pi * h * (r0 * r0 + r * r + r0 * r);
		System.out.printf("%.2f\n", V);
		cin.close();
		cout.close();
	}
}

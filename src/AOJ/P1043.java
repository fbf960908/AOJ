package AOJ;

import java.util.Scanner;

public class P1043 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		double a = cin.nextDouble();
		double sum = 1.0;
		for (int i = 2; i <= a; i++)
			sum -= 1.0 / Math.pow(i, 2.0);
		String str = String.format("%.6f", sum);
		System.out.println(str);
		cin.close();
	}
}

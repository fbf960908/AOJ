package AOJ;

import java.util.Scanner;

public class P1281 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		double sum;
		if (a > 3)
			sum = a * 95 * 0.85;
		else
			sum = a * 95;
		String str = String.format("%.2f", sum);
		System.out.println(str);
	}
}

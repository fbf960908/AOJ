package AOJ;

import java.util.Scanner;

public class P1041 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += 1.0 / i;
		}
		String string = String.format("%.6f", sum);
		System.out.println(string);
	}

}

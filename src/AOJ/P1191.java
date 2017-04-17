package AOJ;

import java.util.Scanner;

public class P1191 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			double a = cin.nextDouble();
			if (Math.cbrt(a) % 1.0 == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		cin.close();
	}
}

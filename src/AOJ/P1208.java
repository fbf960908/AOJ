package AOJ;

import java.util.Scanner;

public class P1208 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		while (n-- > 0) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int x, y;
			for (x = 0; x <= a; x++) {
				y = a - x;
				if (x * 2 + y * 4 == b) {
					System.out.println(x + " " + y);
					break;
				}
				if (x == a)
					System.out.println("No answer");
			}
		}
	}
}

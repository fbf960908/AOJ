package AOJ;

import java.util.Scanner;

public class P1526 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int x = cin.nextInt();
		int y = cin.nextInt();
		if (y == 1 || y == 3 || y == 5 || y == 7 || y == 8 || y == 10 || y == 12)
			System.out.println("31");
		if (y == 4 || y == 6 || y == 9 || y == 11)
			System.out.println("30");
		if (y == 2)
			year(x);
	}

	private static void year(int x) {
		if (x % 400 == 0)
			System.out.println("29");
		else if (x % 100 == 0)
			System.out.println("28");
		else if (x % 4 == 0)
			System.out.println("29");
		else
			System.out.println("28");
	}
}

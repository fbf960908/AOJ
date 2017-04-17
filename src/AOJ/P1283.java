package AOJ;

import java.util.Scanner;

public class P1283 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		int c = cin.nextInt();
		if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)
			System.out.println("yes");
		else
			System.out.println("not a triangle");
		cin.close();
	}
}

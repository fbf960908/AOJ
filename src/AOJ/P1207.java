package AOJ;

import java.util.Scanner;

public class P1207 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int num = cin.nextInt();
			if (num == 0)
				break;
			int a, b, c;
			a = num / 100;
			b = num % 100 / 10;
			c = num % 10;
			if (a * a * a + b * b * b + c * c * c == num)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		cin.close();
	}
}
package AOJ;

import java.util.Scanner;

public class P1057 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int x = cin.nextInt();
		int y = cin.nextInt();
		int sum = 0;
		for (int i = x; i <= y; i++) {
			if (i % 3 == 1 && i % 5 == 3)
				sum += i;
		}
		System.out.println(sum);
		cin.close();
	}
}

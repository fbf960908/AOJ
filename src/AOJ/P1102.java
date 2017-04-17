package AOJ;

import java.util.Scanner;

public class P1102 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int s1 = 0, s2 = 0;
			for (int i = a; i <= b; i++) {
				if (i % 2 == 0)
					s1 += i * i;
				else
					s2 += i * i * i;
			}
			System.out.println(s1 + " " + s2);
		}
		cin.close();
	}
}

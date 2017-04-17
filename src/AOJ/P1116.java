package AOJ;

import java.util.Scanner;

public class P1116 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int n = 0;
		for (int i = 1; i <= a; i++) {
			if (i % 7 == 0) {
				n++;
				continue;
			}
			String str = String.valueOf(i);
			if (str.contains("7")) {
				n++;
				continue;
			}
		}
		System.out.println(n);
		cin.close();
	}
}

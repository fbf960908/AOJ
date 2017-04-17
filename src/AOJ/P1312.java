package AOJ;

import java.util.Scanner;

public class P1312 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String s = cin.next();
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.substring(i, i + 1));
		}
		cin.close();
	}
}

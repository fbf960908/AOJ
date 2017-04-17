package AOJ;

import java.util.Scanner;

public class P1021 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String str = cin.nextLine();
		int n = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).matches("[a-zA-Z]"))
				n++;
		}
		System.out.println(n);
		cin.close();
	}
}

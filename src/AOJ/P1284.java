package AOJ;

import java.util.Scanner;

public class P1284 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		if (n % 4 != 0)
			System.out.println("no");
		else if (n % 400 == 0)
			System.out.println("yes");
		else
			System.out.println("no");
		cin.close();
	}

}

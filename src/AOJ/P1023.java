package AOJ;

import java.util.Scanner;

public class P1023 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int max = -1;
		while (cin.hasNext()) {
			int a = cin.nextInt();
			if (a == -1)
				break;
			if (max < a)
				max = a;
		}
		System.out.println(max);
	}

}

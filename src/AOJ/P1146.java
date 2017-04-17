package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1146 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int num = 0;
		while (cin.hasNext()) {
			int a = cin.nextInt();
			if (a == 0)
				break;
			for (int i = 1; i <= Math.pow(a, 1.0 / 3) + 1; i++) {
				if (a == Math.pow(i, 3))
					num++;
			}
		}
		System.out.println(num);
		cin.close();
		cout.close();
	}
}

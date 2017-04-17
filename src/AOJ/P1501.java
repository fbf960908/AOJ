package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1501 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int p = cin.nextInt();
			int m = cin.nextInt();
			if (a * p * m == 0)
				break;
			int num = a;
			for (int i = 1; i < p; i++) {
				num = (num * a) % m;
			}
			System.out.println(num);
		}
		cin.close();
		cout.close();
	}
}

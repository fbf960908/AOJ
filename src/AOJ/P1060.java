package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1060 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int n = cin.nextInt();
			if (n == 0)
				break;
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = cin.nextInt();
			}
			for (int i = 0; i < n - 1; i++) {
				for (int j = 0; j < n - 1 - i; j++) {
					if (Math.abs(a[j]) < Math.abs(a[j + 1])) {
						a[j] = a[j] ^ a[j + 1];
						a[j + 1] = a[j] ^ a[j + 1];
						a[j] = a[j] ^ a[j + 1];
					}
				}
			}
			for (int i = 0; i < n; i++) {
				if (i != n - 1)
					System.out.print(a[i] + " ");
				else
					System.out.print(a[i]);
			}
			System.out.println();
		}
		cin.close();
		cout.close();
	}

}

package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1805星际交流丶排列问题 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int n = cin.nextInt();
		int m = cin.nextInt();
		int[] a = new int[10001];
		for (int i = n - 1; i >= 0; i--) {
			a[i] = cin.nextInt();
		}
		a[n] = Integer.MAX_VALUE;
		while (m-- > 0) {
			int j = 1;
			while (a[j] > a[j - 1]) {
				j++;
			}
			int t = n;
			for (int k = 0; k < j; k++) {
				if ((a[k] < a[t]) && (a[k] > a[j])) {
					t = k;
				}
			}
			int temp = a[t];
			a[t] = a[j];
			a[j] = temp;
			for (int i = 0; i < (j / 2); i++) {
				t = a[i];
				a[i] = a[j - i - 1];
				a[j - i - 1] = t;
			}
		}
		for (int i = n - 1; i > 0; i--) {
			System.out.print(a[i] + " ");
		}
		System.out.println(a[0]);
		cin.close();
		cout.close();
	}
}
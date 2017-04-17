package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1055 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int m = cin.nextInt();
		int n = cin.nextInt();
		int[] a = new int[m];
		int[] b = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = cin.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = cin.nextInt();
		}
		int mini = Integer.MAX_VALUE;

		int i = 0, j = 0;
		while (i < m && j < n)
			if (a[i] >= b[j]) {
				if (mini > a[i] - b[j])
					mini = a[i] - b[j];
				j++;
			} else {
				if (mini > b[j] - a[i])
					mini = b[j] - a[i];
				i++;
			}
		System.out.println(mini);
		cin.close();
		cout.close();
	}
}

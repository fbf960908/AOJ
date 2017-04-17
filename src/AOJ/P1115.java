package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1115 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int n = cin.nextInt();
		int[] count = new int[10];
		for (int i = 1; i <= n; i++) {
			for (int t = i; t > 0; t /= 10) {
				count[t % 10]++;
			}
		}
		for (int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}
		cin.close();
		cout.close();
	}
}

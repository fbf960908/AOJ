package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1112 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = cin.nextInt();
		while (N-- > 0) {
			int[] s = new int[9];
			for (int i = 0; i < s.length; i++) {
				s[i] = cin.nextInt();
			}
			int num = s[0];
			for (int i = 1; i < s.length; i++) {
				if (s[i] < num) {
					int a = s[i];
					for (int j = i; j > 0; j--) {
						s[j] = s[j - 1];
					}
					s[0] = a;
				}
			}
			for (int i = 0; i < s.length - 1; i++) {
				System.out.print(s[i] + " ");

			}
			System.out.println(s[s.length - 1]);
		}
		cin.close();
		cout.close();
	}
}

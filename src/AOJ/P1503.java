package AOJ;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1503 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int N = cin.nextInt();
			int[] s = new int[N];
			int num = 0;
			for (int i = 0; i < s.length; i++) {
				s[i] = cin.nextInt();
			}
			Arrays.sort(s);
			for (int i = 0; i < s.length; i++) {
				for (int j = i + 1; j < s.length; j++) {
					if (gcd(s[i], s[j]) == 1)
						num++;
				}
			}
			System.out.println(num);
		}
		cin.close();
		cout.close();
	}

	private static int gcd(int a, int b) {
		return b > 0 ? gcd(b, a % b) : a;
	}

}
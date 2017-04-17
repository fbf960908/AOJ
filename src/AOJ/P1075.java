package AOJ;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1075 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = cin.nextInt();
		int[] ss = new int[N];
		for (int i = 0; i < ss.length; i++) {
			ss[i] = cin.nextInt();
		}
		Arrays.sort(ss);

		int num = 1;
		int s = ss[0];
		int max = 0;
		for (int i = 1; i < ss.length; i++) {
			if (ss[i] == ss[i - 1]) {
				num++;
			} else {
				if (num > max) {
					max = num;
					s = ss[i - 1];
				}
				num = 1;
			}
		}

		System.out.println(s);
		System.out.println(max);
		cin.close();
		cout.close();
	}
}

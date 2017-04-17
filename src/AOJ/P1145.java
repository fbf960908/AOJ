package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1145 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int[] ss = new int[26];
		for (int i = 0; i < ss.length; i++) {
			ss[i] = 0;
		}
		while (cin.hasNext()) {
			String s = cin.next();
			for (int i = 0; i < s.length(); i++) {
				char a = s.charAt(i);
				if (a == '#') {
					char start = 'a';
					for (int j = 0; j < ss.length; j++) {
						System.out.println(start + " " + ss[j]);
						start++;
					}
					break;
				}
				if (a >= 'a' && a <= 'z')
					ss[(int) a - 97]++;
			}
		}
		cin.close();
		cout.close();
	}
}

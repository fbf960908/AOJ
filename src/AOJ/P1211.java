package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1211 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = cin.nextInt();
		while (N-- > 0) {
			String str = Integer.toBinaryString(cin.nextInt());
			for (int i = 0; i < 32 - str.length(); i++) {
				System.out.print("0");
			}
			System.out.println(str);
		}
		cin.close();
		cout.close();
	}
}
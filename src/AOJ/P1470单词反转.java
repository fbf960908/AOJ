package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1470单词反转 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			String str = cin.nextLine();
			String danci[] = str.split("\\.\\s*|\\s+|\\W+\\s*");
			String fuhao[] = str.split("\\w+");
			for (int i = 0; i < danci.length; i++) {
				StringBuffer ss = new StringBuffer(danci[i]);
				ss.reverse();
				System.out.print(ss + fuhao[i + 1]);
			}
			System.out.println();
		}
		cin.close();
		cout.close();
	}
}
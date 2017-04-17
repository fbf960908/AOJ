package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1268 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int aa = Integer.parseInt(new StringBuffer(new String().valueOf(a)).reverse().toString());
			int bb = Integer.parseInt(new StringBuffer(new String().valueOf(b)).reverse().toString());
			System.out.println(aa * bb);
		}
		cin.close();
		cout.close();
	}
}

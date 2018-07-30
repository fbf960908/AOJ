package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1460Alice的车牌号 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = cin.nextInt();
		int i = 1;
		while (N-- > 0) {
			String str = cin.next();
			String str1 = str.replaceAll("13", "");
			if (str.equals(str1)) {
				System.out.println("Case #" + (i++) + ": Yes, I like it!");
			} else {
				System.out.println("Case #" + (i++) + ": No, it's terrible!");
			}
		}
		cin.close();
		cout.close();
	}
}
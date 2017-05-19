package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1633 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(cin.hasNext()){
			int a = cin.nextInt();
			int b = cin.nextInt();
			int c = cin.nextInt();
			int x = a*b/gcd(a, b);
			int y = x*c/gcd(x, c);
			System.out.println(y);
		}
		cin.close();
		cout.close();
	}
	
	private static int gcd(int a, int b) {
		return b > 0 ? gcd(b, a % b) : a;
	}
}

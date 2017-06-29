package AOJ;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class P1039 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		BigInteger ret = BigInteger.ONE;// new BigInteger("1");
		for (int i = 2; i <= 1977; i++) {
			BigInteger cur = new BigInteger(Integer.toString(i));// i+""
			ret = ret.multiply(cur);
		}
		cout.println(ret);
		cin.close();
		cout.close();
	}
}

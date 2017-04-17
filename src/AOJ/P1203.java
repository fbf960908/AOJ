package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1203 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		String str = cin.nextLine();
		String arr[] = str.split("\\.\\s*|\\s+|\\W+\\s*");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		cin.close();
		cout.close();
	}
}
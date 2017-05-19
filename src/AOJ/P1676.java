package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1676 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(cin.hasNext()){
			String str = cin.nextLine();
			String [] ss = str.split("\\s");
			System.out.println(ss.length);
		}
		cin.close();
		cout.close();
	}
}

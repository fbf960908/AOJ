package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1332 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(cin.hasNext()){
			int a = cin.nextInt();
			int b = cin.nextInt();
			int ans = 1;
			for (int i = 0; i < b; i++) {
				ans *= a;
				ans %= 1000;
			}
			if(ans>=100)
				System.out.println(ans);
			else if(ans >= 10)
				System.out.println("0"+ans);
			else
				System.out.println("00"+ans);
		}
		cin.close();
		cout.close();
	}
	
}

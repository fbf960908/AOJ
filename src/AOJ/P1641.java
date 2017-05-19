package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1641 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int N = cin.nextInt();
			int ans = 0;
			for (int i = 0; i < N; i++) {
				int s=cin.nextInt();
                if((s>0 && s<50) || (s>-100 && s<-50))
                    ans++;
			}
			System.out.println(ans+1);
		}
		cin.close();
		cout.close();
	}
}
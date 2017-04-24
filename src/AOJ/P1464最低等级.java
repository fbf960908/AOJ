package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1464×îµÍµÈ¼¶ {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = cin.nextInt();
        int i = 1;
        while (N-- > 0) {
            int n = cin.nextInt();
            int num = 0;
            while (n % 2 == 0) {
                num++;
                n /= 2;
            }
            int a = (int) Math.pow(2, num);
            System.out.println("Case #" + (i++) + ": " + a);
        }
		cin.close();
		cout.close();
	}
}
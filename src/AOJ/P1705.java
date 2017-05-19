package AOJ;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1705 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	final static int N = 5000;

	public static void main(String[] args) {
		int T = cin.nextInt();
		while (T-->0) {
			int N = cin.nextInt();
			int [] a = new int [N];
			int [] b = new int [N];
			for (int i = 0; i < N; i++) {
				a[i]= cin.nextInt();
			}
			for (int i = 0; i < N; i++) {
				b[i]= cin.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			int sum = 0;
			for (int i = 0; i < N; i++) {
				sum += a[i]*b[N-1-i]; 
			}
			System.out.println(sum);
		}
		cin.close();
		cout.close();
	}
}
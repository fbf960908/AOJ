package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1491一道简单的几何变换 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = cin.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		for (int i = 0; i < N; i++) {
			x[i] = cin.nextInt();
			y[i] = cin.nextInt();
		}
		int M = cin.nextInt();
		int xa=1,xb=0,ya=1,yb=0;
		for (int i = 0; i < M; i++) {
			int a = cin.nextInt();
			if (a == 1) {
				int p = cin.nextInt();
				int q = cin.nextInt();
				xb+=p;
				yb+=q;
			}
			else if (a == 2) {
				int l = cin.nextInt();
				xa*=l;
				xb*=l;
				ya*=l;
				yb*=l;
			}
			else if (a == 3) {
				ya*=-1;
				yb*=-1;
			}
			else if (a == 4) {
				xa*=-1;
				xb*=-1;
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.println((x[i]*xa+xb)+" "+(y[i]*ya+yb));
		}
		cin.close();
		cout.close();
	}
}
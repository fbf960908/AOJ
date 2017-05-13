package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1438 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static final long[][] unit = { { 1, 1 }, { 1, 0 } };// 单位矩阵

	public static void main(String[] args) {
		while (cin.hasNext()) {
			long a = cin.nextLong();
			if (a == -1)
				break;
			long ss = mul_Power(unit, a)[0][1] % 10000;
			System.out.println(ss);
		}
		cin.close();
		cout.close();
	}

	public static long[][] mul(long[][] a, long[][] b) {// 矩阵乘法
		long[][] arr = new long[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					arr[i][j] += a[i][k] * b[k][j] % (10000);
				}
			}
		}
		return arr;
	}

	public static long[][] mul_Power(long[][] a, long n) {// 矩阵快速幂
		long[][] res = new long[a.length][a[0].length];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				if (i == j)
					res[i][j] = 1;
				else
					res[i][j] = 0;
			}
		}
		while (n != 0) {
			if ((n & 1) == 1)
				res = mul(res, a);
			n >>= 1;
			a = mul(a, a);
		}
		return res;
	}
}

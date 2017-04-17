package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1439M斐波那契数列矩阵快速幂 {
	/*
	 * F(n) = a^f(n-1)*b^f(n)
	 */
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static final long[][] unit = { { 1, 1 }, { 1, 0 } };// 单位矩阵
	static final long le9 = 1000000007;

	public static long mul(long a, long b, long c) {// 快速乘法
		long ans = 0, tmp = a % c;
		while (b != 0) {
			if ((b & 1) == 1)
				if ((ans += tmp) >= c)
					ans -= c;
			if ((tmp <<= 1) >= c)
				tmp -= c;
			b >>= 1;
		}
		return ans;
	}

	public static long mul_mod(long a, long b, long c) {// 快速幂取模
		long ret = 1 % c;
		while (b != 0) {
			if ((b & 1) == 1)
				ret = mul(ret, a, c);
			a = mul(a, a, c);
			b >>= 1;
		}
		return ret;
	}

	public static long[][] mul(long[][] a, long[][] b) {// 矩阵乘法
		long[][] arr = new long[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					arr[i][j] += a[i][k] * b[k][j] % (le9 - 1);
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

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int n = cin.nextInt();
			if (a * b == 0) {
				System.out.println("0");
				continue;
			}
			long anum = mul_Power(unit, n - 1)[0][1];
			long bnum = mul_Power(unit, n)[0][1];
			System.out.println(mul_mod(a, anum, le9) * mul_mod(b, bnum, le9) % le9);
		}
		cin.close();
		cout.close();
	}
}

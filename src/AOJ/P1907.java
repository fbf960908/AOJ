package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1907 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static int N = 2005;
	static int l, r, lv, rv, lmax, rmax, O;
	static int[] f = new int[N];

	public static void main(String[] args) {
		while (cin.hasNext()) {
			l = cin.nextInt();
			r = cin.nextInt();
			if (l == 0 && r == 0)
				break;
			init();
			System.out.println(solve());
		}

		cin.close();
		cout.close();
	}

	static void init() {
		O = -l;
		for (int i = l; i <= r; i += 2)
			f[i + O] = cin.nextInt();
		lv = -1;
		rv = 1;
		lmax = f[lv + O];
		rmax = f[rv + O];
	}

	static int solve() {
		int ans = 0, i, lt = 0, rt = 0;
		for (i = -1; i >= l; i -= 2) {
			if (f[i + O] > lmax) {
				lmax = f[i + O];
				lv = i;
			}
		}
		for (i = 1; i <= r; i += 2) {
			if (f[i + O] > rmax) {
				rmax = f[i + O];
				rv = i;
			}
		}
		int ll = l;
		for (i = l; i <= lv; i += 2) {
			if (f[i + O] >= f[ll + O]) {
				lt += (i - ll) * f[ll + O];
				ll = i;
			}
		}
		int rr = r;
		for (i = r; i >= rv; i -= 2) {
			if (f[i + O] >= f[rr + O]) {
				rt += (rr - i) * f[rr + O];
				rr = i;
			}
		}
		if (lmax == rmax)
			ans = (rv - lv) * lmax + (Math.min(lt, rt)) * 2;
		else {
			if (lmax > rmax) {
				for (i = -1; i >= l; i -= 2)
					if (f[i + O] >= rmax) {
						lmax = f[i + O];
						lv = i;
						break;
					}
				if (lmax == rmax) {
					int lvv = lv;
					for (i = lv; i >= l; i -= 2) {
						if (f[i + O] > rmax) {
							lmax = f[i + O];
							lvv = i;
							break;
						}
					}
					ans = (rv - lv) * rmax + (Math.min((lv - lvv) * rmax, rt)) + rt;
				} else
					ans = rmax * (rv - lv) + rt;
			} else {
				for (i = 1; i <= r; i += 2)
					if (f[i + O] >= lmax) {
						rmax = f[i + O];
						rv = i;
						break;
					}
				if (lmax == rmax) {
					int rvv = rv;
					for (i = rv; i <= r; i += 2) {
						if (f[i + O] > lmax) {
							rmax = f[i + O];
							rvv = i;
							break;
						}
					}
					ans = (rv - lv) * lmax + (Math.min((rvv - rv) * lmax, lt)) + lt;
				} else
					ans = lmax * (rv - lv) + lt;
			}
		}
		return ans;
	}
}
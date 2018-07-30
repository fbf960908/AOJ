package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1807最大体积 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static int[] a = new int[500];
	static int[] f = new int[100001];

	public static void main(String[] args) {
		int n = cin.nextInt();
		int ans = -1;
		for (int i = 1; i <= n; i++) {
			a[i] = cin.nextInt();
		}
		int t = a[1];
		for (int i = 2; i <= n; i++) {
			t = gcd(t, a[i]);
		}

		if (t != 1) {// �����Լ����Ϊ1��ʾ�н�����ʾ�����������Ե���
			System.out.println("0");
		} else {
			f[0] = 1;// �����ԭ�������ֻ���0�������Լ������ֱ����ܴﵽ
			for (int i = 1; i <= n; i++) {
				for (int j = a[i]; j <= 65536; j++)
				 {
					f[j] |= f[j - a[i]];
				// �ڵ�ǰ����j�Ƿ���Դﵽ ����i=0��˵���ǵ�һ�����ı��� ,������������˵������ǰ��Ϊ������һ��arr[i]�ܷ񵽴�
				}
			}
			for (int i = 65536; i >= 0; i--) {
				if (f[i] == 0) {
					ans = i;
					break;
				}
			}
			System.out.println(ans == -1 ? "0" : ans);
		}
	}

	public static int gcd(int a, int b) {
		if (a > b) {
			gcd(b, a);
		}
		if (a == 0) {
			return b;
		}
		return gcd(b % a, a);
	}
}
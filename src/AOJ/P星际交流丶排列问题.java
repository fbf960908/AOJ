package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P星际交流丶排列问题 {
	/*
	 * 规律：从右边开始向左扫描，找到前一个比后一个小的位置i，假设该位置的数字用a表示，然后从这个位置的下一个位置开始向右边找，
	 * 找到比a大的且与a接近的数，设该数用b表示，位置用j表示。交换a，b，然后将第i+1到最后一个数按小到的顺序排序，即得到一个新的排列。
	 * 如12354到12435，a=3，i=3，b=4，j=5，作如下变化： 找位置，换位置 排序 12354 → 12453 → 12435
	 * 根据分析，采用逆序输入更好处理了！加上m其实就是求这个排列为第一个，求第m个排列！
	 */
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int n = cin.nextInt();
		int m = cin.nextInt();
		int[] a = new int[10001];
		for (int i = n - 1; i >= 0; i--) {
			a[i] = cin.nextInt();
		}
		a[n] = Integer.MAX_VALUE;
		while (m-- > 0) {
			int j = 1;
			while (a[j] > a[j - 1])
				j++;
			int t = n;
			for (int k = 0; k < j; k++)
				if ((a[k] < a[t]) && (a[k] > a[j]))
					t = k;
			int temp = a[t];
			a[t] = a[j];
			a[j] = temp;
			for (int i = 0; i < (j / 2); i++) {
				t = a[i];
				a[i] = a[j - i - 1];
				a[j - i - 1] = t;
			}
		}
		for (int i = n - 1; i > 0; i--) {
			System.out.print(a[i] + " ");
		}
		System.out.println(a[0]);
		cin.close();
		cout.close();
	}
}
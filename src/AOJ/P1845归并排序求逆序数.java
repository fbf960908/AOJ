package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1845归并排序求逆序数 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int N = cin.nextInt();
			int[] ss = new int[N];
			for (int i = 0; i < ss.length; i++) {
				ss[i] = cin.nextInt();
			}
			System.out.println(sort(ss, 0, N - 1));
		}
		cin.close();
		cout.close();
	}

	public static long sort(int[] array, int p, int r) {
		if (p < r) {
			int q = p + (r - p) / 2;
			long len1 = sort(array, p, q); // ����������
			long len2 = sort(array, q + 1, r);
			long count = merge(array, p, q, r);

			return len1 + len2 + count;
		} else {
			return 0;
		}
	}

	public static long merge(int[] array, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] array1 = new int[n1 + 1];
		int[] array2 = new int[n2 + 1];
		array1[n1] = Integer.MAX_VALUE;
		array2[n2] = Integer.MAX_VALUE;
		for (int i = 0; i < n1; i++) {
			array1[i] = array[p + i];
		}

		for (int i = 0; i < n2; i++) {
			array2[i] = array[q + 1 + i];
		}

		int index1 = 0, index2 = 0;
		long count = 0;
		for (int i = p; i <= r; i++) {
			if (array1[index1] <= array2[index2]) {
				array[i] = array1[index1++];
			} else {
				array[i] = array2[index2++];
				count += n1 - index1;// ������������ʣ�¼���key����һ��key��array2[index2]��Ҳ�����м�������ԡ�
			}
		}
		return count;
	}
}

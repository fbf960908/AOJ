package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1809比赛安排 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static int[][] a = new int[65][65];
	static int[] v = new int[65];

	public static void main(String[] args) {
		int n = cin.nextInt();
		int day = (int)Math.pow(2, n);	
		for (int i = 0; i < day-1; i++) {
			System.out.print("<" + (i + 1) + ">");
			for (int s = 0; s < v.length; s++) {
				v[s] = 0;
			}
			for (int j = 0; j < day / 2; j++) { // ÿ��n��
				for (int k = 1; k <= day; k++) { // ����һ
					if (v[k] == 1) {
						continue;
					}
					int judge = 0; // �ж�k��h������������������������첻�ٻ������ǵı���
					for (int h = 1; h <= day; h++) { // ����һ��
						if (k == h) {
							continue;
						}
						if (v[h] == 1) {
							continue;
						}
						if (a[k][h] == 0 && a[h][k] == 0) { // h��k����������Ƿ���һ�����
							System.out.print(k + "-" + h+ " ");
							v[h] = 1; // ���h������첻�ٱ�������
							v[k] = 1; // ���k������첻�ٱ�������
							a[k][h] = 1; // ���h��k�����Ѿ�����
							judge = 1; // ��ǵ�j��������������һ��
							break;
						}
					}
					if (judge == 1) {
						break;
					}
				}
			}
			System.out.println();
		}
	}
}
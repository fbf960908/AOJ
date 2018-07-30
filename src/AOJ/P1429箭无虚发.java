package AOJ;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class gong implements Comparable<gong> {
	int you;
	int liang;
	int zhong;

	@Override
	public int compareTo(gong o) {
		return this.you - o.you;
	}
}

public class P1429箭无虚发 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = cin.nextInt();
		while (N-- > 0) {
			int n = cin.nextInt();
			gong[] ss = new gong[n];
			for (int i = 0; i < n; i++) {
				ss[i] = new gong();
				ss[i].you = cin.nextInt();
				ss[i].liang = cin.nextInt();
				ss[i].zhong = cin.nextInt();
				ss[i].you -= ss[i].zhong; 
			}
			int t = cin.nextInt();

			int sum = 0;
			for (gong element : ss) {
				sum += element.zhong;
			}
			if (sum > t) {
				System.out.println("Oh,my god!");
				continue;
			}

			Arrays.sort(ss);
			int ans = 0;
			for (gong element : ss) {
				if (sum + element.you <= t) {
					sum += element.you;
					ans++;
				} else {
					break;
				}
			}
			System.out.println(ans);
		}
		cin.close();
		cout.close();
	}
}
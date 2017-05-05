package AOJ;

import java.util.Scanner;
import java.util.TreeSet;

public class P1581 {

	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		while(cin.hasNext()){
			int N = cin.nextInt();
			TreeSet<Integer> ss = new TreeSet<Integer>();
			for (int i = 0; i < N; i++) {
				ss.add(cin.nextInt());
			}
			System.out.println(ss.size());
			Object[] s = ss.toArray();
			for (int i = 0; i < s.length-1; i++) {
				System.out.print(s[i]+" ");
			}
			System.out.println(s[s.length-1]);
		}
		cin.close();
	}
}
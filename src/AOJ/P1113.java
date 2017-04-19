package AOJ;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1113 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(cin.hasNext()){
			int n = cin.nextInt();
			int m = cin.nextInt();
			if(n==0&&m==0)
				break;
			int [] s = new int [n+1];
			s[0] = m;
			for (int i = 1; i < s.length; i++) {
				s[i] = cin.nextInt();
			}
			Arrays.sort(s);
			for (int i = 0; i < s.length-1; i++) {
				System.out.print(s[i]+" ");
			}
			System.out.println(s[s.length-1]);
		}
		cin.close();
		cout.close();
	}
}
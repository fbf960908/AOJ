package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1442船体强度 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(cin.hasNext()){
			int N = cin.nextInt();
			int T = cin.nextInt();
			int ans = 0;
			while(T-->0){
				if(N<=1) {
					break;
				}
				N /= 2;
				ans++;
			}
			if(N>1){
				System.out.println("Impossible");
			} else {
				System.out.println(ans);
			}
		}
		cin.close();
		cout.close();
	}
}
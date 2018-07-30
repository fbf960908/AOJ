package AOJ;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1487中位数{

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(cin.hasNext()){
			int N = cin.nextInt();
			int[] ss = new int [N];
			for (int i = 0; i < N; i++) {
				ss[i] = cin.nextInt();
			}
			Arrays.sort(ss);
			if(N%2==1){
				String str = String.format("%.2f", (double)ss[N/2]);
				System.out.println(str);
			}
			else{
				String str = String.format("%.2f", (ss[(N - 1) / 2] + ss[N / 2]) / 2.0);
				System.out.println(str);
			}
		}
		cin.close();
		cout.close();
	}
}
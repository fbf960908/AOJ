package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1485路边骗局{

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(cin.hasNext()){
			int N = cin.nextInt();
			int sum = 0;
	        for(int i = 0; i < N; i++){
	            int x = cin.nextInt();
	            sum ^= x;
	        }
	        if(sum>0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		cin.close();
		cout.close();
	}
}
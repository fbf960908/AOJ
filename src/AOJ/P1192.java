package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1192 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(cin.hasNext()){
			int N = cin.nextInt();
			int [] s = new int [N];
			int max=0,length=1;
			for (int i = 0; i < s.length; i++) {
				s[i] = cin.nextInt();
			}
			for (int i = 1; i < s.length; i++) {
				if(s[i]==s[i-1]){
					length++;
				}
				if(s[i]!=s[i-1]){
					if(length>max)
						max=length;
					length = 1;
				}
			}
			System.out.println(max);
		}
		cin.close();
		cout.close();
	}
}
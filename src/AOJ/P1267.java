package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1267 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(cin.hasNext()){
			String str = cin.nextLine();
			if(str.equals("END"))
				break;
			char[]s = str.toCharArray();
			for (int i = 0; i < s.length; i++) {
				if(s[i]=='A'||s[i]=='w'||s[i]=='f')
					s[i]='I';
				else if(s[i]=='C')
					s[i]='L';
				else if(s[i]=='M')
					s[i]='o';
				else if(s[i]=='S')
					s[i]='v';
				else if(s[i]=='D'||s[i]=='P'||s[i]=='G'||s[i]=='B')
					s[i]='e';
				else if(s[i]=='L')
					s[i]='Y';
				else if(s[i]=='X')
					s[i]='u';
			}
			for (int i = 0; i < s.length; i++) {
				System.out.print(s[i]);
			}
			System.out.println();
		}
		cin.close();
		cout.close();
	}
}
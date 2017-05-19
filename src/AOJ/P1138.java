package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1138 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(cin.hasNext()){
			String str = cin.nextLine();
			char [] ss = str.toCharArray();
			for (int i = 0; i < ss.length; i++) {
				if(ss[i]=='a'||ss[i]=='b'||ss[i]=='c')
					ss[i] = '2';
				else if(ss[i]=='d'||ss[i]=='e'||ss[i]=='f')
					ss[i] = '3';
				else if(ss[i]=='g'||ss[i]=='h'||ss[i]=='i')
					ss[i] = '4';
				else if(ss[i]=='j'||ss[i]=='k'||ss[i]=='l')
					ss[i] = '5';
				else if(ss[i]=='m'||ss[i]=='n'||ss[i]=='o')
					ss[i] = '6';
				else if(ss[i]=='p'||ss[i]=='q'||ss[i]=='r'||ss[i]=='s')
					ss[i] = '7';
				else if(ss[i]=='t'||ss[i]=='u'||ss[i]=='v')
					ss[i] = '8';
				else if(ss[i]=='w'||ss[i]=='x'||ss[i]=='y'||ss[i]=='z')
					ss[i] = '9';
				else if(ss[i]>='A'&&ss[i]<='Y')
					ss[i] = (char)(ss[i]+33);
				else if(ss[i]=='Z')
					ss[i] = 'a';
			}
			for (char c : ss) {
				System.out.print(c);
			}
			System.out.println();
		}
		cin.close();
		cout.close();
	}
}

package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class P1319 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String args[]) {
		int s = cin.nextInt();
		while(s-->0){
			String s1 = cin.next();
			String s2 = cin.next();
			TreeSet<Character> ss1 = new TreeSet<Character>();
			TreeSet<Character> ss2 = new TreeSet<Character>();
			for (int i = 0; i < s1.length(); i++) {
				ss1.add(s1.charAt(i));
			}
			for (int i = 0; i < s2.length(); i++) {
				ss2.add(s2.charAt(i));
			}
			if(ss1.equals(ss2)){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
	}
}
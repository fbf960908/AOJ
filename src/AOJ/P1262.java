package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1262 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(cin.hasNext()){
			double a = cin.nextDouble();
			int num=0;
			while(a>=2){
				if(a%2==0){
					a/=2;
				}
				else{
					num++;
					a/=2;
				}
			}
			System.out.println(num%2!=0?"even":"odd");
		}
		cin.close();
		cout.close();
	}
}

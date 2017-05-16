package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		
	}
}

class number {
	public static void tongji(String str) {
		// 统计元素个数
		// e表示需要匹配的数据，使用Pattern建立匹配模式
		Pattern p = Pattern.compile("[0-9]");
		// 使用Matcher进行各种查找替换操作
		Matcher m = p.matcher(str);
		int i = 0;
		while (m.find()) {
			i++;
		}
		System.out.println(i);

	}

	private static int gcd(int a, int b) {
		return b > 0 ? gcd(b, a % b) : a;
	}
}

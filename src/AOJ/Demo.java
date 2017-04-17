package AOJ;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println('a'-'b');
	}
}

class number {
	public static void tongji(String str) {
		// 统计元素个数
		// e表示需要匹配的数据，使用Pattern建立匹配模式
		Pattern p = Pattern.compile("e");
		// 使用Matcher进行各种查找替换操作
		Matcher m = p.matcher(str);
		int i = 0;
		while (m.find()) {
			i++;
		}
		System.out.println(i);
		System.out.println(str);

	}
}

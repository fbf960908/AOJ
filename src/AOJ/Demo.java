package AOJ;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class node {
	double x, value;
}

public class Demo {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		double D1, C, D2, P, cost;
		int n;
		while (cin.hasNext()) {
			cost = 0;
			D1 = cin.nextDouble();
			C = cin.nextDouble();
			D2 = cin.nextDouble();
			P = cin.nextDouble();
			n = cin.nextInt();
			node[] station = new node[n + 2];
			for (int i = 0; i < n + 2; i++) {
				station[i] = new node();
			}
			// 构造一个序列，station[0]为起点，而n+1为终点
			station[0].x = 0;
			station[0].value = P;
			for (int i = 1; i <= n; i++) {
				station[i].x = cin.nextDouble();
				station[i].value = cin.nextDouble();
			}
			station[n + 1].x = D1;
			station[n + 1].value = 0;
			double max = C * D2;
			double least = 0;
			int st = 0;
			int min;
			while (true) {
				min = st;
				if (st >= n + 1)// 达到n+1跳出循环
					break;
				if (station[st + 1].x - station[st].x <= max) { // 如果下一个点可以达到
					min = st + 1;
				}
				if (min == st) {// 达不到终点循环结束
					break;
				}
				for (int i = st + 1; i <= n + 1; i++) {
					if (station[i].x - station[st].x > max) {
						break;
					} else {
						if (station[i].value < station[min].value)
							min = i;
					}
				}
				if (station[min].value < station[st].value) { // 如果下一点的油价比现在油价低，那么只买只能到下一个油站的油
					cost += ((station[min].x - station[st].x) / D2 - least) * station[st].value;
					least = (station[min].x - station[st].x) / D2 - least;
				} else { // 加满
					cost += (C - least) * station[st].value;
					least = C;
				}
				least -= (station[min].x - station[st].x) / D2;
				st = min;
			}
			if (st >= n + 1)
				System.out.printf("%.2f\n", cost);
			else
				System.out.println("No Solution");
		}
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

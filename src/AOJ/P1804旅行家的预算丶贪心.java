package AOJ;

import java.util.Scanner;

class node {
	double x, value;
}

public class P1804旅行家的预算丶贪心 {

	static Scanner cin = new Scanner(System.in);

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
			// ����һ�����У�station[0]Ϊ��㣬��n+1Ϊ�յ�
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
				if (st >= n + 1) {
					break;
				}
				if (station[st + 1].x - station[st].x <= max) { // �����һ������Դﵽ
					min = st + 1;
				}
				if (min == st) {// �ﲻ���յ�ѭ������
					break;
				}
				for (int i = st + 1; i <= n + 1; i++) {
					if (station[i].x - station[st].x > max) {
						break;
					} else {
						if (station[i].value < station[min].value) {
							min = i;
						}
					}
				}
				if (station[min].value < station[st].value) { // �����һ����ͼ۱������ͼ۵ͣ���ôֻ��ֻ�ܵ���һ����վ����
					cost += ((station[min].x - station[st].x) / D2 - least) * station[st].value;
					least = (station[min].x - station[st].x) / D2 - least;
				} else { // ����
					cost += (C - least) * station[st].value;
					least = C;
				}
				least -= (station[min].x - station[st].x) / D2;
				st = min;
			}
			if (st >= n + 1) {
				System.out.printf("%.2f\n", cost);
			} else {
				System.out.println("No Solution");
			}
		}
	}
}
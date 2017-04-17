package AOJ;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class P1512 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			String input = cin.nextLine();
			input = input.toLowerCase();
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			for (int i = 0; i < input.length(); i++) {
				String one = input.charAt(i) + "";
				if (null == map.get(one)) {
					map.put(one, 1);
				} else {
					map.put(one, map.get(one) + 1);
				}
			}

			List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(map.entrySet());

			Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
				public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
					return (o2.getValue() - o1.getValue());
				}
			});

			for (Entry<String, Integer> entry : list) {
				System.out.print(entry.getKey());
			}
			System.out.println();
		}
		cin.close();
		cout.close();
	}
}

package AOJ;

import java.util.Scanner;
import java.util.TreeMap;

public class P1221 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		String[] words = cin.nextLine().trim().toLowerCase().split("\\W+");
		System.out.println(words.length);

		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		for (String word : words) {
			if (map.containsKey(word)) {// log(N)
				int freq = map.get(word);
				map.put(word, freq + 1);
			} else {
				map.put(word, 1);
			}
		}
		for (String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
	}
}
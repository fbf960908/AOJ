package AOJ;

import java.util.Scanner;
 
public class P1454¹Ø¼ü´ÊÍ³¼Æ {
 
    static Scanner cin = new Scanner(System.in);
 
    public static void main(String[] args) {
        String str = cin.nextLine();
        int N = cin.nextInt();
        String a = cin.nextLine();
        String[] word = new String[N];
        for (int i = 0; i < word.length; i++) {
            word[i] = cin.nextLine();
        }
        String[] s = str.split("\\.\\s*|\\s+|\\W+\\s*");
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < s.length; j++) {
                if (word[i].toLowerCase().equals(s[j].toLowerCase()))
                    ans++;
            }
            System.out.println(ans);
            ans = 0;
        }
        cin.close();
    }
}
package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;
 
public class P1315游程编码 {
 
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);
 
    public static void main(String[] args) {
        int N = cin.nextInt();
        String z = cin.nextLine();
        while (N-- > 0) {
            String str = cin.nextLine();
            System.out.println(RunLengthEncoding(str));
        }
        cin.close();
        cout.close();
    }
 
    private static String RunLengthEncoding(String str) {
        char[] s = str.toCharArray();
        char a = s[0];
        String result = "";
        int num = 1;
        for (int i = 1; i < s.length; ++i) {
            if (s[i] == a) {
                num++;
            }
            if (s[i] != a || i == s.length - 1) {
                result = result + num;
                result = result + s[i - 1];
                num = 1;
                a = s[i];
            }
        }
        return result;
    }
}
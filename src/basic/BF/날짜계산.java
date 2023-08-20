package basic.BF;

import java.util.Scanner;

public class 날짜계산 {
    private static final int E = 15;
    private static final int S = 28;
    private static final int M = 19;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ae = sc.nextInt() % E;
        int as = sc.nextInt() % S;
        int am = sc.nextInt() % M;
        int e, s, m, y;
        e = s = m = y = 0;
        while (true) {
            e = (e + 1) % E;
            s = (s + 1) % S;
            m = (m + 1) % M;
            y++;

            if (e == ae && s == as && m == am)
                break;
        }
        System.out.println(y);
        sc.close();
    }

}

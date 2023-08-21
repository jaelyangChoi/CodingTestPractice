package basic.BF;

import java.util.Scanner;

public class 일이삼더하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while (m-- > 0) {
            int n = sc.nextInt();
            int ans = go(n, 0);
            System.out.println(ans);
        }
        sc.close();
    }


    private static int go(int n, int sum) {
        if (sum > n) return 0;
        if (sum == n) return 1;
        int cnt = 0;
        for (int i = 1; i <= 3; i++)
            cnt += go(n, sum + i);
        return cnt;
    }
}

package basic.math;

import java.util.Scanner;
import java.lang.Math;

public class 최소공배수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a, b, gcd;
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            gcd = gcd(Math.max(a, b), Math.min(a, b));
            System.out.println(a * b / gcd);
        }

        sc.close();
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}

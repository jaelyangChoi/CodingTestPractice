package basic.math;

import java.util.Scanner;
import java.lang.Math;

public class GCD와LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();

        int gcd = gcd(Math.max(i1, i2), Math.min(i1, i2));
        int lcm = gcd * (i1 / gcd) * (i2 / gcd);

        System.out.println(gcd);
        System.out.println(lcm);

        sc.close();
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}

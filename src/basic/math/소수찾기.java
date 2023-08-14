package basic.math;

import java.util.Scanner;

public class 소수찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (isPrime(x))
                sum++;
        }
        System.out.println(sum);

        sc.close();
    }

    private static boolean isPrime(int x) {
        if (x < 2)
            return false;

        for (int i = 2; i * i <= x; i++)  //2~루트x까지 약수가 존재하면
            if (x % i == 0)
                return false;

        return true;
    }
}

package basic.math;

import java.util.Scanner;

//에라토스테네스의 체 : 소수의 배수는 소수가 아니므로 지운다.
public class 소수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        boolean[] check = new boolean[n + 1]; //기본값이 false. 이걸 활용..
        check[0] = check[1] = true;

        //소수 검사는 루트 n까지만 하면 된다..
        for (int i = 2; i * i <= n; i++) {
            if (check[i]) continue; //소수가 아닌 건 패스

            //소수의 배수는 소수가 아니다
            for (int j = i * 2; j <= n; j += i)
                check[j] = true;
        }

        for (int i = m; i <= n; i++)
            if (!check[i])
                System.out.println(i);

        sc.close();
    }
}

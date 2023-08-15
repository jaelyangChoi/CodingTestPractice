package basic.math;

import java.util.Scanner;

//메모리, 시간 효율 따질게 아니라.. 최대 입력 기준으로 맞춘다. 최대 입력 시 시간 초과 나지 않으면 된다.
//모든 걸 더하고 빼고 비교할 필요가 없을 수 있지도 모른다..
public class 골드바흐의추측 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 1000000;
        //소수 리스트 구하기
        boolean[] check = new boolean[n + 1];
        check[0] = check[1] = true;
        //소수의 배수는 소수가 아니다.
        for (int i = 2; i * i <= n; i++) { //약수는 양방향
            if (check[i])
                continue;
            for (int j = i + i; j <= n; j += i)
                check[j] = true;
        }

        while (true) {
            int x = sc.nextInt();
            if (x == 0) break;
            boolean flag = true;
            //홀수 a를 구한다. 적은 수 일수록 b는 크다. b는 홀수다.
            for (int a = 3; a * 2 <= x; a += 2) {
                if (!check[a]) {
                    if (!check[x - a]) {
                        System.out.println(x + " = " + a + " + " + (x - a));
                        flag = false;
                        break;
                    }
                }
            }
            if (flag)
                System.out.println("Goldbach's conjecture is wrong.");
        }
        sc.close();
    }
}

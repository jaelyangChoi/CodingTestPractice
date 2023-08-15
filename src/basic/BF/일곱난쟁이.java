package basic.BF;

import java.util.Arrays;
import java.util.Scanner;

public class 일곱난쟁이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            a[i] = sc.nextInt();
            sum+=a[i];
        }
        Arrays.sort(a);

        int diff = sum - 100;
        for (int i = 8; i >= 1; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (a[i] + a[j] == diff) {
                    for (int k = 0; k < 9; k++) {
                        if(k==i||k==j) continue;
                        System.out.println(a[k]);
                    }
                    System.exit(0);
                }
            }
        }
    }
}

package basic.BF;

import java.util.Scanner;

public class 테트로미노 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int m = sc.nextInt();
        final int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //한 시작점에서 모든 블록의 각 합을 구해 최대값을 구함
                for (int b = 0; b < block.length; b++)
                    ans = Math.max(ans, sumBlock(arr, n, m, b, i, j));
            }
        }
        System.out.println(ans);
        sc.close();
    }


    private static int sumBlock(int[][] arr, int n, int m, int bIdx, int startX, int startY) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            int x = startX + block[bIdx][i][0];
            int y = startY + block[bIdx][i][1];
            if (!(x < n && y < m))
                return -1;
            sum += arr[x][y];
        }
        return sum;
    }

    static int[][][] block = {
            {{0, 0}, {0, 1}, {0, 2}, {0, 3}},
            {{0, 0}, {1, 0}, {2, 0}, {3, 0}},

            {{0, 0}, {1, 0}, {0, 1}, {1, 1}},

            {{0, 0}, {1, 0}, {2, 0}, {2, 1}},
            {{0, 0}, {0, 1}, {0, 2}, {1, 0}},
            {{0, 0}, {0, 1}, {1, 1}, {2, 1}},
            {{1, 0}, {1, 1}, {1, 2}, {0, 2}},
            {{0, 1}, {1, 1}, {2, 1}, {2, 0}},
            {{0, 0}, {1, 0}, {1, 1}, {1, 2}},
            {{0, 0}, {0, 1}, {1, 0}, {2, 0}},
            {{0, 0}, {0, 1}, {0, 2}, {1, 2}},

            {{0, 0}, {1, 0}, {1, 1}, {2, 1}},
            {{1, 0}, {1, 1}, {0, 1}, {0, 2}},
            {{2, 0}, {1, 0}, {1, 1}, {0, 1}},
            {{0, 0}, {0, 1}, {1, 1}, {1, 2}},

            {{1, 0}, {1, 1}, {0, 1}, {1, 2}},
            {{0, 0}, {1, 0}, {2, 0}, {1, 1}},
            {{0, 0}, {0, 1}, {0, 2}, {1, 1}},
            {{1, 0}, {1, 1}, {0, 1}, {2, 1}}
    };
}

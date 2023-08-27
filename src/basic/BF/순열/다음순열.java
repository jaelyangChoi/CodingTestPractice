package basic.BF.순열;

import java.util.Scanner;

public class 다음순열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        if (nextPermutation(arr))
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
        else
            System.out.println(-1);
        sc.close();
    }

    //12543 -> 13542 -> 13245
    //뒤쪽의 끝순열을 찾아서 다음 첫순열로 만든다.
    static boolean nextPermutation(int[] arr) {
        //1. 뒤쪽의 내림 차순 시작 지점 찾기
        int i = arr.length - 1;
        while (i > 0 && arr[i - 1] > arr[i])
            i--;
        if (i == 0) return false; //전부 내림차순 => 마지막 순열

        //2. 그 앞놈이 뒤로 갈 차례. 바로 직전으로 큰 놈이 앞으로 온다
        int j = arr.length - 1;
        while (arr[j] < arr[i - 1]) {
            j--;
        }
        swap(arr, i - 1, j);

        //새로운 시작이므로 오름차순으로 변경
        j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        return true;
    }

    private static void swap(int[] arr, int fIdx, int rIdx) {
        int tmp = arr[fIdx];
        arr[fIdx] = arr[rIdx];
        arr[rIdx] = tmp;
    }
}
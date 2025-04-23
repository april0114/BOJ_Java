import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입력을 위한 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        heapSort(arr, N);

        // 빠른 출력을 위한 BufferedWriter 사용
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    // 힙정렬 함수
    public static void heapSort(int[] arr, int n) {
        // 1. 최대 힙 생성
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // 2. 힙에서 하나씩 꺼내서 정렬
        for (int i = n - 1; i > 0; i--) {
            // 루트(최대값)와 마지막 값을 교환
            swap(arr, 0, i);

            // 줄어든 힙에 대해 다시 heapify
            heapify(arr, i, 0);
        }
    }

    // 최대 힙 유지 함수
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;     // 루트
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) largest = left;
        if (right < n && arr[right] > arr[largest]) largest = right;

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    // 배열 요소 교환 함수
    public static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}

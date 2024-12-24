import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바구니의 개수
        int M = sc.nextInt(); // 작업의 횟수
        int[] array = new int[N];

        for (int p = 0; p < M; p++) {
            int i = sc.nextInt(); // 시작 바구니
            int j = sc.nextInt(); // 끝 바구니
            int k = sc.nextInt(); // 넣을 공의 번호

            for (int q = i - 1; q < j; q++) {
                array[q] = k;
            }
        }

        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int N = sc.nextInt();
        int K = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i =0; i<N; i++){
            queue.add(i+1); //큐에다가 우선 다 넣기 ex). [1,2,3,4]
        }
        sb.append("<");

        while(!queue.isEmpty()) {
            for (int i = 1; i < K; i++) {
                queue.add(queue.poll());
            }
            sb.append(queue.poll());
            if (!queue.isEmpty()) {
                sb.append(", "); // 마지막 사람이 아닐 때만 ", " 추가
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}

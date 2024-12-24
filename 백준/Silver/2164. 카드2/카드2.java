import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int N = sc.nextInt();

        for(int i =0; i<N; i++){
            queue.add(i+1); //큐에다가 우선 다 넣기 ex). [1,2,3,4]
        }
            while (queue.size() > 1) {
                queue.poll();
                queue.add(queue.poll());
            }
        System.out.println(queue.poll());
    }
}

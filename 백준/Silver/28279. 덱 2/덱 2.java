
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Deque<Integer> deque = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            switch (number) {
                case 1:
                    int x = Integer.parseInt(st.nextToken());
                    deque.offerFirst(x);
                    break;
                case 2:
                    x = Integer.parseInt(st.nextToken());
                    deque.offerLast(x);
                    break;
                case 3:
                    sb.append(deque.isEmpty()? -1:deque.pollFirst()).append("\n");
                    break;
                case 4:
                    sb.append(deque.isEmpty()?-1 :deque.pollLast()).append("\n");
                    break;
                case 5:
                    sb.append(deque.size()).append("\n");
                    break;
                case 6:
                    sb.append(deque.isEmpty()?1:0).append("\n");
                    break;
                case 7:
                    sb.append(deque.isEmpty()?-1:deque.peek()).append("\n");
                    break;
                case 8:
                    sb.append(deque.isEmpty()?-1:deque.peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}

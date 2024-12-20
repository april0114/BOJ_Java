import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        int number = sc.nextInt();//승환이 앞에 서있는 학생들의 수
        int order =1;//비교할 순서
        int input = 0;

        for(int i=0; i< number; i++) {
            input = sc.nextInt();
            queue.add(input); //큐에 집어넣기
        }
        while (!queue.isEmpty()) {
            int current = queue.poll(); // 큐의 맨 앞 사람 가져오기

            if (current == order) { // 순서가 맞으면 간식을 받음
                order++;
            } else {
                stack.push(current); // 순서가 안 맞으면 스택으로 이동
            }

            // 스택의 최상단 값이 순서와 맞으면 꺼냄
            while (!stack.isEmpty() && stack.peek() == order) {
                stack.pop();
                order++;
            }
        }

        if(queue.isEmpty() && stack.isEmpty()){
            System.out.println("Nice");
        }
        else {
            System.out.println("Sad");
        }

    }
}

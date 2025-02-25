
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            //N 입력받기
            int N = Integer.parseInt(br.readLine());
            //-1일 경우 끝내기
            if (N == -1) {
                break;
            }
            //number 리스트 안에 약수들 받아오기
            List<Integer> number = measure(N);

            //sum 계속 초기화
            int sum = 0;

            //N과 비교하기위해 sum 작성
            for (int i = 0; i < number.size(); i++) {
                sum += number.get(i);

            }

            if(sum == N){
                    System.out.print(N + " = ");
                for(int i=0; i< number.size(); i++){
                    System.out.print(number.get(i));
                    if( i< number.size()-1){
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            }
            else {
                System.out.println(N + " is NOT perfect.");
            }
        }
    }


    public static List<Integer> measure(int n) {
        //약수 받을 ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
        //n을 제외한 범위를 해야해서 '=' 쓰지 않음
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                arr.add(i);
            }
        }

        return arr;
    }
}

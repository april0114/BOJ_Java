import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();//결과 출력용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력받기용
        int N = Integer.parseInt(br.readLine());
        double []score = new double[N];

        String[] inputs = br.readLine().split(" "); // 띄어쓰기로 입력된 점수 받기
        for (int i = 0; i < N; i++) {
            score[i] = Double.parseDouble(inputs[i]);
        }

        Arrays.sort(score);
        double max = score[N-1];
        double average=0;
        for(int i =0;i<N; i++){
            score[i]= score[i] / max * 100;
            average += score[i];
        }
        System.out.println(average/N);
        }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [][] paper = new int[100][100];
        int n = Integer.parseInt(br.readLine());
        int x ,y=0;
        int count =0;


        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");  // 공백으로 구분된 x, y 값을 배열로 받기
            x = Integer.parseInt(input[0]);
            y = Integer.parseInt(input[1]);

            // 10x10 크기의 종이 조각을 종이 배열에 표시
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    paper[k][j] = 1;
                }
            }
        }

        for(int i =0; i< 100; i++){
            for(int j=0; j< 100; j++){
                if(paper[i][j] == 1){
                    count ++;
                }
            }
        }
        System.out.println(count);
}
}
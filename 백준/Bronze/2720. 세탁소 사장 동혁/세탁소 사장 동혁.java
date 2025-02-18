
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    int Q=0;
    int D =0;
    int N =0;
    int P =0;

        for(int i =0; i<T; i++) {
            int C = Integer.parseInt(br.readLine());
               Q =C/25;
               C %= 25;

                D =C/10;
                C %= 10;


                N =C/5;
                C %= 5;

            P =C/1;
            C %= 1;


            sb.append(Q).append(" ").append(D).append(" ").append(N).append(" ").append(P).append("\n");

        }
        System.out.println(sb);
        }
    }

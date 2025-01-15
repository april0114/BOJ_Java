
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine()); //카드 개수 N개 입력받기
        Set <Integer> N_set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i< N; i++){
            N_set.add(Integer.parseInt(st.nextToken()));
        }
        int M = Integer.parseInt(br.readLine()); //카드 개수 M개 입력받기
        StringTokenizer stt = new StringTokenizer(br.readLine());
        for(int i=0; i< M; i++){
            int number = Integer.parseInt(stt.nextToken());
            if(N_set.contains(number)){
                sb.append(1 + " ");    ;
            }
            else {
                sb.append(0 + " ");
            }
        }
        System.out.println(sb);
    }
    }


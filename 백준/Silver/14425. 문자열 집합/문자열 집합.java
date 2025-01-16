
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());
       int count = 0;
       Set<String> S = new HashSet<>();

       for(int i=0; i< N; i++){
           String in_SN = br.readLine();
           S.add(in_SN);
       }
       for(int i=0; i<M; i++){
           String in_SM = br.readLine();
           if(S.contains(in_SM)){
               count++;
           }
       }
        System.out.println(count);
    }
    }


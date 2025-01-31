
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st =new StringTokenizer(br.readLine());
    StringBuilder sb =new StringBuilder();


    int []chess = new int[]{1, 1, 2, 2, 2, 8};
    int []chess_find = new int[6];

    for (int i=0; i< 6; i++){
        chess_find[i] = Integer.parseInt(st.nextToken());
        sb.append(chess[i] - chess_find[i]).append(" ");
    }
        System.out.println(sb);
    
    }
}

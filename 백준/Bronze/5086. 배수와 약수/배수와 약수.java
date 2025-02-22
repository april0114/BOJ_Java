
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());

            if (one == 0 && two == 0) {
                break;
            }

            if (two % one == 0) {
                sb.append("factor\n");
            } else if (one % two == 0) {
                sb.append("multiple\n");
            } else {
                sb.append("neither\n");
            }
        }
        System.out.println(sb);
        }
    }

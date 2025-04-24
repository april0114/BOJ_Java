import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); //테스트 케이스 T

        for(int i=0; i<T; i++){
            int k = Integer.parseInt(br.readLine()); //정수 k(층수)
            int n = Integer.parseInt(br.readLine()); //정수 n(호수)

            int apartment[][] = new int[k+1][n+1];

            for(int j=1; j<=n; j++){
                apartment[0][j] = j; //0층의 j호에는 j명의 사람이 살고 있다
            }


            for(int j=1; j<=k; j++){
                for(int p=1; p<=n; p++){
                    apartment[j][p] = apartment[j][p-1] + apartment[j-1][p];
                }
            }
            System.out.println(apartment[k][n]);

        }
        
    }
}


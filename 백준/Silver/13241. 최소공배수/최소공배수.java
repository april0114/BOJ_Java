import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       long A = Long.parseLong(st.nextToken());
       long B = Long.parseLong(st.nextToken());
       long lcd = getlcd(A,B);
       long gcd = A*B/lcd;
        System.out.println(gcd);
        }


        public static long getlcd(long a, long b){
            while (b!=0){
                long remainder = b;
                b = a %b;
                a = remainder;
            }
            return a;
        }
}

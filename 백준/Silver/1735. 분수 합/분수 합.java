import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //받아오기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); //첫째줄
        int b = Integer.parseInt(st.nextToken()); //첫째줄
        StringTokenizer stt = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(stt.nextToken()); //둘째줄
        int d = Integer.parseInt(stt.nextToken()); //둘째줄

        a = a*d + b*c;
        c = b *d;
        int lcd = lcd(a,c);
        System.out.println(a/lcd + " " + c/lcd);






    }
    public static int lcd(int a, int b){
        while(b!=0) {
            int remainder = b;
            b = a % b;
            a = remainder;
        }
        return a;
    }
}

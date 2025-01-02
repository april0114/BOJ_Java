
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//입력받기
        String word = br.readLine();
        String[] chars = word.split("");

        int N = Integer.parseInt(br.readLine());//숫자 입력받기
        System.out.println(chars[N - 1].charAt(0));


    }

    }


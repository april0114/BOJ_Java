import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
    static boolean[] arr = new boolean[1000001];
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum =0;
        int N = Integer.parseInt(br.readLine()); //N개의 자릿수
        String number_to_add = br.readLine(); //더해야할 숫자 입력 받기
        char []array = number_to_add.toCharArray(); //char형으로 만들기
        for(int i =0; i<array.length; i++){

            sum += array[i] - '0'; //덧셈 누적하기 & 아스키 코드 변환하기
        }


        System.out.println(sum);

        }
    }


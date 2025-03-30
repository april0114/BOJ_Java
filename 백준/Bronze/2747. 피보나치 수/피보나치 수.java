import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException { // 재귀함수를 통한 피보나치 수열

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //n의 값 입력받기

        System.out.println(fibonacci(n)); //함수를 통해서 피보나치 해결

    }
    public static int fibonacci(int x){
        if(x <=1){
            return x; //0,1 일 경우 자기자신 리턴해주기
        }

        int[] array = new int[x+1]; //배열을 할당해서 배열 값으로 계산해주기
        array[0] =0;
        array[1] = 1;

        for(int i=2; i<= x; i++){
            array[i] = array[i-1] + array[i-2];
        }
        return array[x];
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //소수의 개수를 세기 위한 변수
        int count = 0;
        //첫줄에 수의 개수 N이 주어진다
        int N = Integer.parseInt(br.readLine());

        //공백으로 분리 받아 입력하기 위해
        String[] numbers = br.readLine().split(" ");


        for(int i=0; i<N; i++){
            int prime = Integer.parseInt(numbers[i]);
            if(isPrime(prime) == true){
                count +=1;
            }
        }
        System.out.println(count);
    }
    public static boolean isPrime(int n){
        if(n<=1) {
            return  false;
        }
        for(int i=2; i< n; i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;

    }

}

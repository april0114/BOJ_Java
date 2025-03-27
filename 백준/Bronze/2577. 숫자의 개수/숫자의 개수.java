import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine()); //A입력 받기
        int B = Integer.parseInt(br.readLine());//B입력 받기
        int C = Integer.parseInt(br.readLine());//C입력 받기

        int number = A*B*C; //결과값
        String num = String.valueOf(number); //문자열로 변환하기

        int [] count = new int[10]; // 0~9 까지의 개수 저장 배열
        for(char c: num.toCharArray()){
            count[c - '0']++; // 문자열 숫자로 변환하여 개수 증가
        }
        for(int i=0; i< count.length; i++){
            System.out.println(count[i]);
        }
    }
}

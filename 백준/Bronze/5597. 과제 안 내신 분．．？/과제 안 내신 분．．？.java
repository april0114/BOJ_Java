
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] number = new int[28]; //28개의 배열 정의

        StringBuilder sb = new StringBuilder(); //출력용

        for(int i =0; i<28 ; i++){
            number[i] = Integer.parseInt(br.readLine()); //입력받기(28개)
        }
        Arrays.sort(number);

        for(int i = 1; i <= 30; i++){
            if(Arrays.binarySearch(number, i) <0){ //이진탐색은 없을 경우 음수를 반환하기에
                sb.append(i).append("\n");
            }

        }
        System.out.println(sb.toString().trim());
    }
}

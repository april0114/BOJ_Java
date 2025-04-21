import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N];
        for(int i=0; i<N; i++) {

            arr[i] = Integer.parseInt(br.readLine());
        }

            for(int j=1; j<N; j++){ //두번 째 값 부터 시작(= 1번째는 이미 정렬되었다고 판단)
                int key = arr[j]; //현재 삽입할 값 저장
                int k = j-1; // key 앞에 있는 값부터 비교 시작

                while(k >=0 && arr[k]> key){ //key보다 큰 값들은 오른쪽으로 이동
                    arr[k+1] = arr[k];
                    k--;
                }
                arr[k+1] = key; //key를 올바른 위치에 삽입
            }
            for(int num : arr){
                System.out.println(num);

        }
    }
}


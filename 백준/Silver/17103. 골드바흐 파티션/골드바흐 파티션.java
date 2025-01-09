import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Main {
    static boolean[] arr = new boolean[1000001];
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//입력 받아오기
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        isPrime();

        for (int i = 0; i < T; i++) {
            int number = Integer.parseInt(br.readLine());
            int count = 0;

            for (int j = 2; j <= number/2; j++) {
                if(!arr[j] && !arr[number-j])
                    count++;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);

    }
    static void isPrime(){
        arr[0] = arr[1] = true; //0과 1은 소수 x
        for(int i =2; i<= Math.sqrt(arr.length -1); i++){
            if(arr[i]) {
                continue;
            }
                for(int j= i*i; j<= 1000000; j+=i){
                    arr[j] = true;
                }
            }
        }
    }


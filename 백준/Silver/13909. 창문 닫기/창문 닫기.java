import java.io.*;

public class Main {

    //입력&출력 부분
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int count = 0; //창문이 열려있는 개수
        for(int i = 1; i * i <= N; i++) { //창문은 자기의 약수에만 열림
            count++;
        }

        bw.write(count + "\n");

        br.close();

        bw.flush();
        bw.close();
    }


}
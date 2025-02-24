import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int count = 0;
		int result = 0;
		
		// 약수 구하는 반복문
		for(int i = 1; i <= N; i++) {
			//약수가 하나 나올떄마다 count에 +1
			if(N % i == 0) {
				count++;
			}
			if(count == K) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}

}
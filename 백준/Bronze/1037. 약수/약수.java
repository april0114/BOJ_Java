import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for( int i=0; i<N; i++){
            int number_to_array = Integer.parseInt(st.nextToken());
            array[i] = number_to_array;

        }
        Arrays.sort(array);
        System.out.println(array[0] * array[N-1]);


    }
}

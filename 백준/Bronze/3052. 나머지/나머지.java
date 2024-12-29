
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();//중복 값을 피하기 위해 set 사용

        for(int i =0; i<10 ; i++){
            int number = Integer.parseInt(br.readLine());
            set.add(number%42);
        }
        System.out.println(set.size());
    }
}


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int count = 0;
        Set<String> hashset =  new HashSet<String>();
        for(int i=0; i< N; i++){
            String s = br.readLine();
            if(s.equals("ENTER")){
                hashset.clear();
            } else if (!hashset.contains(s)) {
                count++;
                hashset.add(s);

            }
        }
        System.out.println(count);

    }
}

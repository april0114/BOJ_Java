import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int A = Integer.parseInt(bf.readLine());
            for (int i = 0; i < A; i++) {
                String[] inputs = bf.readLine().split(" ");
                int B = Integer.parseInt(inputs[0]);
                int C = Integer.parseInt(inputs[1]);
                int result = B + C;

                bw.write(result + "\n");
            }
            bw.flush();
        }
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            double N = Integer.parseInt(br.readLine());
            double dots = (Math.pow(2,N) +1) * (Math.pow(2,N) +1);
            int convert = (int) dots;

        System.out.println(convert);
        }
    }

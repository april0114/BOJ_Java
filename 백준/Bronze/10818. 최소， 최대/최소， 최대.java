import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {

        Scanner br = new Scanner(System.in);
        int K = br.nextInt();
        int[] arr = new int[K];
        int small =0;
        int large = 0;

        for(int i=0; i<K; i++){
            int n = br.nextInt();
            arr[i] = n;

            }

        Arrays.sort(arr);
        small = arr[0];
        large = arr[K-1];
        System.out.println(small +" "+  large);
        }
    }

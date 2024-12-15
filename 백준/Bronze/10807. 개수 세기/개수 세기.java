import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int arr[] = new int[T];
        int count=0;

        for(int i =0; i< T; i++){
         arr[i] = scanner.nextInt();

        }

        int num = scanner.nextInt();

        for(int var:arr){
            if(var == num){
                count +=1;
            }

        }
        System.out.println(count);



    }
}
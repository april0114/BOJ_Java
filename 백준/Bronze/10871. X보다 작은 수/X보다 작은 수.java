import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int num = scanner.nextInt();

        int arr[] = new int[T];
        int arr1[] = new int[T];

        for(int i =0; i< T; i++){
         arr[i] = scanner.nextInt();
         if(arr[i]< num){
             arr1[i] = arr[i];
             System.out.print(arr1[i] + " ");
        }
        }


        }



    }

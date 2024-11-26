import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B,C, result ;
        ArrayList<Integer> results  = new ArrayList<>();
        A = sc.nextInt();

        for(int i =0; i<A;i++){
            B= sc.nextInt();
            C = sc.nextInt();
            result = B+C;
            results.add(result);

       }
        for(int res : results){
            System.out.println(res);
        }
    }
}
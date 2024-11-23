import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> arrayList = new ArrayList<>();
            int A,B;
            A = sc.nextInt();
            B = sc.nextInt();
            int originalB =  B;

            while (B>0){
                arrayList.add(B%10);
                B/= 10;
            }

            System.out.println(A*arrayList.get(0));
            System.out.println(A*arrayList.get(1));
            System.out.println(A*arrayList.get(2));
            System.out.println(A*originalB);
        }
    }

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B;
        A = sc.nextInt();
        B = sc.nextInt();

        if (B<45){
            B +=15;
            A -=1;
            if(A < 0){
                A+=24;
            }
            System.out.print(A + " " + B);
        }
        else if (B>= 45){
            B-=45;
            System.out.print(A + " " + B);
        }

    }
}
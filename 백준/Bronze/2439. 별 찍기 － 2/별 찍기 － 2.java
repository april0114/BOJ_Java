import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

            for(int i=1; i<= T; i++){
                for(int j=0; j<T-i; j++){
                    System.out.print(" ");

                }
                for(int k=0; k<i; k++){
                    System.out.print("*");

                }
                System.out.println();
        }

        in.close();
    }
}
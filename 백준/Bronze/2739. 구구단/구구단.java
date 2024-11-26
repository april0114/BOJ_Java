import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, i,result = 0;
        A = sc.nextInt();

        for(i=1; i< 10; i++){
            result = A * i;
            System.out.println(A + " * " + i+ " = " +result);
        }
    }

}
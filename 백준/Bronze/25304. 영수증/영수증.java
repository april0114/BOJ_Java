import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X,N,A,B,result = 0;
        X = sc.nextInt();
        N = sc.nextInt();

        for(int i=0; i<N; i++){
            A = sc.nextInt();
            B= sc.nextInt();
            result += A*B;

        }
        if(X == result){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        }
    }

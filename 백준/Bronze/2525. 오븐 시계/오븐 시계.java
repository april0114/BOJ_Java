import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B,C;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        B+=C;
        while (B>=60){
            B-=60;
            A+=1;
            if(A>=24){
                A-=24;
            }
        }
        System.out.println(A +" " +B);
    }
}
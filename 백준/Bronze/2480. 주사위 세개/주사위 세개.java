import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B,C,result = 0;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        int [] values = { A,B,C};
        Arrays.sort(values);

        switch (values[0] == values[1] && values[1] == values[2] ?1 :
                (values[0] == values[1] || values[1] == values[2]) ? 2: 3){
            case 1:
                result = 10000 + (values[0] * 1000);
                break;
            case 2:
                result = 1000 + (values[1] * 100);
                break;
            case 3:
                result = 100 * values[2];
                break;

                
        }
        System.out.println(result);

    }
}
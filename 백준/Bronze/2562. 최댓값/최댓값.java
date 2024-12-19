import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] array = new int[9];
    int num =0;
    int max =array[0];
    int line =1;
    for(int i=0; i<9; i++){
        num = sc.nextInt();
        array[i] = num;

    }

    for(int j=0; j< 9; j++){
        if(array[j]> max){
            max = array[j];
            line = j+1;
        }
    }
        System.out.println(max);
        System.out.println(line);


    }
}
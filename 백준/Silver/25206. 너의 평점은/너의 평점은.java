
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double total = 0;
        double convert =0; // A+ = 4.5
        float totalconvert =0;
        for(int i=0; i< 20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken(); //ex). ObjectOrientedProgramming1
            double grade = Double.parseDouble(st.nextToken()); //ex). 3.0
            String score = st.nextToken(); // A+

            if (score.equals("P")) {
                continue;
            }

            switch (score){
                case "A+":
                    convert =4.5;
                    break;
                case "A0":
                    convert =4.0;
                    break;
                case "B+":
                    convert =3.5;
                    break;
                case "B0":
                    convert =3.0;
                    break;
                case "C+":
                    convert =2.5;
                    break;
                case "C0":
                    convert =2.0;
                    break;
                case "D+":
                    convert =1.5;
                    break;
                case "D0":
                    convert =1.0;
                    break;
                case "F":
                    convert =0.0;
                    break;

            }
            total += convert*grade;
            totalconvert += grade;
        }
        double gpa = total/totalconvert;
        System.out.printf("%.6f", gpa);

    }
}
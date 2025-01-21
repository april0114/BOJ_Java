
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String call = st.nextToken();
        int number_second = 0;
        for(int i=0; i<call.length(); i++){
            char ch = call.charAt(i);

            switch (ch){
                case 'A': case 'B': case 'C':
                    number_second += 3;
                    break;
                case 'D': case 'E': case 'F':
                    number_second += 4;
                    break;
                case 'G': case 'H': case 'I':
                    number_second += 5;
                    break;
                case 'J': case 'K': case 'L':
                    number_second += 6;
                    break;
                case 'M': case 'N': case 'O':
                    number_second += 7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    number_second += 8;
                    break;
                case 'T': case 'U': case 'V':
                    number_second += 9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    number_second += 10;
                    break;

            }
        }

        System.out.println(number_second);


    }
    }


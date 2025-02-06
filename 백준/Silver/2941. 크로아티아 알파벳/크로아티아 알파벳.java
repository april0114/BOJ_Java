
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    int croatia = 0;

    int len = s.length();
    for( int i=0; i<len; i++){
        char ch = s.charAt(i);

        if( ch =='c' && i< len-1){
            if(s.charAt(i+1) == '='){
                i++;
            } else if (s.charAt(i+1) == '-') {
                i++;
            }
        }

        else if(ch == 'd') {
            if(i < s.length() - 1) {
                if(s.charAt(i + 1) == 'z') {
                    if(i < s.length() - 2) {
                        if(s.charAt(i + 2) == '=') {	// dz= 일 경우
                            i += 2;
                        }
                    }
                }

                else if(s.charAt(i + 1) == '-') {	// d- 일 경우
                    i++;
                }
            }
        }
        if( ch =='n' && i< len-1){
            if(s.charAt(i+1) == 'j'){
                i++;
            }
        }

        if( ch =='l' && i< len-1){
            if(s.charAt(i+1) == 'j'){
                i++;
            }
        }
        if( ch =='s' && i< len-1){
            if(s.charAt(i+1) == '='){
                i++;
            }
        }
        if( ch =='z' && i< len-1){
            if(s.charAt(i+1) == '='){
                i++;
            }
        }
        croatia++;
    }
        System.out.println(croatia);
    }
}

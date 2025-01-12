
import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine(); //문자열 입력 받기
        String alphabet ="abcdefghijklmnopqrstuvwxyz"; //알파벳들 미리 입력 해둠
        for(char c : alphabet.toCharArray()){
            int index = input.indexOf(c); //indexOf 주어진 문자 또는 문자열이 원본 문자열 내에서 처음 나타나는 위치 반환
            if(index != -1){ //없을 경우 -1을 리턴하기에, 알파벳이 != (있다면) index번호 출력
                System.out.print(index + " ");
            }
            else {
                System.out.print(index + " "); //없을 경우 index 혹은 -1출력
            }
            }
        }
    }




import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //포켓몬 M개
        int M = Integer.parseInt(st.nextToken()); //테스트할 개수 N개
        StringBuilder sb = new StringBuilder();

        HashMap <String,Integer> poketmonname = new HashMap<>(); //포켓몬의 이름을 저장할 해쉬맵 (이름, 번호)
        HashMap <Integer,String> poketmonnumber = new HashMap<>(); //포켓몬의 번호를 저장할 해쉬맵( 번호, 이름)

        for(int i=1; i< N+1; i++){

            String name = br.readLine(); //이름 입력 받기
            poketmonname.put(name, i); // 이름넣기 (이름, 번호)
            poketmonnumber.put(i, name); //번호 넣기 (번호, 이름)
        }
        for(int i=0; i< M; i++){
            String check = br.readLine();
            if(check.matches("\\d+")){ //입력받았는데 정수일경우
                int number = Integer.parseInt(check);
                sb.append(poketmonnumber.get(number)).append("\n"); //번호로 이름 꺼내오기
            }
            else {
                sb.append(poketmonname.get(check)).append("\n"); //이름에서 번호 꺼내오기
            }

        }
        System.out.println(sb);

    }
    }


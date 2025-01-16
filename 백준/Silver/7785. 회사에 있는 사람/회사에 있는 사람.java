
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashSet<String> name = new HashSet<>(); //중복 제거를 위한 HashSet

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String names = st.nextToken(); //이름 입력받기
            String records =st.nextToken(); //출퇴근 기록 입력받기
            if(records.equals("enter")){ //출근했을 경우
                name.add(names); //이름 추가하기
            } else if (records.equals("leave")) { // 떠났을 경우
                name.remove(names); // 이름 제거하기
            }
        }
        List<String> sorted_name = new ArrayList<>(name); //알파벳 순서대로 정렬을 하기 위해 List 로 변경
        Collections.sort(sorted_name, Collections.reverseOrder()); // 그냥 sort를 하면 내림차순이 되지 않음 Collections.reverseOrder()를 사용해서 내림차순 만들기

        for(String print : sorted_name){
            sb.append(print).append("\n"); //이름만 출력하기
        }

        System.out.println(sb);
    }
    }


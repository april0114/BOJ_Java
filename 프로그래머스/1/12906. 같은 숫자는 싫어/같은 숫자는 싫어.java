import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int[] solution(int[] arr){
        List<Integer> result = new ArrayList<>();

        result.add(arr[0]);

        for(int i=1; i< arr.length; i++){
            if(arr[i]!= arr[i-1]){
                result.add(arr[i]);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
    public static void main(String []args){
        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4, 4, 4, 3, 3};

        System.out.println(Arrays.toString(solution(arr1))); 
        System.out.println(Arrays.toString(solution(arr2))); 
    }
}

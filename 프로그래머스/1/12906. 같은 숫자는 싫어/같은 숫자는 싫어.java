import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        // 결과를 저장할 ArrayList 생성
        ArrayList<Integer> result = new ArrayList<>();
        
        // 배열을 순차적으로 검사
        for (int i = 0; i < arr.length; i++) {
            // 첫 번째 원소 또는 이전 원소와 다를 경우
            if (i == 0 || arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }
        
        // ArrayList를 배열로 변환하여 반환
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

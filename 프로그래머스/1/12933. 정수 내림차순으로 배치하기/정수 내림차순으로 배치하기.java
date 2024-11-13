import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        // long n을 문자열로 변환
        String str = Long.toString(n);
        
        // 문자열을 char 배열로 변환하여 정렬
        Character[] arr = new Character[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        
        // 내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());
        
        // 정렬된 배열을 문자열로 변환
        StringBuilder sortedStr = new StringBuilder();
        for (char c : arr) {
            sortedStr.append(c);
        }
        
        // 문자열을 long으로 변환하여 반환
        return Long.parseLong(sortedStr.toString());
    }
}

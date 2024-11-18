import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        // 문자열을 문자 배열로 변환
        Character[] charArray = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charArray[i] = s.charAt(i);
        }
        
        // 문자 배열을 내림차순으로 정렬
        Arrays.sort(charArray, Collections.reverseOrder());
        
        // 정렬된 배열을 문자열로 변환
        StringBuilder answer = new StringBuilder();
        for (char c : charArray) {
            answer.append(c);
        }
        
        return answer.toString();
    }
}

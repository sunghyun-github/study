import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
        // 배열을 n번째 문자와 사전순으로 정렬
        Arrays.sort(strings, new Comparator<String>() {
         
            public int compare(String s1, String s2) {
                // n번째 문자를 비교
                if (s1.charAt(n) == s2.charAt(n)) {
                    // n번째 문자가 같다면 사전순으로 정렬
                    return s1.compareTo(s2);
                }
                // n번째 문자가 다르면 해당 문자 기준으로 정렬
                return Character.compare(s1.charAt(n), s2.charAt(n));
            }
        });
        return strings;
    }
}

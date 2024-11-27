import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        
        // 문자열을 왼쪽에서 오른쪽으로 탐색
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // 만약 해당 문자가 이전에 나왔다면, 그 위치를 기록
            if (map.containsKey(c)) {
                answer[i] = i - map.get(c); // 마지막으로 등장한 위치와 현재 위치 차이
            } else {
                answer[i] = -1;  // 처음 나온 문자라면 -1
            }
            
            // 그 문자의 최신 위치를 갱신
            map.put(c, i);
        }
        
        return answer;
    }
}

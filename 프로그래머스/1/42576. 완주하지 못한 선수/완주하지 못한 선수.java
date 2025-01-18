import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // 참가자 목록을 HashMap에 추가
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        
        // 완주자 목록을 HashMap에서 차감
        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }
        
        // 완주하지 못한 선수 찾기
        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                return key;
            }
        }
        
        return ""; // 기본 반환값 (모든 조건이 만족된다면 실행되지 않음)
    }
}

import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // 결과를 저장할 배열을 photo의 길이만큼 초기화
        int[] answer = new int[photo.length];
        
        // 각 이름과 그리움 점수를 매칭하는 HashMap 생성
        HashMap<String, Integer> yearningMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            yearningMap.put(name[i], yearning[i]);
        }

        // 각 사진마다 추억 점수를 계산
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (String person : photo[i]) {
                // 이름이 그리움 점수 맵에 있다면, 점수를 더함
                if (yearningMap.containsKey(person)) {
                    sum += yearningMap.get(person);
                }
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}

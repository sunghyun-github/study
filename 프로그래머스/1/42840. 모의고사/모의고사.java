import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] patterns = {
            {1, 2, 3, 4, 5},      
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5} 
        };
        
        int[] scores = new int[3];
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < patterns.length; j++) {
                if (answers[i] == patterns[j][i % patterns[j].length]) {
                    scores[j]++;
                }
            }
        }
        
        int maxScore = Arrays.stream(scores).max().orElse(0);
        
        // 최고 점수를 받은 사람을 리스트에 추가
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                result.add(i + 1);
            }
        }
        
        // 리스트를 배열로 변환해 반환
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // 카드 뭉치를 Queue로 변환
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();
        
        // 각 카드 배열을 큐로 초기화
        for (String card : cards1) {
            queue1.add(card);
        }
        for (String card : cards2) {
            queue2.add(card);
        }

        // goal 배열의 단어를 순서대로 확인
        for (String word : goal) {
            if (!queue1.isEmpty() && word.equals(queue1.peek())) {
                // cards1의 첫 번째 단어와 일치
                queue1.poll(); // 단어를 제거
            } else if (!queue2.isEmpty() && word.equals(queue2.peek())) {
                // cards2의 첫 번째 단어와 일치
                queue2.poll(); // 단어를 제거
            } else {
                // 어느 카드에서도 단어를 찾을 수 없음
                return "No";
            }
        }

        // 모든 단어를 올바르게 확인한 경우
        return "Yes";
    }
}

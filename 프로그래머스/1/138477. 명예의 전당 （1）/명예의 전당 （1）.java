import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            // 점수를 명예의 전당에 추가
            hallOfFame.add(score[i]);
            
            // 명예의 전당 크기가 k를 초과하면 최하위 점수 제거
            if (hallOfFame.size() > k) {
                hallOfFame.poll();
            }
            
            // 현재 명예의 전당의 최하위 점수를 기록
            answer[i] = hallOfFame.peek();
        }

        return answer;
    }
}


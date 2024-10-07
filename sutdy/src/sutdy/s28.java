package sutdy;

import java.util.ArrayList;

class s28 {
    public int[] solution(int n) {
        ArrayList<Integer> tempAnswer = new ArrayList<>(); // 동적 리스트 사용
        
        // 1부터 n까지 반복
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) { // i가 홀수인 경우
                tempAnswer.add(i); // ArrayList에 홀수 추가
            }
        }

        // ArrayList를 배열로 변환
        int[] answer = new int[tempAnswer.size()];
        for (int i = 0; i < tempAnswer.size(); i++) {
            answer[i] = tempAnswer.get(i);
        }

        // 이미 오름차순이므로 Arrays.sort() 불필요
        return answer; // 결과 반환
    }
}

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answerList = new ArrayList<>();

        // divisor로 나누어 떨어지는 요소를 answerList에 추가
        for (int num : arr) {
            if (num % divisor == 0) {
                answerList.add(num);
            }
        }

        // divisor로 나누어 떨어지는 요소가 없다면 -1 추가
        if (answerList.isEmpty()) {
            answerList.add(-1);
        }

        // ArrayList를 배열로 변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        // 배열을 오름차순 정렬
        Arrays.sort(answer);

        return answer;
    }
}

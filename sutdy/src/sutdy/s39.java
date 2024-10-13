package sutdy;

class s39 {
	class Solution {
	    public int[] solution(int[] num_list) {
	        // 배열 크기 계산 (새로운 값 1개를 추가하므로, 기존 길이 + 1)
	        int[] answer = new int[num_list.length + 1];

	        // 기존 num_list의 요소들을 answer에 복사
	        for (int i = 0; i < num_list.length; i++) {
	            answer[i] = num_list[i];
	        }

	        // 마지막 원소와 그 전 원소 비교
	        int lastElement = num_list[num_list.length - 1];
	        int secondLastElement = num_list[num_list.length - 2];

	        if (lastElement > secondLastElement) {
	            // 마지막 원소가 그 전 원소보다 크면 차이를 추가
	            answer[answer.length - 1] = lastElement - secondLastElement;
	        } else {
	            // 마지막 원소가 크지 않으면 두 배한 값을 추가
	            answer[answer.length - 1] = lastElement * 2;
	        }
	        return answer;
	    }
	}
}

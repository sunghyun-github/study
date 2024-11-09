class Solution {
    public int[] solution(int start_num, int end_num) {
        // 배열의 크기를 올바르게 계산합니다.
        int[] answer = new int[start_num - end_num + 1];
        
        // start_num에서 end_num까지 1씩 감소하면서 배열에 값을 채웁니다.
        for (int i = 0; i < answer.length; i++) {
            answer[i] = start_num--;
        }
        
        return answer;
    }
}

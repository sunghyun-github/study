class Solution {
    public int[] solution(int[] num_list, int n) {
        // 결과 배열 초기화 (num_list와 동일한 크기)
        int[] answer = new int[num_list.length];
        
        // num_list의 n 번째 이후의 원소들을 먼저 answer 배열에 복사
        int index = 0;
        for (int i = n; i < num_list.length; i++) {
            answer[index++] = num_list[i];
        }
        
        // num_list의 처음부터 n 번째까지의 원소들을 answer 배열에 추가
        for (int i = 0; i < n; i++) {
            answer[index++] = num_list[i];
        }
        
        return answer;
    }
}

class Solution {
    public int[] solution(int[] num_list, int n) {
        // n번째 원소부터 마지막까지의 길이를 계산
        int[] answer = new int[num_list.length - (n - 1)];
        
        // n번째 원소부터 끝까지 반복문으로 하나씩 복사
        for (int i = n - 1, j = 0; i < num_list.length; i++, j++) {
            answer[j] = num_list[i];
        }
        
        return answer;
    }
}

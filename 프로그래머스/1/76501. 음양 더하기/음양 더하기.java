class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (int i = 0; i < absolutes.length; i++) {
            // signs[i]가 true이면 absolutes[i]를 그대로 더하고, false이면 부호를 반전시켜 더함
            answer += signs[i] ? absolutes[i] : -absolutes[i];
        }

        return answer;
    }
}

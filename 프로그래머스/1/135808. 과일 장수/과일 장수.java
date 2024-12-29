import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        
        int answer = 0;
        int n = score.length;
        
        for (int i = n - m; i >= 0; i -= m) {
            int minScore = score[i];
           
            answer += minScore * m;
        }
        
        return answer;
    }
}

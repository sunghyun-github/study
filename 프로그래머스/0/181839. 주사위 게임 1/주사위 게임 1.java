class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        // a와 b가 모두 홀수라면
        if (a % 2 == 1 && b % 2 == 1) {
            answer = (a * a) + (b * b);
        }
        
        else if (a % 2 == 1 || b % 2 == 1) {
            answer = 2 * (a + b);
        }
        else {
            answer = Math.abs(a - b);
        }

        return answer;
    }
}

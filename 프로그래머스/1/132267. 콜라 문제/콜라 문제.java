class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) { 
            int newBottles = (n / a) * b; // 교환으로 받는 새 콜라 병 수
            answer += newBottles; // 받은 콜라 병 수 누적
            n = (n % a) + newBottles; // 남은 빈 병 수 + 새로 받은 빈 병 수
        }

        return answer;
    }
}

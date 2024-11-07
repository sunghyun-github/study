class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 1부터 n까지 반복하여, n을 나누어떨어지게 하는 a 값을 찾음
        for (int a = 1; a <= n; a++) {
            if (n % a == 0) { // a가 n의 약수일 때
                answer++; // 순서쌍이 존재하므로 개수 증가
            }
        }
        
        return answer;
    }
}

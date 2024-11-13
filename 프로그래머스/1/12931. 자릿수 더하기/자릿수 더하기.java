public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n); // n을 문자열로 변환
        
        for (int i = 0; i < str.length(); i++) {
            // str.charAt(i) - '0' 표현은 문자를 정수로 변환, 아스키코드 활용
            // 자동 형변환 int로 됨
            answer += str.charAt(i) - '0'; 
        }

        return answer;
    }
}

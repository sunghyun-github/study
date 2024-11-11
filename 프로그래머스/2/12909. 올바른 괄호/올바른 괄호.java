class Solution {
    boolean solution(String s) {
        int count = 0;
        
        // 문자열을 순차적으로 검사
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;  // 여는 괄호일 때 카운트 증가
            } else if (c == ')') {
                count--;  // 닫는 괄호일 때 카운트 감소
            }
            
            // count가 음수이면, 닫는 괄호가 여는 괄호보다 먼저 나옴
            if (count < 0) {
                return false;
            }
        }
        
        // 최종적으로 count가 0이면 올바른 괄호
        return count == 0;
    }
}

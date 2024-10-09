package sutdy;

class s34 {
	class Solution {
		public int solution(String my_string) {
	        int answer = 0;

	        // 문자열을 순차적으로 탐색
	        for (int i = 0; i < my_string.length(); i++) {
	            char c = my_string.charAt(i); // 각 문자를 가져옴

	            // 문자가 숫자인지 확인
	            if (Character.isDigit(c)) {
	                // 숫자인 경우, answer에 더하기 (문자를 숫자로 변환)
	                answer += c - '0'; // '0' 문자를 빼면 실제 숫자가 됨 / 공식 !
	            }
	        }

	        return answer;
	    }
	}
}

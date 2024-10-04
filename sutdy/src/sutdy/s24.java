package sutdy;

class s24 {
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        
	        // n이 0이 될 때까지 반복
	        while (n > 0) {
	            answer += n % 10;  // 마지막 자리 숫자를 더함
	            n = n / 10;        // 마지막 자리를 제거
	        }
	        return answer;  // 자리수의 합을 반환
	    }
	}
}
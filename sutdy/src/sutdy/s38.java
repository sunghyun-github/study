package sutdy;


class s38 {
	class Solution {
	    public String solution(String rsp) {
	        String answer = "";
	        
	        for(int i = 0; i < rsp.length(); i++) {
	            char ch = rsp.charAt(i); // 각 문자를 ch에 저장
	            
	            if (ch == '2') {
	                answer += '0';
	            } else if (ch == '0') {
	                answer += '5';
	            } else if (ch == '5') {
	                answer += '2';
	            }
	        }
	        
	        return answer;
	    }
	}
}

package sutdy;

class s23 {
	class Solution {
	     public String solution(String my_string) {
	        // 모음을 정의합니다.
	        String vowels = "aeiouAEIOU";
	        StringBuilder answer = new StringBuilder(); // 결과를 저장할 StringBuilder
	        
	        // 입력된 문자열을 한 글자씩 확인합니다.
	        for (char c : my_string.toCharArray()) {
	            // 현재 글자가 모음이 아닐 경우에만 추가합니다.
	        	// c가 vowels에 존재하지 않으면 -1을 반환
	        	// 모음이면 if문을 타지않으므로 append 되지않음
	            if (vowels.indexOf(c) == -1) {
	                answer.append(c);
	            }
	        }
	        
	        // StringBuilder를 문자열로 변환하여 반환합니다.
	        return answer.toString();
	    }
	}
}
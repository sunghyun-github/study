package sutdy;

class s34_1 {
	class Solution {
		public int solution(String my_string) {
	        int answer = 0;
	        
	        // 정규 표현식을 사용하여 my_string에서 숫자가 아닌 문자들을 모두 제거하는 역할 ^는 not임
	        String str = my_string.replaceAll("[^0-9]","");

	        // str.toCharArray(): 문자열 str을 문자 배열로 변환하여, 하나하나의 문자를 처리할 수 있게 함
	        // 향상된 for문 사용
	        // ex) str = "123"이면, {'1', '2', '3'}로 변환
	        for(char ch : str.toCharArray()) {
	        	// 각 문자에서 변환된 숫자를 answer에 더해, 최종적으로 모든 숫자의 합을 구함
	            answer += Character.getNumericValue(ch);
	        }
	        return answer;
	    }
	}
}

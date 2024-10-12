package sutdy;

import java.util.HashMap;
import java.util.Map;

class s38_1 {
	class Solution {
		public String solution(String rsp) {
	        //2 - 가위, 0 - 바위, 5 - 보
	        Map<String, String> winNumbers = new HashMap<>();
	        winNumbers.put("2", "0");
	        winNumbers.put("0", "5");
	        winNumbers.put("5", "2");

	        StringBuilder answer = new StringBuilder();

	        for (int i = 0; i < rsp.length(); i++) {
	            answer.append(winNumbers.get(rsp.substring(i, i+1)));
	        }

	        return answer.toString();
	    }
	}
}

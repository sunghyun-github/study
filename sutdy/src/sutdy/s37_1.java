package sutdy;

import java.util.Arrays;

class s37_1 {
	class Solution {
	    public int[] solution(int n, int[] numList) {
	        return Arrays.stream(numList)  				// 1. 배열을 스트림으로 변환
	        		.filter(value -> value % n == 0)	// 2. n으로 나누어 떨어지는 값만 필터링
	        		.toArray();							// 3. 필터링된 결과를 배열로 변환하여 반환
	    }	
	}
}

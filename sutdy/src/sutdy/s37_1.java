package sutdy;

import java.util.Arrays;

class s37_1 {
	class Solution {
	    public int[] solution(int n, int[] numList) {
	        return Arrays.stream(numList).filter(value -> value % n == 0).toArray();
	    }
	}
}

package sutdy;

import java.util.Arrays;

class s27 {

	class Solution {
	    public int solution(int[] array) {
	        int answer = 0;
	        Arrays.sort(array);
	        answer = array.length / 2;
	        
	        return array[answer];
	    }
	}
	
}

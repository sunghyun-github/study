package sutdy;

class s41_1 {
	class Solution {
	    public int solution(int[] num_list) {
	        int answer = 0;

	        int sum  = 0;
	        int mult = 1;

	        for(int i : num_list) {
	            sum += i;
	            mult *= i;
	        }
	        answer = Math.pow(sum,2) > mult ? 1 : 0;
	        
	        return answer;
	    }
	}
}

package sutdy;

class s33 {
	class Solution {
	    public int[] solution(int money) {
	        int[] answer = new int[2];
	        int ame = 5500;
	        
	        answer[0] = money / ame;
	        answer[1] = money % ame;
	        
	        return answer;
	    }
	}
}

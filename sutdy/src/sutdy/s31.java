package sutdy;

class s31 {
	class Solution {
	    public int solution(int price) {
	        int answer = price;
	        if(price >= 500000) {
	            answer = price * 80/100;
	        } else if (price >= 300000) {
	            answer = price * 90/100;
	        } else if (price >= 100000) {
	            answer = price * 95/100;
	        }
	        return answer;
	    }
	}
}

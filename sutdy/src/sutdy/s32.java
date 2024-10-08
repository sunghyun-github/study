package sutdy;

class s32 {
//	class Solution {
//	    public int solution(int price) {
//	        int answer = price;
//	        if(price >= 500000) {
//	            answer = price * 80/100;
//	        } else if (price >= 300000) {
//	            answer = price * 90/100;
//	        } else if (price >= 100000) {
//	            answer = price * 95/100;
//	        }
//	        return answer;
//	    }
//	}
	
	class Solution {
	    public int solution(int price) {
	        int answer = 0;

	        if(price>=500000) return (int)(price*0.8);
	        if(price>=300000) return (int)(price*0.9);
	        if(price>=100000) return (int)(price*0.95);

	        return price;
	    }
	}
}

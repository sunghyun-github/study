package sutdy;

class s42 {
	class Solution {
	    public int solution(int a, int b) {
	        // a ⊕ b 계산
	        int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
	        // 2 * a * b 계산
	        int multiply = 2 * a * b;
	        
	        // ab와 multiply를 비교 후 더 큰 값 반환
	        if (ab >= multiply) {
	            return ab;
	        } else {
	            return multiply;
	        }
	    }
	}

}

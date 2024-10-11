package sutdy;

class s36 {
	class Solution {
	    public int[] solution(int[] array) {
	        int max = array[0];
	        int index = 0;
	        
	        for(int i = 0; i < array.length; i++) {
	            if(array[i] > max) { // 더큰값을 발견하면
	                max = array[i]; // 최대값을 업데이트
	                index = i; // 현재 인덱스값을 저장 
	            }

	        }
	        // 최대값, 인덱스를 배열에 담아 변환
	        return new int[] {max, index};
	    }
	}
}

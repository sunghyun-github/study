package sutdy;

class s41 {
	class Solution {
	    public int solution(int[] num_list) {
	        int answer = 0;
	        int hap = 0;
	        int gop = 1;
	        
	        for(int i = 0; i < num_list.length; i++) {
	            gop *=  num_list[i];
	            hap +=  num_list[i];
	        }
	        if (gop < hap*hap) {
	            answer = 1;
	        } else if(gop > hap*hap) {
	            answer = 0;
	        } 
	        
	        return answer;
	    }
	}
}

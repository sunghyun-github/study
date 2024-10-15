package sutdy;

class s43_1 {
	class Solution {
	    public int solution(int a, int b) {
	        int answer = 0;
	        
	        // 문자열로 받아서 + 후 long으로 저장 , ex) "12" + "34" = "1234"인데 long로 1234로 저장됨 
	        // 경우의 수가 많아지면 int로는 메모리가 부족하기 때문에 Long으로 받아줌
	        // 약간의 편법이지만 String.valueOf(a) 이 부분을 ("" + a + b) 와같이 수정해줄 수 도 있음 아래에 직접 해보겠음. 
	        // long ab = Long.parseLong(String.valueOf(a) + String.valueOf(b));
	        long ab = Long.parseLong("" +a+b);
	        
	        long ba = Long.parseLong(String.valueOf(b) + String.valueOf(a));
	        
	        if (ab >= ba) {
	            answer = (int) ab;
	        } else if (ab < ba) {
	            answer = (int) ba;
	        }
	        return answer;
	    }
	}
}

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        // equals = 문자열을 비교할 때는 equals를 사용
        if(str2.contains(str1)) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}
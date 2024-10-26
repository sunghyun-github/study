class Solution {
    public String solution(String n_str) {
        
        // [] 밖에서 사용하면 ^는 문자열의 시작
        // [] 안에서 사용하면 not
        String answer = n_str.replaceFirst("^0+", "");
        
        return answer;
    }
}
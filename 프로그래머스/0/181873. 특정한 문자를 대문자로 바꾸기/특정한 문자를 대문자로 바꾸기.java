class Solution {
    public String solution(String my_string, String alp) {
        // my_string에서 alp와 동일한 모든 문자를 대문자로 변환
        String answer = my_string.replace(alp, alp.toUpperCase());
        
        return answer;
    }
}

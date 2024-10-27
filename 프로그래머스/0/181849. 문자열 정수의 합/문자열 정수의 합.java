class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        for (int i = 0; i < num_str.length(); i++) {
            int num = Character.getNumericValue(num_str.charAt(i));  // 문자 숫자를 정수로 변환
            answer += num;  // 각 자리수의 합을 answer에 더하기
        }
        
        return answer;
    }
}

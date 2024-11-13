class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n); // 숫자 -> 문자열
        int[] answer = new int[str.length()]; // 문자열길이만큼 배열 초기화
        
        for(int i=0;i<str.length(); i++) {
            // 마지막 문자를 가져옴 , -'0'을 하므로써 int 변환
            answer[i] = str.charAt(str.length() - 1 - i) - '0';
        }
        return answer;
    }
}
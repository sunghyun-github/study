class Solution {
    public String[] solution(String my_string) {
        // 정규 표현식을 사용하여 공백을 기준으로 문자열을 나눔
        // \\s는 모든 공백 문자(스페이스, 탭 등)를 의미하고, +는 하나 이상을 의미
        String[] answer = my_string.trim().split("\\s+");
        return answer;
    }
}

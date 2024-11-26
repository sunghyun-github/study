class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                answer.append((char) ((c - 'a' + n) % 26 + 'a'));
            } else if (Character.isUpperCase(c)) {
                answer.append((char) ((c - 'A' + n) % 26 + 'A'));
            } else {
                answer.append(c); // 공백이나 다른 문자 그대로 유지
            }
        }

        return answer.toString();
    }
}

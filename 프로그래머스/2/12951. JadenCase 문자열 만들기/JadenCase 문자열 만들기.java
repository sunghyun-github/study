class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 공백으로 문자열을 쪼개지 않고, 하나씩 접근하면서 변환하기 위해 char 배열을 생성
        char[] chars = s.toCharArray();
        
        // 첫 번째 문자를 검사해 대문자 또는 소문자로 설정
        for (int i = 0; i < chars.length; i++) {
            // 첫 문자이거나 공백 이후 첫 문자일 때
            if (i == 0 || chars[i - 1] == ' ') {
                // 현재 문자가 소문자라면 대문자로 변환
                if (Character.isLowerCase(chars[i])) {
                    chars[i] = Character.toUpperCase(chars[i]);
                }
            } else {
                // 첫 문자가 아닌 경우, 소문자로 설정
                if (Character.isUpperCase(chars[i])) {
                    chars[i] = Character.toLowerCase(chars[i]);
                }
            }
        }
        
        // char 배열을 다시 문자열로 변환
        answer = new String(chars);
        return answer;
    }
}

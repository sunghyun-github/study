class Solution {
    public int solution(String myString, String pat) {
        // 문자열을 변환하기 위해 StringBuilder 사용
        StringBuilder transformed = new StringBuilder();
        
        // myString의 각 문자를 변환하여 StringBuilder에 추가
        for (char ch : myString.toCharArray()) {
            if (ch == 'A') {
                transformed.append('B');
            } else if (ch == 'B') {
                transformed.append('A');
            } else {
                transformed.append(ch);
            }
        }
        
        // 변환된 문자열에서 pat이 포함되어 있는지 확인
        if (transformed.toString().contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}

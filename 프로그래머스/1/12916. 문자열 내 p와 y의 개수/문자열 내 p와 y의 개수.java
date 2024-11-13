class Solution {
    boolean solution(String s) {
        // 'p'와 'y'의 개수를 저장할 변수
        int pcount = 0;
        int ycount = 0;

        // 문자열을 소문자로 변환하여 반복문을 통해 각 문자를 확인
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // 각 문자를 가져옴
            if (ch == 'p') {
                pcount++;
            } else if (ch == 'y') {
                ycount++;
            }
        }

        // 'p'와 'y'의 개수가 같으면 true, 아니면 false 반환
        return pcount == ycount;
    }
}

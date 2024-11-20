class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int lengthP = p.length();
        long numP = Long.parseLong(p); // p를 숫자로 변환

        for (int i = 0; i <= t.length() - lengthP; i++) {
            String sub = t.substring(i, i + lengthP); // 부분 문자열 추출
            long numSub = Long.parseLong(sub); // 부분 문자열을 숫자로 변환

            if (numSub <= numP) { // 비교
                answer++;
            }
        }

        return answer;
    }
}

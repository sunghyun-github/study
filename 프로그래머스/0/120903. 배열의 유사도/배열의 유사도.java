class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(int i = 0; i < s1.length; i++) {
            for(int j = 0; j < s2.length; j++) {
                // ==는 객체의 주소를 비교
                // 문자열의 내용을 비교하려면 equals를 사용
                if (s1[i].equals(s2[j])) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
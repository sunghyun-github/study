package sutdy;

class s21 {
	public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];  // strlist와 같은 길이의 배열 생성
        
        // 각 문자열의 길이를 계산해서 배열에 저장
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();  // 각 문자열의 길이를 배열에 저장
        }
        
        return answer;  // 길이 배열 반환
    }
}
package sutdy;


class s55 {
	public String solution(String myString) {
		// StringBuilder는 문자열을 자주 변경(추가, 수정)해야 하는 경우에 유리
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < myString.length(); i++) {
            char currentChar = myString.charAt(i);
            
            if(currentChar < 'l') {
                answer.append('l');
            } else {
                answer.append(currentChar);
            }
        }
        //toString()을 사용해야 최종적으로 문자열(String) 타입으로 반환할 수 있음
        return answer.toString();
    }
}
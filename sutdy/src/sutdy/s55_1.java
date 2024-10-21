package sutdy;


class s55_1 {
	public String solution(String myString) {
		
		// ^는 not 즉 l-z까지를 제외한 모든 문자를 가리킴
        return myString.replaceAll("[^l-z]", "l");
    }
}
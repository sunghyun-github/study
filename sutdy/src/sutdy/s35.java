package sutdy;

class s35 {
	class Solution {
		public String solution(String my_string) {
			StringBuilder answer = new StringBuilder(); //결과 저장할 StringBuilder 

			for (int i = 0; i < my_string.length(); i++) {
				char c = my_string.charAt(i); // 각 문자열을 하나씩 가져옴

				// 대문자 => 소문자
				if (Character.isUpperCase(c)) {
					answer.append(Character.toLowerCase(c));
				}

				// 소문자 => 대문자
				else if(Character.isLowerCase(c)) {
					answer.append(Character.toUpperCase(c));
				}
			}
			return answer.toString();
		}
	}
}

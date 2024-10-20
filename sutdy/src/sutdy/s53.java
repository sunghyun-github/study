package sutdy;


class s53 {
	public int[] solution(int start_num, int end_num) {
		// 먼저 받을 answer 의 크기를 맞춰줌 ex) 5 - 3 은 3,4,5이므로 마지막 +1 해줌
		int[] answer = new int[end_num - start_num + 1 ];

		for (int i = 0; i < answer.length; i++ ){
			answer[i] = start_num + i;
		}
		return answer;
	}
}
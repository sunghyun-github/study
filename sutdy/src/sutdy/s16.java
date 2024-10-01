package sutdy;

class s16 {
	public int[] solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i< num_list.length; i++){
            if(num_list[i] % 2 == 0 ){
                odd++;
            } else if (num_list[i] % 2 == 1) {
                even++;
            }    
        }
        int[] answer = {odd, even};
        return answer;
    }
}
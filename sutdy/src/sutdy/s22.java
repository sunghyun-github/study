package sutdy;

class s22 {
	public int solution(int n) {
        int answer = 0;
        
        // n이 음수일 경우 제곱수가 아님
        if (n < 0){
            answer = 2;
        }
        
        // n의 제곱근을 구하고, 제곱근을 정수로 변환
        int sqrt = (int) Math.sqrt(n);
        
        // sqrt * sqrt를 계산하여 원래의 수 n과 비교
        if(sqrt * sqrt == n){
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i); // 약수를 리스트에 추가
            }
        }
        
        // ArrayList를 배열로 변환
        int[] answer = new int[divisors.size()];
        for (int i = 0; i < divisors.size(); i++) {
            answer[i] = divisors.get(i);
        }
        
        return answer;
    }
}

class Solution {
    public int solution(int[] numbers) {
        int totalsum = 45;
        int sum = 0;
        
        for (int num : numbers)
            sum += num;
        
        return totalsum - sum;
    }
}
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        answer = findCombinations(nums, 0, 0, 0);
        return answer;
    }

    private int findCombinations(int[] nums, int start, int count, int sum) {
        // 3개의 숫자를 고른 경우
        if (count == 3) {
            return isPrime(sum) ? 1 : 0;
        }
        
        int total = 0;
        for (int i = start; i < nums.length; i++) {
            total += findCombinations(nums, i + 1, count + 1, sum + nums[i]);
        }
        return total;
    }

    // 소수 판별 함수
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

class Solution {
    public int solution(int number, int limit, int power) {
        int totalWeight = 0;

        for (int i = 1; i <= number; i++) {
            int divisorCount = 0;

            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    divisorCount++;
                    if (j != i / j) {
                        divisorCount++;
                    }
                }
            }

            // 제한 수치를 초과한 경우, 제한된 공격력을 사용
            if (divisorCount > limit) {
                totalWeight += power;
            } else {
                totalWeight += divisorCount;
            }
        }

        return totalWeight;
    }
}

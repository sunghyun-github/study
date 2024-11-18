class Solution {
    public long solution(int price, int money, int count) {
        // 등차수열의 합 공식을 사용하여 총 이용료 계산
        long totalCost = (long) price * count * (count + 1) / 2;

        // 부족한 금액 계산
        long deficit = totalCost - money;

        // 금액이 부족하지 않으면 0 반환
        return deficit > 0 ? deficit : 0;
    }
}

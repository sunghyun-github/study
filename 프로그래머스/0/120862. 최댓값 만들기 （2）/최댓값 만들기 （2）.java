import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        // 배열을 오름차순으로 정렬
        Arrays.sort(numbers);
        
        // 배열 [1, 2, -3, -5, -2]가 있을 때, 정렬하면 [-5, -3, -2, 1, 2]가 됩니다.
        
        // 가장 큰 양수 두 개의 곱
        int product1 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        // 가장 작은 음수 두 개의 곱
        int product2 = numbers[0] * numbers[1];
        
        // 두 곱 중에서 더 큰 값을 반환
        return Math.max(product1, product2);
    }
}

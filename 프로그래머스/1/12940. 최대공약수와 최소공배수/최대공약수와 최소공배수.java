class Solution {
    public int[] solution(int n, int m) {
        int gcd = getGCD(n, m); // 최대공약수 계산
        int lcm = (n * m) / gcd; // 최소공배수 계산
        return new int[]{gcd, lcm}; // 결과 반환
    }
    
    // 최대공약수를 계산하는 유클리드 알고리즘
    private int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

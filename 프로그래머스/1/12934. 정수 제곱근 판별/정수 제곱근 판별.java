class Solution {
    public long solution(long n) {
        // sqrt는 제곱근 메서드
        long x = (long) Math.sqrt(n);
        return (x * x == n) ? (x + 1) * (x + 1) : -1;
    }
}

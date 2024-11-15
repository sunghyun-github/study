class Solution {
    public int solution(int num) {
        if (num == 1) return 0; // 입력값이 1인 경우 바로 0 반환

        long n = num; // long 자료형으로 변경하여 오버플로우 방지
        int cnt = 0;

        while (cnt < 500) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            cnt++;
            if (n == 1) {
                return cnt; // n이 1이 되면 작업 횟수 반환
            }
        }

        return -1; // 500번 반복해도 1이 되지 않으면 -1 반환
    }
}

package sutdy;


class Solution {
    public int solution(int slice, int n) {
        // n명을 먹이기 위해 필요한 피자의 최소 판 수
        return (n + slice - 1) / slice;
    }
}

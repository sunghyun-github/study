import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 0; // 페인트칠 횟수
        int i = 0;     // section 배열 인덱스

        while (i < section.length) {
            int start = section[i];       // 이번에 칠할 시작 위치
            int end = start + m - 1;      // 롤러로 커버할 마지막 위치

            count++;                      // 한 번 칠함

            // end 이하인 구역은 이번에 모두 칠해졌으므로 건너뛴다
            while (i < section.length && section[i] <= end) {
                i++;
            }
        }

        return count;
    }
}

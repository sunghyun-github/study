import java.util.HashSet;

public class Solution {
    public int solution(int[] nums) {
        
        HashSet<Integer> uniqueTypes = new HashSet<>();
        for (int num : nums) {
            uniqueTypes.add(num); // 중복 제거
        }

        // 고유한 폰켓몬의 수
        int uniqueCount = uniqueTypes.size();
        // 선택 가능한 최대 폰켓몬 수
        int maxPick = nums.length / 2;

        // 둘 중 작은 값을 반환
        return Math.min(uniqueCount, maxPick);
    }
}

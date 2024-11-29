import java.util.TreeSet;

class Solution {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> sumSet = new TreeSet<>(); // 중복 제거 및 정렬을 위한 TreeSet
        
        // 두 수를 선택해 합 계산
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sumSet.add(numbers[i] + numbers[j]);
            }
        }
        
        // 결과를 배열로 변환
        int[] answer = new int[sumSet.size()];
        int index = 0;
        for (int num : sumSet) {
            answer[index++] = num;
        }
        
        return answer;
    }
}

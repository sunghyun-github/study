class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();

        // 0번은 물이므로 1부터 시작
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            for (int j = 0; j < count; j++) {
                left.append(i);
            }
        }

        // 오른쪽 배치를 위해 반전
        String right = left.reverse().toString();

        // 최종 배치: 왼쪽 + 물(0) + 오른쪽
        return left.reverse().append("0").append(right).toString();
    }
}

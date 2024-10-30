class Solution {
    public int[] solution(int[] arr) {
        // X 배열에 필요한 총 길이를 계산
        int length = 0;
        for (int a : arr) {
            length += a;
        }
        
        // 결과 배열 X 생성
        int[] answer = new int[length];
        int index = 0;
        
        // arr의 각 원소를 탐색하여 필요한 만큼 X 배열에 추가
        for (int a : arr) {
            for (int i = 0; i < a; i++) {
                answer[index++] = a;
            }
        }
        
        return answer;
    }
}

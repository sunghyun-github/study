class Solution {
    public String[] solution(String[] names) {
        // 필요한 배열의 크기만큼 answer 배열 초기화
        String[] answer = new String[(names.length + 4) / 5];
        
        // 5명씩 건너뛰며 첫 번째 사람들만 answer 배열에 추가
        for (int i = 0, index = 0; i < names.length; i += 5) {
            answer[index++] = names[i];
        }
        
        return answer;
    }
}

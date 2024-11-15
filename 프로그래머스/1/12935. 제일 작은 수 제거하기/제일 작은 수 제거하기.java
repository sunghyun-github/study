class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1}; 

        }
        int min = arr[0];
        for (int num : arr) {
            min = Math.min(min, num); 
        }

        int count = 0;
        for (int num : arr) {
            if (num != min) {
                count++;
            }
        }

        // 새로운 배열 생성 (가장 작은 수를 제외한 값들만 담기)
        int[] answer = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num != min) {
                answer[index++] = num; // 가장 작은 수를 제외한 원소들 answer 배열에 넣기
            }
        }

        return answer; // 결과 배열 반환
    }
}

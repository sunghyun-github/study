class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arr1_len = arr1.length;
        int arr2_len = arr2.length;
        
        if (arr2_len > arr1_len) {
            answer = -1;
        } else if (arr2_len < arr1_len) {
            answer = 1;
        } else {
            // 배열의 길이가 같은 경우 각 배열의 원소 합을 비교
            int sum1 = 0;
            int sum2 = 0;
            
            for (int num : arr1) {
                sum1 += num;
            }
            for (int num : arr2) {
                sum2 += num;
            }
            
            if (sum2 > sum1) {
                answer = -1;
            } else if (sum2 < sum1) {
                answer = 1;
            } else {
                answer = 0;
            }
        }
        
        return answer;
    }
}

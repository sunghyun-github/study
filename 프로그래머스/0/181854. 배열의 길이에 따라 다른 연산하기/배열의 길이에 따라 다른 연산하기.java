class Solution {
    public int[] solution(int[] arr, int n) {
        // clone하여 원본배열을 건들지 않음
        int[] answer = arr.clone();
        
        if(arr.length % 2 == 1) {
            for(int i = 0; i<arr.length; i+=2){
                answer[i] += n; 
            }
        } else {
            for(int i = 1; i<arr.length; i+=2){
                answer[i] += n; 
            }
        }
        return answer;
    }
}
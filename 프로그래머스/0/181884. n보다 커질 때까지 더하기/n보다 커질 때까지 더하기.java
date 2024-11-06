class Solution {
    public int solution(int[] numbers, int n) {
        int hap = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            hap += numbers[i];
            if(hap > n) {
                return hap;
            }
        }
        
        return hap;
    }
}
class Solution {
    public int solution(int[] num_list) {
        int haphol = 0;
        int hapjjak = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            if(i % 2 == 0) {
                haphol += num_list[i];
            } else if(i % 2 == 1) {
                hapjjak += num_list[i];
            }
        }
        return haphol > hapjjak ? haphol : hapjjak;
    }
}
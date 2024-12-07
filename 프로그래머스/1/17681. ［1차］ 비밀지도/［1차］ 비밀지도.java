class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            int combined = arr1[i] | arr2[i];
            
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((combined & (1 << (n - j - 1))) != 0) {
                    row.append("#");
                } else {
                    row.append(" ");
                }
            }
            answer[i] = row.toString();
        }

        return answer;
    }
}

class Solution {
    public int solution(int n) {
      
        StringBuilder ternary = new StringBuilder();
        while (n > 0) {
            ternary.append(n % 3);
            n /= 3;
        }
        
        int answer = 0;
        String reversedTernary = ternary.toString();
        for (int i = 0; i < reversedTernary.length(); i++) {
            answer += (reversedTernary.charAt(i) - '0') * Math.pow(3, reversedTernary.length() - i - 1);
        }
        
        return answer;
    }
}

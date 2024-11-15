class Solution {
    public boolean solution(int x) {
        int sum = 0;
        String xS = String.valueOf(x);
        
        for(int i=0; i<xS.length(); i++) {
            sum += xS.charAt(i) - '0';
        }
        
        return x % sum == 0;
    }
}
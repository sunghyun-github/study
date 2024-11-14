class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        String findName = "Kim";
        
        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals(findName)) {
                 answer = String.format("김서방은 %d에 있다", i);
                break;
            }
        }
        return answer;
    }
}
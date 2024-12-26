class Solution {
  public int solution(int n) {
      int answer = 0;
      for(int i = 2; i <= n; i++){
          int j = 2;
          int cnt = 0;
          while(j <= (int)Math.sqrt(i)){
              if(i % j == 0){
                cnt += 1;
                break;
              } 
              j += 1;
          }
          if(cnt == 0) answer += 1;
      }
      return answer;
  }
}
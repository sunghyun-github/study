class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int yang = 12000*n;
        int drink = 2000*k;
        
        // 10인분 = 음료수 1서비스
        // 양꼬치 1인분 12,000원
        // 음료수 1개   2,000원
        int freedrink = n / 10;
        drink -= 2000 * freedrink;
        
        return answer = yang + drink;
    }
}
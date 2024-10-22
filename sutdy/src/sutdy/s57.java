package sutdy;


class s57 {
	public int solution(int n, int k) {
        int answer = 0;
        int yang = 12000*n;
        int drink = 2000*k;
        
        int freedrink = n / 10;
        drink -= 2000 * freedrink;
        
        return answer = yang + drink;
    }
}
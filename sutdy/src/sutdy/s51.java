package sutdy;


class s51 {
    public int solution(int[] box, int n) {
        // 각 차원에서 들어갈 수 있는 주사위의 개수 계산
        int width = box[0] / n;  // 가로에 들어갈 수 있는 주사위 개수
        int length = box[1] / n; // 세로에 들어갈 수 있는 주사위 개수
        int height = box[2] / n; // 높이에 들어갈 수 있는 주사위 개수
        
        // 전체 들어갈 수 있는 주사위 개수는 각 차원에서 들어갈 수 있는 주사위 개수를 곱한 값
        return width * length * height;
    }
}

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        // 공백으로 구분된 문자열을 분리하여 문자열 배열로 만듭니다.
        String[] numbers = s.split(" ");
        
        // 문자열 배열을 정수로 변환하여 최소값과 최대값을 찾습니다.
        int min = Arrays.stream(numbers).mapToInt(Integer::parseInt).min().getAsInt();
        int max = Arrays.stream(numbers).mapToInt(Integer::parseInt).max().getAsInt();
        
        // "(최소값) (최대값)" 형식으로 문자열을 반환합니다.
        return min + " " + max;
    }
}

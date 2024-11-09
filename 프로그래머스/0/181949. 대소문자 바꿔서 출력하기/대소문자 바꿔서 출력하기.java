import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();  
        StringBuilder result = new StringBuilder();

        // 문자열의 각 문자에 대해 대소문자 변환
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // 대문자인 경우 소문자로 변환
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } 
            // 소문자인 경우 대문자로 변환
            else {
                result.append(Character.toUpperCase(ch));
            }
        }

        // 변환된 문자열 출력
        System.out.println(result.toString());
    }
}

import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        LocalDate date = LocalDate.of(2016, a, b);

        return days[date.getDayOfWeek().getValue() % 7];
    }
}

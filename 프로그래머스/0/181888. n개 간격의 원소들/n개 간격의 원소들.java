import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < num_list.length; i += n) {
            resultList.add(num_list[i]);
        }

//         수동변환 방법, return대신 사용
//         int[] resultArray = new int[resultList.size()];
//         for (int i = 0; i < resultList.size(); i++) {
//             resultArray[i] = resultList.get(i);
//         }
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}

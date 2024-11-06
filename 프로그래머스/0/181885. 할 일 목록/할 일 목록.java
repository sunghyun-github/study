import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> incompleteTasks = new ArrayList<>();

        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) { // 완료되지 않은 일만 추가
                incompleteTasks.add(todo_list[i]);
            }
        }

        return incompleteTasks.toArray(new String[incompleteTasks.size()]);
    }
}

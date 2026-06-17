import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
       ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < intStrs.length; i++) {

            StringBuilder sb = new StringBuilder();
            for (int j = s; j < s + l; j++) {
                sb.append(intStrs[i].charAt(j));

            }

            int num = Integer.parseInt(sb.toString());
            if (k < num) {
                list.add(num);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        ArrayList<String> array = new ArrayList<>();
        String[] temp = myString.split("x");
        for (int i = 0; i < temp.length; i++) {
            if (!temp[i].equals("")) {
            array.add(temp[i]);
            }
        }
        sort(array);
        return array.toArray(new String[0]);
    }
    
    public static void sort(ArrayList<String> myString) {
        
        for (int i = 0; i < myString.size() - 1; i++) {
            int min = i;
      
            for (int j = i + 1; j < myString.size(); j++) {
                // 같으면 0  크면 양수 작으면 음수
                if (myString.get(j).compareTo(myString.get(min)) < 0) {
                    min = j;
                }
            }
            
            if (min != i) {
                String temp = myString.get(i);
                myString.set(i, myString.get(min));
                myString.set(min, temp);
            }
        }
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String[] list = new String[n];
        String temp = "";
        
        for (int i = 0; i < n; i++) {
            list[i] = br.readLine();
        }
        
        // 정렬이 된상태라 마지막 인덱스는 확인 불필요
        // 길이비교 , 길이가 같으면 사전순 음수면 정방향 양수면 역방향
        for (int i = 0; i < n -1; i++) {
           for (int j = i + 1; j < n; j++) {
               if (list[i].length() > list[j].length() ||
                  (list[i].length() == list[j].length() && 
                   list[i].compareTo(list[j]) > 0)) {
               temp = list[j];
               list[j] = list[i];
               list[i] = temp;
               }
           } 
        }
        
        // 정렬된 List 중복제거 (Set함수 사용 안했음)
        List<String> newList = new ArrayList<>();
        // 비교를 위해 첫번째 인덱스 값 넣기 안넣으면 if문으로 추가해줘야한다. (i == 0)
        newList.add(list[0]);
        
        for (int i = 1; i < n; i++) {
            if (!list[i].equals(list[i - 1])) {
                newList.add(list[i]);
            }
        }
                   
        for (String s : newList) {
            bw.write(s + "\n");
        }
        
        bw.flush();
    }
}
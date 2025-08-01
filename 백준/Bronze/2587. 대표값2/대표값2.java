import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        List<Integer> list = new ArrayList<>();
        String line;
        
        while ((line = br.readLine()) != null && !line.equals("")) {
            list.add(Integer.parseInt(line));
        }
        
        Collections.sort(list);
        
        // 평균값 구하기
        int max = 0;
        for(int l : list) {
            max += l;
        }
        
        // 중앙값 구하기
        int median = 0;
        if (list.size() % 2 == 0) {
            // 짝수 
            int mid1 = list.get(list.size() / 2);
            int mid2 = list.get(list.size() / 2 - 1);
            median = (mid1 + mid2) / 2;
        } else {
            // 홀수는 딱 정중앙 값
            median = list.get(list.size() / 2);
        }
        
        bw.write(max / list.size() + "\n");
        bw.write(String.valueOf(median));
        bw.flush();
    }
}
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 문자열 -> 숫자타입으로 배열 담기 - > 다시문자열로 바꾸기
        String numbers = br.readLine();
        Long[] list = new Long[numbers.length()];
        
        for (int i = 0; i < list.length; i++) {
            list[i] = Long.parseLong(String.valueOf(numbers.charAt(i)));
        }
        
        Arrays.sort(list, Comparator.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        
        for (long l : list) {
            sb.append(l);
        }
        
        bw.write(sb.toString());
        bw.flush();
    }
}
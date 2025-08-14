import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        // List 타입은 이름 -> IndexOf 찾기가 오래걸려 메모리는 조금 더 쓰지만 Map 선택 조회는 빠르다.
        // 키 : 숫자  밸류 : 이름
        Map<String,String> names = new HashMap<>();
        // 키 : 이름  밸류 : 숫자
        Map<String,String> numbers = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String pokemon = br.readLine();
            names.put(String.valueOf(i + 1), pokemon);
            numbers.put(pokemon, String.valueOf(i + 1));
        }
        
        for (int i = 0; i < m; i++) {
            String check = br.readLine();
      
            if (Character.isDigit(check.charAt(0))) { // 0~9 char타입 숫자인지 확인
                bw.write(names.get(check) + "\n");
            } else {
                bw.write(numbers.get(check) + "\n");
            }
        }
        
        bw.flush();
    }
}

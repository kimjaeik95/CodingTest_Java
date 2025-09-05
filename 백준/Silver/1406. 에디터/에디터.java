import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // abcdyx 1. x 맨끝에 삽입  2. L 왼쪽으로 옮김  3. y 입력
        String keyboard = br.readLine();
        int n = Integer.parseInt(br.readLine());
        List<Character> list = new LinkedList<>();
        
        // 같은 타입이어야 순환가능  String 안됨
        for (int i = 0; i < keyboard.length(); i++) {
            list.add(keyboard.charAt(i));
        }

        ListIterator<Character> cursor = list.listIterator(list.size());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            char c = cmd.charAt(0);

            if (c == 'P') {
                char value = st.nextToken().charAt(0);
                cursor.add(value);
            } else if (c == 'L') {
                if (cursor.hasPrevious()) {
                    cursor.previous();
                }
            } else if (c == 'D') {
                if (cursor.hasNext()) {
                    cursor.next();
                }
            } else if (c == 'B') {
                if (cursor.hasPrevious()) {
                    cursor.previous();
                    cursor.remove();
                }
            }
        }
        
        // 현재 위치 포인터(cursor)**를 알고 있음 → 다음(next) 이동 시 단순 포인터 이동 O(1)
        // for-each 문 자체가 Iterator를 내부적으로 생성해서 순회합니다.
        for (char ch : list) {
            bw.write(ch);
        }
        bw.flush();
      
    }
}

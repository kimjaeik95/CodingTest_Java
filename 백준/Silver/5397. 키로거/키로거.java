import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            LinkedList<Character> list = new LinkedList<>();
            ListIterator<Character> listIterator = list.listIterator();
            List<Character> result = new ArrayList<>();
            String cmd = br.readLine();
            for (int j = 0; j < cmd.length(); j++) {
                if (cmd.charAt(j) == '<') {
                    if (listIterator.hasPrevious()) {   // ← 여기서 true/false 체크
                        listIterator.previous();        // ← 조건 만족 시에만 이동
                    }
                } else if (cmd.charAt(j) == '>') {
                    if (listIterator.hasNext()) {
                        listIterator.next();
                    }
                } else if (cmd.charAt(j) == '-') {
                    if (listIterator.hasPrevious()) {
                        listIterator.previous();
                        listIterator.remove();
                    }
                } else {
                    listIterator.add(cmd.charAt(j));
                }
            }
            
            // 출력 
            for (char c : list) {
                bw.write(c);
            }
            // 줄바꿈
            bw.newLine();
            
            bw.flush();
        }
    }
}